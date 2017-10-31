/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-behaviors project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.paper;

import elemental2.dom.*;
import com.google.gwt.core.client.JavaScriptObject;
import elemental2.core.Array;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import com.vaadin.polymer.PolymerFunction;


/**
 * <p><code>Polymer.PaperInkyFocusBehavior</code> implements a ripple when the element has keyboard focus.</p>
 */
@JsType(isNative=true)
public interface PaperInkyFocusBehavior {

    @JsOverlay public static final String NAME = "Polymer.PaperInkyFocusBehavior";
    @JsOverlay public static final String SRC = "paper-behaviors/paper-checked-element-behavior.html";
    @JsOverlay public default <T> T cast() {
      return (T)this;
    }


    /**
     * <p>If true, the element will not produce a ripple effect when interacted<br>with via the pointer.</p>
     *
     * JavaScript Info:
     * @property noink
     * @type Boolean
     * 
     */
    @JsProperty  boolean getNoink();
    /**
     * <p>If true, the element will not produce a ripple effect when interacted<br>with via the pointer.</p>
     *
     * JavaScript Info:
     * @property noink
     * @type Boolean
     * 
     */
    @JsProperty  void setNoink(boolean value);


    /**
     * <p>Returns the <code>&lt;paper-ripple&gt;</code> element used by this element to create<br>ripple effects. The element’s ripple is created on demand, when<br>necessary, and calling this method will force the<br>ripple to be created.</p>
     *
     * JavaScript Info:
     * @method getRipple
     * 
     * 
     */
     void getRipple();

    /**
     * <p>Returns true if this element currently contains a ripple effect.</p>
     *
     * JavaScript Info:
     * @method hasRipple
     * 
     * @return {boolean}
     */
     boolean hasRipple();

    /**
     * <p>Ensures this element contains a ripple effect. For startup efficiency<br>the ripple effect is dynamically on demand when needed.</p>
     *
     * JavaScript Info:
     * @method ensureRipple
     * @param {!Event=} optTriggeringEvent  
     * 
     * 
     */
     void ensureRipple(JavaScriptObject optTriggeringEvent);

}
