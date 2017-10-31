/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-ripple project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.paper;

import elemental2.dom.HTMLElement;
import elemental2.dom.Element;
import com.google.gwt.core.client.JavaScriptObject;
import elemental2.core.Array;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import com.vaadin.polymer.PolymerElement;
import com.vaadin.polymer.PolymerFunction;

/**
 * <p>Material design: <a href="https://www.google.com/design/spec/animation/responsive-interaction.html#responsive-interaction-surface-reaction">Surface reaction</a></p>
 * <p><code>paper-ripple</code> provides a visual effect that other paper elements can<br>use to simulate a rippling effect emanating from the point of contact.  The<br>effect can be visualized as a concentric circle with motion.</p>
 * <p>Example:</p>
 * <pre><code>&lt;div style=&quot;position:relative&quot;&gt;
 *   &lt;paper-ripple&gt;&lt;/paper-ripple&gt;
 * &lt;/div&gt;
 * 
 * 
 * </code></pre><p>Note, it’s important that the parent container of the ripple be relative position, otherwise<br>the ripple will emanate outside of the desired container.</p>
 * <p><code>paper-ripple</code> listens to “mousedown” and “mouseup” events so it would display ripple<br>effect when touches on it.  You can also defeat the default behavior and<br>manually route the down and up actions to the ripple element.  Note that it is<br>important if you call <code>downAction()</code> you will have to make sure to call<br><code>upAction()</code> so that <code>paper-ripple</code> would end the animation loop.</p>
 * <p>Example:</p>
 * <pre><code>&lt;paper-ripple id=&quot;ripple&quot; style=&quot;pointer-events: none;&quot;&gt;&lt;/paper-ripple&gt;
 * ...
 * downAction: function(e) {
 *   this.$.ripple.downAction({detail: {x: e.x, y: e.y}});
 * },
 * upAction: function(e) {
 *   this.$.ripple.upAction();
 * }
 * 
 * 
 * </code></pre><p>Styling ripple effect:</p>
 * <p>  Use CSS color property to style the ripple:</p>
 * <pre><code>paper-ripple {
 *   color: #4285f4;
 * }
 * 
 * 
 * </code></pre><p>  Note that CSS color property is inherited so it is not required to set it on<br>  the <code>paper-ripple</code> element directly.</p>
 * <p>By default, the ripple is centered on the point of contact.  Apply the <code>recenters</code><br>attribute to have the ripple grow toward the center of its container.</p>
 * <pre><code>&lt;paper-ripple recenters&gt;&lt;/paper-ripple&gt;
 * 
 * 
 * </code></pre><p>You can also  center the ripple inside its container from the start.</p>
 * <pre><code>&lt;paper-ripple center&gt;&lt;/paper-ripple&gt;
 * 
 * 
 * </code></pre><p>Apply <code>circle</code> class to make the rippling effect within a circle.</p>
 * <pre><code>&lt;paper-ripple class=&quot;circle&quot;&gt;&lt;/paper-ripple&gt;
 * 
 * 
 * </code></pre>
 */
@JsType(isNative=true, namespace = JsPackage.GLOBAL, name = "HTMLElement")
public class PaperRippleElement extends PolymerElement {

    @JsOverlay public static final String TAG = "paper-ripple";
    @JsOverlay public static final String SRC = "paper-ripple/paper-ripple.html";


    /**
     * <p>The initial opacity set on the wave.</p>
     *
     * JavaScript Info:
     * @property initialOpacity
     * @type Number
     * 
     */
    @JsProperty public native  double getInitialOpacity();
    /**
     * <p>The initial opacity set on the wave.</p>
     *
     * JavaScript Info:
     * @property initialOpacity
     * @type Number
     * 
     */
    @JsProperty public native  void setInitialOpacity(double value);

    /**
     * 
     *
     * JavaScript Info:
     * @property keyBindings
     * @type Object
     * 
     */
    @JsProperty public native  JavaScriptObject getKeyBindings();
    /**
     * 
     *
     * JavaScript Info:
     * @property keyBindings
     * @type Object
     * 
     */
    @JsProperty public native  void setKeyBindings(JavaScriptObject value);

