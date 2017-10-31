/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from vaadin-combo-box project by Vaadin Ltd
 * that is licensed with Apache-2.0 license.
 */
package com.vaadin.polymer.vaadin;

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
 * 
 */
@JsType(isNative=true, namespace = JsPackage.GLOBAL, name = "HTMLElement")
public class VaadinComboBoxItemElement extends PolymerElement {

    @JsOverlay public static final String TAG = "vaadin-combo-box-item";
    @JsOverlay public static final String SRC = "vaadin-combo-box/vaadin-combo-box.html";


    /**
     * <p>True when item is focused</p>
     *
     * JavaScript Info:
     * @property focused
     * @type Boolean
     * 
     */
    @JsProperty public native  boolean getFocused();
    /**
     * <p>True when item is focused</p>
     *
     * JavaScript Info:
     * @property focused
     * @type Boolean
     * 
     */
    @JsProperty public native  void setFocused(boolean value);

    /**
     * <p>The index of the item</p>
     *
     * JavaScript Info:
     * @property index
     * @type number
     * 
     */
    @JsProperty public native  double getIndex();
    /**
     * <p>The index of the item</p>
     *
     * JavaScript Info:
     * @property index
     * @type number
     * 
     */
    @JsProperty public native  void setIndex(double value);

    /**
     * <p>The item to render</p>
     *
     * JavaScript Info:
     * @property item
     * @type (String|Object)
     * 
     */
    @JsProperty public native  Object getItem();
    /**
     * <p>The item to render</p>
     *
     * JavaScript Info:
     * @property item
     * @type (String|Object)
     * 
     */
    @JsProperty public native  void setItem(Object value);

    /**
     * <p>True when item is selected</p>
     *
     * JavaScript Info:
     * @property selected
     * @type Boolean
     * 
     */
    @JsProperty public native  boolean getSelected();
    /**
     * <p>True when item is selected</p>
     *
     * JavaScript Info:
     * @property selected
     * @type Boolean
     * 
     */
    @JsProperty public native  void setSelected(boolean value);

    /**
     * <p>The text label corresponding to the item</p>
     *
     * JavaScript Info:
     * @property label
     * @type string
     * 
     */
    @JsProperty public native  String getLabel();
    /**
     * <p>The text label corresponding to the item</p>
     *
     * JavaScript Info:
     * @property label
     * @type string
     * 
     */
    @JsProperty public native  void setLabel(String value);


}
