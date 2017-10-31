/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-tooltip project by The Polymer Authors
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
 * <p>Material design: <a href="https://www.google.com/design/spec/components/tooltips.html">Tooltips</a></p>
 * <p><code>&lt;paper-tooltip&gt;</code> is a label that appears on hover and focus when the user<br>hovers over an element with the cursor or with the keyboard. It will be centered<br>to an anchor element specified in the <code>for</code> attribute, or, if that doesn’t exist,<br>centered to the parent node containing it. Note that as of <code>paper-tooltip#2.0.0</code>,<br>you must explicitely include the <code>web-animations</code> polyfill if you want this<br>element to work on browsers not implementing the WebAnimations spec.</p>
 * <p>Example:<br>    // polyfill<br>    <link rel="import" href="../../neon-animation/web-animations.html"></p>
 * <pre><code>&lt;div style=&quot;display:inline-block&quot;&gt;
 *   &lt;button&gt;Click me!&lt;/button&gt;
 *   &lt;paper-tooltip&gt;Tooltip text&lt;/paper-tooltip&gt;
 * &lt;/div&gt;
 * 
 * &lt;div&gt;
 *   &lt;button id=&quot;btn&quot;&gt;Click me!&lt;/button&gt;
 *   &lt;paper-tooltip for=&quot;btn&quot;&gt;Tooltip text&lt;/paper-tooltip&gt;
 * &lt;/div&gt;
 * 
 * 
 * </code></pre><p>The tooltip can be positioned on the top|bottom|left|right of the anchor using<br>the <code>position</code> attribute. The default position is bottom.</p>
 * <pre><code>&lt;paper-tooltip for=&quot;btn&quot; position=&quot;left&quot;&gt;Tooltip text&lt;/paper-tooltip&gt;
 * &lt;paper-tooltip for=&quot;btn&quot; position=&quot;top&quot;&gt;Tooltip text&lt;/paper-tooltip&gt;
 * 
 * 
 * </code></pre><h3 id="styling">Styling</h3>
 * <p>The following custom properties and mixins are available for styling:</p>
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
 * <td><code>--paper-tooltip-background</code></td>
 * <td>The background color of the tooltip</td>
 * <td><code>#616161</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-tooltip-opacity</code></td>
 * <td>The opacity of the tooltip</td>
 * <td><code>0.9</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-tooltip-text-color</code></td>
 * <td>The text color of the tooltip</td>
 * <td><code>white</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-tooltip</code></td>
 * <td>Mixin applied to the tooltip</td>
 * <td><code>{}</code></td>
 * </tr>
 * </tbody>
 * </table>
 */
@JsType(isNative=true, namespace = JsPackage.GLOBAL, name = "HTMLElement")
public class PaperTooltipElement extends PolymerElement {

    @JsOverlay public static final String TAG = "paper-tooltip";
    @JsOverlay public static final String SRC = "paper-tooltip/paper-tooltip.html";


    /**
     * <p>The entry and exit animations that will be played when showing and<br>hiding the tooltip. If you want to override this, you must ensure<br>that your animationConfig has the exact format below.</p>
     *
     * JavaScript Info:
     * @property animationConfig
     * @type Object
     * 
     */
    @JsProperty public native  JavaScriptObject getAnimationConfig();
    /**
     * <p>The entry and exit animations that will be played when showing and<br>hiding the tooltip. If you want to override this, you must ensure<br>that your animationConfig has the exact format below.</p>
     *
     * JavaScript Info:
     * @property animationConfig
     * @type Object
     * 
     */
    @JsProperty public native  void setAnimationConfig(JavaScriptObject value);

    /**
     * <p>If true, no parts of the tooltip will ever be shown offscreen.</p>
     *
     * JavaScript Info:
     * @property fitToVisibleBounds
     * @type Boolean
     * 
     */
    @JsProperty public native  boolean getFitToVisibleBounds();
    /**
     * <p>If true, no parts of the tooltip will ever be shown offscreen.</p>
     *
     * JavaScript Info:
     * @property fitToVisibleBounds
     * @type Boolean
     * 
     */
    @JsProperty public native  void setFitToVisibleBounds(boolean value);

    /**
     * <p>Set this to true if you want to manually control when the tooltip<br>is shown or hidden.</p>
     *
     * JavaScript Info:
     * @property manualMode
     * @type Boolean
     * 
     */
    @JsProperty public native  boolean getManualMode();
    /**
     * <p>Set this to true if you want to manually control when the tooltip<br>is shown or hidden.</p>
     *
     * JavaScript Info:
     * @property manualMode
     * @type Boolean
     * 
     */
    @JsProperty public native  void setManualMode(boolean value);