    /**
     * <p>How fast (opacity per second) the wave fades out.</p>
     *
     * JavaScript Info:
     * @property opacityDecayVelocity
     * @type Number
     * 
     */
    @JsProperty public native  double getOpacityDecayVelocity();
    /**
     * <p>How fast (opacity per second) the wave fades out.</p>
     *
     * JavaScript Info:
     * @property opacityDecayVelocity
     * @type Number
     * 
     */
    @JsProperty public native  void setOpacityDecayVelocity(double value);

    /**
     * <p>A list of the visual ripples.</p>
     *
     * JavaScript Info:
     * @property ripples
     * @type Array
     * 
     */
    @JsProperty public native <E> Array<E> getRipples();
    /**
     * <p>A list of the visual ripples.</p>
     *
     * JavaScript Info:
     * @property ripples
     * @type Array
     * 
     */
    @JsProperty public native <E> void setRipples(Array<E> value);

    /**
     * <p>The EventTarget that will be firing relevant KeyboardEvents. Set it to<br><code>null</code> to disable the listeners.</p>
     *
     * JavaScript Info:
     * @property keyEventTarget
     * @type ?EventTarget
     * @behavior VaadinDatePicker
     */
    @JsProperty public native  JavaScriptObject getKeyEventTarget();
    /**
     * <p>The EventTarget that will be firing relevant KeyboardEvents. Set it to<br><code>null</code> to disable the listeners.</p>
     *
     * JavaScript Info:
     * @property keyEventTarget
     * @type ?EventTarget
     * @behavior VaadinDatePicker
     */
    @JsProperty public native  void setKeyEventTarget(JavaScriptObject value);

    /**
     * <p>If true, the ripple will remain in the “down” state until <code>holdDown</code><br>is set to false again.</p>
     *
     * JavaScript Info:
     * @property holdDown
     * @type Boolean
     * 
     */
    @JsProperty public native  boolean getHoldDown();
    /**
     * <p>If true, the ripple will remain in the “down” state until <code>holdDown</code><br>is set to false again.</p>
     *
     * JavaScript Info:
     * @property holdDown
     * @type Boolean
     * 
     */
    @JsProperty public native  void setHoldDown(boolean value);

    /**
     * <p>If true, ripples will exhibit a gravitational pull towards<br>the center of their container as they fade away.</p>
     *
     * JavaScript Info:
     * @property recenters
     * @type Boolean
     * 
     */
    @JsProperty public native  boolean getRecenters();
    /**
     * <p>If true, ripples will exhibit a gravitational pull towards<br>the center of their container as they fade away.</p>
     *
     * JavaScript Info:
     * @property recenters
     * @type Boolean
     * 
     */
    @JsProperty public native  void setRecenters(boolean value);

    /**
     * <p>If true, this property will cause the implementing element to<br>automatically stop propagation on any handled KeyboardEvents.</p>
     *
     * JavaScript Info:
     * @property stopKeyboardEventPropagation
     * @type Boolean
     * @behavior VaadinDatePicker
     */
    @JsProperty public native  boolean getStopKeyboardEventPropagation();
    /**
     * <p>If true, this property will cause the implementing element to<br>automatically stop propagation on any handled KeyboardEvents.</p>
     *
     * JavaScript Info:
     * @property stopKeyboardEventPropagation
     * @type Boolean
     * @behavior VaadinDatePicker
     */
    @JsProperty public native  void setStopKeyboardEventPropagation(boolean value);

    /**
     * <p>If true, ripples will center inside its container</p>
     *
     * JavaScript Info:
     * @property center
     * @type Boolean
     * 
     */
    @JsProperty public native  boolean getCenter();
    /**
     * <p>If true, ripples will center inside its container</p>
     *
     * JavaScript Info:
     * @property center
     * @type Boolean
     * 
     */
    @JsProperty public native  void setCenter(boolean value);

    /**
     * <p>True when there are visible ripples animating within the<br>element.</p>
     *
     * JavaScript Info:
     * @property animating
     * @type Boolean
     * 
     */
    @JsProperty public native  boolean getAnimating();
    /**
     * <p>True when there are visible ripples animating within the<br>element.</p>
     *
     * JavaScript Info:
     * @property animating
     * @type Boolean
     * 
     */
    @JsProperty public native  void setAnimating(boolean value);

