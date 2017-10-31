/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-button project by The Polymer Authors
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
 * <p>Material design: <a href="https://www.google.com/design/spec/components/buttons.html">Buttons</a></p>
 * <p><code>paper-button</code> is a button. When the user touches the button, a ripple effect emanates<br>from the point of contact. It may be flat or raised. A raised button is styled with a<br>shadow.</p>
 * <p>Example:</p>
 * <pre><code>&lt;paper-button&gt;Flat button&lt;/paper-button&gt;
 * &lt;paper-button raised&gt;Raised button&lt;/paper-button&gt;
 * &lt;paper-button noink&gt;No ripple effect&lt;/paper-button&gt;
 * &lt;paper-button toggles&gt;Toggle-able button&lt;/paper-button&gt;
 * 
 * 
 * </code></pre><p>A button that has <code>toggles</code> true will remain <code>active</code> after being clicked (and<br>will have an <code>active</code> attribute set). For more information, see the <code>Polymer.IronButtonState</code><br>behavior.</p>
 * <p>You may use custom DOM in the button body to create a variety of buttons. For example, to<br>create a button with an icon and some text:</p>
 * <pre><code>&lt;paper-button&gt;
 *   &lt;iron-icon icon=&quot;favorite&quot;&gt;&lt;/iron-icon&gt;
 *   custom button content
 * &lt;/paper-button&gt;
 * 
 * 
 * </code></pre><p>To use <code>paper-button</code> as a link, wrap it in an anchor tag. Since <code>paper-button</code> will already<br>receive focus, you may want to prevent the anchor tag from receiving focus as well by setting<br>its tabindex to -1.</p>
 * <pre><code>&lt;a href=&quot;https://www.polymer-project.org/&quot; tabindex=&quot;-1&quot;&gt;
 *   &lt;paper-button raised&gt;Polymer Project&lt;/paper-button&gt;
 * &lt;/a&gt;
 * 
 * 
 * </code></pre><h3 id="styling">Styling</h3>
 * <p>Style the button with CSS as you would a normal DOM element.</p>
 * <pre><code>paper-button.fancy {
 *   background: green;
 *   color: yellow;
 * }
 * 
 * paper-button.fancy:hover {
 *   background: lime;
 * }
 * 
 * paper-button[disabled],
 * paper-button[toggles][active] {
 *   background: red;
 * }
 * 
 * 
 * </code></pre><p>By default, the ripple is the same color as the foreground at 25% opacity. You may<br>customize the color using the <code>--paper-button-ink-color</code> custom property.</p>
 * <p>The following custom properties and mixins are also available for styling:</p>
 * <table>
 * <thead>
 * <tr>
 * <th>Custom property</th>
 * <th>Description</th>
 * <th>Default</th>
 * </tr>
 * </thead>
 * <tbody>
 * <tr>
 * <td><code>--paper-button-ink-color</code></td>
 * <td>Background color of the ripple</td>
 * <td><code>Based on the button&#39;s color</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-button</code></td>
 * <td>Mixin applied to the button</td>
 * <td><code>{}</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-button-disabled</code></td>
 * <td>Mixin applied to the disabled button. Note that you can also use the <code>paper-button[disabled]</code> selector</td>
 * <td><code>{}</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-button-flat-keyboard-focus</code></td>
 * <td>Mixin applied to a flat button after it’s been focused using the keyboard</td>
 * <td><code>{}</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-button-raised-keyboard-focus</code></td>
 * <td>Mixin applied to a raised button after it’s been focused using the keyboard</td>
 * <td><code>{}</code></td>
 * </tr>
 * </tbody>
 * </table>
 */
@JsType(isNative=true, namespace = JsPackage.GLOBAL, name = "HTMLElement")
public class PaperButtonElement extends PolymerElement {

    @JsOverlay public static final String TAG = "paper-button";
    @JsOverlay public static final String SRC = "paper-button/paper-button.html";


    /**
     * <p>If true, the button should be styled with a shadow.</p>
     *
     * JavaScript Info:
     * @property raised
     * @type Boolean
     * 
     */
    @JsProperty public native  boolean getRaised();
    /**
     * <p>If true, the button should be styled with a shadow.</p>
     *
     * JavaScript Info:
     * @property raised
     * @type Boolean
     * 
     */
    @JsProperty public native  void setRaised(boolean value);

    /**
     * 
     *
     * JavaScript Info:
     * @property keyBindings
     * @type Object
     * @behavior PaperTab
     */
    @JsProperty public native  JavaScriptObject getKeyBindings();
    /**
     * 
     *
     * JavaScript Info:
     * @property keyBindings
     * @type Object
     * @behavior PaperTab
     */
    @JsProperty public native  void setKeyBindings(JavaScriptObject value);

    /**
     * <p>The z-depth of this element, from 0-5. Setting to 0 will remove the<br>shadow, and each increasing number greater than 0 will be “deeper”<br>than the last.</p>
     *
     * JavaScript Info:
     * @property elevation
     * @type Number
     * @behavior PaperFab
     */
    @JsProperty public native  double getElevation();
    /**
     * <p>The z-depth of this element, from 0-5. Setting to 0 will remove the<br>shadow, and each increasing number greater than 0 will be “deeper”<br>than the last.</p>
     *
     * JavaScript Info:
     * @property elevation
     * @type Number
     * @behavior PaperFab
     */
    @JsProperty public native  void setElevation(double value);

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
     * <p>If true, the user is currently holding down the button.</p>
     *
     * JavaScript Info:
     * @property pressed
     * @type Boolean
     * @behavior PaperTab
     */
    @JsProperty public native  boolean getPressed();
    /**
     * <p>If true, the user is currently holding down the button.</p>
     *
     * JavaScript Info:
     * @property pressed
     * @type Boolean
     * @behavior PaperTab
     */
    @JsProperty public native  void setPressed(boolean value);