    /**
     * <p>This property is deprecated, but left over so that it doesn’t<br>break exiting code. Please use <code>offset</code> instead. If both <code>offset</code> and<br><code>marginTop</code> are provided, <code>marginTop</code> will be ignored.</p>
     *
     * JavaScript Info:
     * @property marginTop
     * @type Number
     * 
     */
    @JsProperty public native  double getMarginTop();
    /**
     * <p>This property is deprecated, but left over so that it doesn’t<br>break exiting code. Please use <code>offset</code> instead. If both <code>offset</code> and<br><code>marginTop</code> are provided, <code>marginTop</code> will be ignored.</p>
     *
     * JavaScript Info:
     * @property marginTop
     * @type Number
     * 
     */
    @JsProperty public native  void setMarginTop(double value);

    /**
     * <p>The spacing between the top of the tooltip and the element it is<br>anchored to.</p>
     *
     * JavaScript Info:
     * @property offset
     * @type Number
     * 
     */
    @JsProperty public native  double getOffset();
    /**
     * <p>The spacing between the top of the tooltip and the element it is<br>anchored to.</p>
     *
     * JavaScript Info:
     * @property offset
     * @type Number
     * 
     */
    @JsProperty public native  void setOffset(double value);

    /**
     * <p>The delay that will be applied before the <code>entry</code> animation is<br>played when showing the tooltip.</p>
     *
     * JavaScript Info:
     * @property animationDelay
     * @type Number
     * 
     */
    @JsProperty public native  double getAnimationDelay();
    /**
     * <p>The delay that will be applied before the <code>entry</code> animation is<br>played when showing the tooltip.</p>
     *
     * JavaScript Info:
     * @property animationDelay
     * @type Number
     * 
     */
    @JsProperty public native  void setAnimationDelay(double value);

    /**
     * <p>Convenience property for setting an ‘entry’ animation. Do not set <code>animationConfig.entry</code><br>manually if using this. The animated node is set to <code>this</code> if using this property.</p>
     *
     * JavaScript Info:
     * @property entryAnimation
     * @type String
     * @behavior PaperTooltip
     */
    @JsProperty public native  String getEntryAnimation();
    /**
     * <p>Convenience property for setting an ‘entry’ animation. Do not set <code>animationConfig.entry</code><br>manually if using this. The animated node is set to <code>this</code> if using this property.</p>
     *
     * JavaScript Info:
     * @property entryAnimation
     * @type String
     * @behavior PaperTooltip
     */
    @JsProperty public native  void setEntryAnimation(String value);

    /**
     * <p>Convenience property for setting an ‘exit’ animation. Do not set <code>animationConfig.exit</code><br>manually if using this. The animated node is set to <code>this</code> if using this property.</p>
     *
     * JavaScript Info:
     * @property exitAnimation
     * @type String
     * @behavior PaperTooltip
     */
    @JsProperty public native  String getExitAnimation();
    /**
     * <p>Convenience property for setting an ‘exit’ animation. Do not set <code>animationConfig.exit</code><br>manually if using this. The animated node is set to <code>this</code> if using this property.</p>
     *
     * JavaScript Info:
     * @property exitAnimation
     * @type String
     * @behavior PaperTooltip
     */
    @JsProperty public native  void setExitAnimation(String value);

    /**
     * <p>Positions the tooltip to the top, right, bottom, left of its content.</p>
     *
     * JavaScript Info:
     * @property position
     * @type String
     * 
     */
    @JsProperty public native  String getPosition();
    /**
     * <p>Positions the tooltip to the top, right, bottom, left of its content.</p>
     *
     * JavaScript Info:
     * @property position
     * @type String
     * 
     */
    @JsProperty public native  void setPosition(String value);

    /**
     * <p>The id of the element that the tooltip is anchored to. This element<br>must be a sibling of the tooltip.</p>
     *
     * JavaScript Info:
     * @property for
     * @type String
     * 
     */
    @JsProperty public native  String getFor();
    /**
     * <p>The id of the element that the tooltip is anchored to. This element<br>must be a sibling of the tooltip.</p>
     *
     * JavaScript Info:
     * @property for
     * @type String
     * 
     */
    @JsProperty public native  void setFor(String value);


    /**
     * 
     *
     * JavaScript Info:
     * @method hide
     * 
     * 
     */
    public native void hide();

    /**
     * 
     *
     * JavaScript Info:
     * @method updatePosition
     * 
     * 
     */
    public native void updatePosition();

    /**
     * 
     *
     * JavaScript Info:
     * @method show
     * 
     * 
     */
    public native void show();

    /**
     * <p>Cancels the currently running animations.</p>
     *
     * JavaScript Info:
     * @method cancelAnimation
     * @behavior PaperTooltip
     * 
     */
    public native void cancelAnimation();

    /**
     * <p>Plays an animation with an optional <code>type</code>.</p>
     *
     * JavaScript Info:
     * @method playAnimation
     * @param {string=} type  
     * @param {!Object=} cookie  
     * @behavior PaperTooltip
     * 
     */
    public native void playAnimation(String type, JavaScriptObject cookie);

}