    /**
     * <p>If true, the ripple will not generate a ripple effect<br>via pointer interaction.<br>Calling ripple’s imperative api like <code>simulatedRipple</code> will<br>still generate the ripple effect.</p>
     *
     * JavaScript Info:
     * @property noink
     * @type Boolean
     * 
     */
    @JsProperty public native  boolean getNoink();
    /**
     * <p>If true, the ripple will not generate a ripple effect<br>via pointer interaction.<br>Calling ripple’s imperative api like <code>simulatedRipple</code> will<br>still generate the ripple effect.</p>
     *
     * JavaScript Info:
     * @property noink
     * @type Boolean
     * 
     */
    @JsProperty public native  void setNoink(boolean value);


    /**
     * 
     *
     * JavaScript Info:
     * @method removeRipple
     * @param {} ripple  
     * 
     * 
     */
    public native void removeRipple(Object ripple);

    /**
     * <p>Can be used to imperatively add a key binding to the implementing<br>element. This is the imperative equivalent of declaring a keybinding<br>in the <code>keyBindings</code> prototype property.</p>
     *
     * JavaScript Info:
     * @method addOwnKeyBinding
     * @param {} eventString  
     * @param {} handlerName  
     * @behavior VaadinDatePicker
     * 
     */
    public native void addOwnKeyBinding(Object eventString, Object handlerName);

    /**
     * <p>This conflicts with Element#antimate().<br><a href="https://developer.mozilla.org/en-US/docs/Web/API/Element/animate">https://developer.mozilla.org/en-US/docs/Web/API/Element/animate</a></p>
     *
     * JavaScript Info:
     * @method animate
     * 
     * 
     */
    public native void animate();

    /**
     * 
     *
     * JavaScript Info:
     * @method onAnimationComplete
     * 
     * 
     */
    public native void onAnimationComplete();

    /**
     * 
     *
     * JavaScript Info:
     * @method simulatedRipple
     * 
     * 
     */
    public native void simulatedRipple();

    /**
     * 
     *
     * JavaScript Info:
     * @method addRipple
     * 
     * 
     */
    public native void addRipple();

    /**
     * <p>When called, will remove all imperatively-added key bindings.</p>
     *
     * JavaScript Info:
     * @method removeOwnKeyBindings
     * @behavior VaadinDatePicker
     * 
     */
    public native void removeOwnKeyBindings();

    /**
     * <p>Provokes a ripple down effect via a UI event,<br><em>not</em> respecting the <code>noink</code> property.</p>
     *
     * JavaScript Info:
     * @method downAction
     * @param {Event=} event  
     * 
     * 
     */
    public native void downAction(JavaScriptObject event);

    /**
     * <p>Provokes a ripple up effect via a UI event,<br><em>not</em> respecting the <code>noink</code> property.</p>
     *
     * JavaScript Info:
     * @method upAction
     * @param {Event=} event  
     * 
     * 
     */
    public native void upAction(JavaScriptObject event);

    /**
     * <p>Provokes a ripple up effect via a UI event,<br>respecting the <code>noink</code> property.</p>
     *
     * JavaScript Info:
     * @method uiUpAction
     * @param {Event=} event  
     * 
     * 
     */
    public native void uiUpAction(JavaScriptObject event);

    /**
     * <p>Provokes a ripple down effect via a UI event,<br>respecting the <code>noink</code> property.</p>
     *
     * JavaScript Info:
     * @method uiDownAction
     * @param {Event=} event  
     * 
     * 
     */
    public native void uiDownAction(JavaScriptObject event);

    /**
     * <p>Returns true if a keyboard event matches <code>eventString</code>.</p>
     *
     * JavaScript Info:
     * @method keyboardEventMatchesKeys
     * @param {KeyboardEvent} event  
     * @param {string} eventString  
     * @behavior VaadinDatePicker
     * @return {boolean}
     */
    public native boolean keyboardEventMatchesKeys(JavaScriptObject event, String eventString);

}