    /**
     * <p>True if the input device that caused the element to receive focus<br>was a keyboard.</p>
     *
     * JavaScript Info:
     * @property receivedFocusFromKeyboard
     * @type Boolean
     * @behavior PaperTab
     */
    @JsProperty public native  boolean getReceivedFocusFromKeyboard();
    /**
     * <p>True if the input device that caused the element to receive focus<br>was a keyboard.</p>
     *
     * JavaScript Info:
     * @property receivedFocusFromKeyboard
     * @type Boolean
     * @behavior PaperTab
     */
    @JsProperty public native  void setReceivedFocusFromKeyboard(boolean value);

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
     * <p>If true, the button toggles the active state with each tap or press<br>of the spacebar.</p>
     *
     * JavaScript Info:
     * @property toggles
     * @type Boolean
     * @behavior PaperTab
     */
    @JsProperty public native  boolean getToggles();
    /**
     * <p>If true, the button toggles the active state with each tap or press<br>of the spacebar.</p>
     *
     * JavaScript Info:
     * @property toggles
     * @type Boolean
     * @behavior PaperTab
     */
    @JsProperty public native  void setToggles(boolean value);

    /**
     * <p>If true, the button is a toggle and is currently in the active state.</p>
     *
     * JavaScript Info:
     * @property active
     * @type Boolean
     * @behavior PaperTab
     */
    @JsProperty public native  boolean getActive();
    /**
     * <p>If true, the button is a toggle and is currently in the active state.</p>
     *
     * JavaScript Info:
     * @property active
     * @type Boolean
     * @behavior PaperTab
     */
    @JsProperty public native  void setActive(boolean value);

    /**
     * <p>If true, the element will not produce a ripple effect when interacted<br>with via the pointer.</p>
     *
     * JavaScript Info:
     * @property noink
     * @type Boolean
     * @behavior PaperFab
     */
    @JsProperty public native  boolean getNoink();
    /**
     * <p>If true, the element will not produce a ripple effect when interacted<br>with via the pointer.</p>
     *
     * JavaScript Info:
     * @property noink
     * @type Boolean
     * @behavior PaperFab
     */
    @JsProperty public native  void setNoink(boolean value);

    /**
     * <p>If true, the user cannot interact with this element.</p>
     *
     * JavaScript Info:
     * @property disabled
     * @type Boolean
     * @behavior PaperTab
     */
    @JsProperty public native  boolean getDisabled();
    /**
     * <p>If true, the user cannot interact with this element.</p>
     *
     * JavaScript Info:
     * @property disabled
     * @type Boolean
     * @behavior PaperTab
     */
    @JsProperty public native  void setDisabled(boolean value);

    /**
     * <p>If true, the element currently has focus.</p>
     *
     * JavaScript Info:
     * @property focused
     * @type Boolean
     * @behavior PaperTab
     */
    @JsProperty public native  boolean getFocused();
    /**
     * <p>If true, the element currently has focus.</p>
     *
     * JavaScript Info:
     * @property focused
     * @type Boolean
     * @behavior PaperTab
     */
    @JsProperty public native  void setFocused(boolean value);

    /**
     * <p>True if the element is currently being pressed by a “pointer,” which<br>is loosely defined as mouse or touch input (but specifically excluding<br>keyboard input).</p>
     *
     * JavaScript Info:
     * @property pointerDown
     * @type Boolean
     * @behavior PaperTab
     */
    @JsProperty public native  boolean getPointerDown();
    /**
     * <p>True if the element is currently being pressed by a “pointer,” which<br>is loosely defined as mouse or touch input (but specifically excluding<br>keyboard input).</p>
     *
     * JavaScript Info:
     * @property pointerDown
     * @type Boolean
     * @behavior PaperTab
     */
    @JsProperty public native  void setPointerDown(boolean value);

    /**
     * <p>The aria attribute to be set if the button is a toggle and in the<br>active state.</p>
     *
     * JavaScript Info:
     * @property ariaActiveAttribute
     * @type String
     * @behavior PaperTab
     */
    @JsProperty public native  String getAriaActiveAttribute();
    /**
     * <p>The aria attribute to be set if the button is a toggle and in the<br>active state.</p>
     *
     * JavaScript Info:
     * @property ariaActiveAttribute
     * @type String
     * @behavior PaperTab
     */
    @JsProperty public native  void setAriaActiveAttribute(String value);


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
     * <p>Returns the <code>&lt;paper-ripple&gt;</code> element used by this element to create<br>ripple effects. The element’s ripple is created on demand, when<br>necessary, and calling this method will force the<br>ripple to be created.</p>
     *
     * JavaScript Info:
     * @method getRipple
     * @behavior PaperFab
     * 
     */
    public native void getRipple();

    /**
     * <p>Returns true if this element currently contains a ripple effect.</p>
     *
     * JavaScript Info:
     * @method hasRipple
     * @behavior PaperFab
     * @return {boolean}
     */
    public native boolean hasRipple();

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

    /**
     * <p>Ensures this element contains a ripple effect. For startup efficiency<br>the ripple effect is dynamically on demand when needed.</p>
     *
     * JavaScript Info:
     * @method ensureRipple
     * @param {!Event=} optTriggeringEvent  
     * @behavior PaperTab
     * 
     */
    public native void ensureRipple(JavaScriptObject optTriggeringEvent);

}
