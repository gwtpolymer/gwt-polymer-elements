/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from vaadin-grid project by Vaadin Ltd
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
 * <p>Object referencing to a row and it’s data.</p>
 * <p>A <code>Row</code> object is passed as a parameter to the row class generator<br>function.</p>
 * <p>A <code>Row</code> object is also referenced from a <code>Cell</code> object, passed as a<br>parameter to column renderer functions and the cell class generator<br>function.</p>
 */
@JsType(isNative=true)
public interface Row {

    @JsOverlay public static final String NAME = "Row";
    @JsOverlay public static final String SRC = "vaadin-grid/vaadin-grid-doc.html";
    @JsOverlay public default <T> T cast() {
      return (T)this;
    }


    /**
     * <p>Data object of the row, as it is retrieved from the <code>items</code> array or<br>function.</p>
     *
     * JavaScript Info:
     * @property data
     * @type Object
     * 
     */
    @JsProperty  JavaScriptObject getData();
    /**
     * <p>Data object of the row, as it is retrieved from the <code>items</code> array or<br>function.</p>
     *
     * JavaScript Info:
     * @property data
     * @type Object
     * 
     */
    @JsProperty  void setData(JavaScriptObject value);

    /**
     * <p>Reference to the <code>tr</code> element of the row.</p>
     *
     * JavaScript Info:
     * @property element
     * @type HTMLElement
     * 
     */
    @JsProperty  HTMLElement getElement();
    /**
     * <p>Reference to the <code>tr</code> element of the row.</p>
     *
     * JavaScript Info:
     * @property element
     * @type HTMLElement
     * 
     */
    @JsProperty  void setElement(HTMLElement value);

    /**
     * <p>Reference to the grid element/object.</p>
     *
     * JavaScript Info:
     * @property grid
     * @type HTMLElement
     * 
     */
    @JsProperty  HTMLElement getGrid();
    /**
     * <p>Reference to the grid element/object.</p>
     *
     * JavaScript Info:
     * @property grid
     * @type HTMLElement
     * 
     */
    @JsProperty  void setGrid(HTMLElement value);

    /**
     * <p>Index of the row.</p>
     *
     * JavaScript Info:
     * @property index
     * @type number
     * 
     */
    @JsProperty  double getIndex();
    /**
     * <p>Index of the row.</p>
     *
     * JavaScript Info:
     * @property index
     * @type number
     * 
     */
    @JsProperty  void setIndex(double value);


}
