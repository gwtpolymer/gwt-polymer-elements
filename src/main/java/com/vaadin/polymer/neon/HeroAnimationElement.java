/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from neon-animation project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.neon;

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
 * <p><code>&lt;hero-animation&gt;</code> is a shared element animation that scales and transform an element such that it<br>appears to be shared between two pages. Use this in <code>&lt;neon-animated-pages&gt;</code>. The source page<br>should use this animation in an ‘exit’ animation and set the <code>fromPage</code> configuration property to<br>itself, and the destination page should use this animation in an <code>entry</code> animation and set the<br><code>toPage</code> configuration property to itself. They should also define the hero elements in the<br><code>sharedElements</code> property (not a configuration property, see<br><code>Polymer.NeonSharedElementAnimatableBehavior</code>).</p>
 * <p>Configuration:</p>
 * <pre><code>{
 *   name: &#39;hero-animation&#39;,
 *   id: &lt;shared-element-id&gt;,
 *   timing: &lt;animation-timing&gt;,
 *   toPage: &lt;node&gt;, /* define for the destination page * /
 *   fromPage: &lt;node&gt;, /* define for the source page * /
 * }
 * </code></pre>
 */
@JsType(isNative=true, namespace = JsPackage.GLOBAL, name = "HTMLElement")
public class HeroAnimationElement extends PolymerElement {

    @JsOverlay public static final String TAG = "hero-animation";
    @JsOverlay public static final String SRC = "neon-animation/neon-animations.html";


    /**
     * <p>Defines the animation timing.</p>
     *
     * JavaScript Info:
     * @property animationTiming
     * @type Object
     * 
     */
    @JsProperty public native  JavaScriptObject getAnimationTiming();
    /**
     * <p>Defines the animation timing.</p>
     *
     * JavaScript Info:
     * @property animationTiming
     * @type Object
     * 
     */
    @JsProperty public native  void setAnimationTiming(JavaScriptObject value);

    /**
     * <p>Can be used to determine that elements implement this behavior.</p>
     *
     * JavaScript Info:
     * @property isNeonAnimation
     * @type boolean
     * 
     */
    @JsProperty public native  boolean getIsNeonAnimation();
    /**
     * <p>Can be used to determine that elements implement this behavior.</p>
     *
     * JavaScript Info:
     * @property isNeonAnimation
     * @type boolean
     * 
     */
    @JsProperty public native  void setIsNeonAnimation(boolean value);

    /**
     * <p>Cached copy of shared elements.</p>
     *
     * JavaScript Info:
     * @property sharedElements
     * @type Object
     * 
     */
    @JsProperty public native  JavaScriptObject getSharedElements();
    /**
     * <p>Cached copy of shared elements.</p>
     *
     * JavaScript Info:
     * @property sharedElements
     * @type Object
     * 
     */
    @JsProperty public native  void setSharedElements(JavaScriptObject value);


    /**
     * 
     *
     * JavaScript Info:
     * @method complete
     * @param {} config  
     * 
     * 
     */
    public native void complete(Object config);

    /**
     * <p>Sets <code>transform</code> and <code>transformOrigin</code> properties along with the prefixed versions.</p>
     *
     * JavaScript Info:
     * @method setPrefixedProperty
     * @param {} node  
     * @param {} property  
     * @param {} value  
     * @behavior PaperMenuShrinkHeightAnimation
     * 
     */
    public native void setPrefixedProperty(Object node, Object property, Object value);

    /**
     * <p>Returns the animation timing by mixing in properties from <code>config</code> to the defaults defined<br>by the animation.</p>
     *
     * JavaScript Info:
     * @method timingFromConfig
     * @param {} config  
     * 
     * 
     */
    public native void timingFromConfig(Object config);

    /**
     * <p>Finds shared elements based on <code>config</code>.</p>
     *
     * JavaScript Info:
     * @method findSharedElements
     * @param {} config  
     * 
     * 
     */
    public native void findSharedElements(Object config);

    /**
     * <p>Called when the animation finishes.</p>
     *
     * JavaScript Info:
     * @method complete
     * @behavior ReverseRippleAnimation
     * 
     */
    public native void complete();

}
