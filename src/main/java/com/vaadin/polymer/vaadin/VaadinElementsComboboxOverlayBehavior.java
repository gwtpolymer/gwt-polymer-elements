/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from vaadin-combo-box project by Vaadin Ltd
 * that is licensed with Apache-2.0 license.
 */
package com.vaadin.polymer.vaadin;

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
public interface VaadinElementsComboboxOverlayBehavior {

    @JsOverlay public static final String NAME = "vaadin.elements.combobox.OverlayBehavior";
    @JsOverlay public static final String SRC = "vaadin-combo-box/vaadin-combo-box.html";
    @JsOverlay public default <T> T cast() {
      return (T)this;
    }


    /**
     * <p>The element to position/align the dropdown by.</p>
     *
     * JavaScript Info:
     * @property positionTarget
     * @type Object
     * 
     */
    @JsProperty  JavaScriptObject getPositionTarget();
    /**
     * <p>The element to position/align the dropdown by.</p>
     *
     * JavaScript Info:
     * @property positionTarget
     * @type Object
     * 
     */
    @JsProperty  void setPositionTarget(JavaScriptObject value);

    /**
     * <p>Vertical offset for the overlay position.</p>
     *
     * JavaScript Info:
     * @property verticalOffset
     * @type Number
     * 
     */
    @JsProperty  double getVerticalOffset();
    /**
     * <p>Vertical offset for the overlay position.</p>
     *
     * JavaScript Info:
     * @property verticalOffset
     * @type Number
     * 
     */
    @JsProperty  void setVerticalOffset(double value);


}
