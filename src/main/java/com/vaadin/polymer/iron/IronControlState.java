/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from iron-behaviors project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.iron;

import elemental2.dom.*;
import com.google.gwt.core.client.JavaScriptObject;
import elemental2.core.Array;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import com.vaadin.polymer.PolymerFunction;


/**
 * 
 */
@JsType(isNative=true)
public interface IronControlState {

    @JsOverlay public static final String NAME = "Polymer.IronControlState";
    @JsOverlay public static final String SRC = "iron-behaviors/iron-button-state.html";
    @JsOverlay public default <T> T cast() {
      return (T)this;
    }


    /**
     * <p>If true, the user cannot interact with this element.</p>
     *
     * JavaScript Info:
     * @property disabled
     * @type Boolean
     * 
     */
    @JsProperty  boolean getDisabled();
    /**
     * <p>If true, the user cannot interact with this element.</p>
     *
     * JavaScript Info:
     * @property disabled
     * @type Boolean
     * 
     */
    @JsProperty  void setDisabled(boolean value);

    /**
     * <p>If true, the element currently has focus.</p>
     *
     * JavaScript Info:
     * @property focused
     * @type Boolean
     * 
     */
    @JsProperty  boolean getFocused();
    /**
     * <p>If true, the element currently has focus.</p>
     *
     * JavaScript Info:
     * @property focused
     * @type Boolean
     * 
     */
    @JsProperty  void setFocused(boolean value);


}
