/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from neon-animation project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.neon;

import elemental2.dom.*;
import com.google.gwt.core.client.JavaScriptObject;
import elemental2.core.Array;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import com.vaadin.polymer.PolymerFunction;


/**
 * <p>Use <code>Polymer.NeonSharedElementAnimatableBehavior</code> to implement elements containing shared element<br>animations.</p>
 */
@JsType(isNative=true)
public interface NeonSharedElementAnimatableBehavior {

    @JsOverlay public static final String NAME = "Polymer.NeonSharedElementAnimatableBehavior";
    @JsOverlay public static final String SRC = "neon-animation/neon-animation.html";
    @JsOverlay public default <T> T cast() {
      return (T)this;
    }


    /**
     * <p>Animation configuration. See README for more info.</p>
     *
     * JavaScript Info:
     * @property animationConfig
     * @type Object
     * 
     */
    @JsProperty  JavaScriptObject getAnimationConfig();
    /**
     * <p>Animation configuration. See README for more info.</p>
     *
     * JavaScript Info:
     * @property animationConfig
     * @type Object
     * 
     */
    @JsProperty  void setAnimationConfig(JavaScriptObject value);

    /**
     * <p>A map of shared element id to node.</p>
     *
     * JavaScript Info:
     * @property sharedElements
     * @type Object
     * 
     */
    @JsProperty  JavaScriptObject getSharedElements();
    /**
     * <p>A map of shared element id to node.</p>
     *
     * JavaScript Info:
     * @property sharedElements
     * @type Object
     * 
     */
    @JsProperty  void setSharedElements(JavaScriptObject value);

    /**
     * <p>Convenience property for setting an ‘entry’ animation. Do not set <code>animationConfig.entry</code><br>manually if using this. The animated node is set to <code>this</code> if using this property.</p>
     *
     * JavaScript Info:
     * @property entryAnimation
     * @type String
     * 
     */
    @JsProperty  String getEntryAnimation();
    /**
     * <p>Convenience property for setting an ‘entry’ animation. Do not set <code>animationConfig.entry</code><br>manually if using this. The animated node is set to <code>this</code> if using this property.</p>
     *
     * JavaScript Info:
     * @property entryAnimation
     * @type String
     * 
     */
    @JsProperty  void setEntryAnimation(String value);

    /**
     * <p>Convenience property for setting an ‘exit’ animation. Do not set <code>animationConfig.exit</code><br>manually if using this. The animated node is set to <code>this</code> if using this property.</p>
     *
     * JavaScript Info:
     * @property exitAnimation
     * @type String
     * 
     */
    @JsProperty  String getExitAnimation();
    /**
     * <p>Convenience property for setting an ‘exit’ animation. Do not set <code>animationConfig.exit</code><br>manually if using this. The animated node is set to <code>this</code> if using this property.</p>
     *
     * JavaScript Info:
     * @property exitAnimation
     * @type String
     * 
     */
    @JsProperty  void setExitAnimation(String value);


}
