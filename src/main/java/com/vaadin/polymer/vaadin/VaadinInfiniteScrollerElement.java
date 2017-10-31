/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from vaadin-date-picker project by Vaadin Ltd
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
public class VaadinInfiniteScrollerElement extends PolymerElement {

    @JsOverlay public static final String TAG = "vaadin-infinite-scroller";
    @JsOverlay public static final String SRC = "vaadin-date-picker/vaadin-date-picker.html";


    /**
     * 
     *
     * JavaScript Info:
     * @property active
     * @type boolean
     * 
     */
    @JsProperty public native  boolean getActive();
    /**
     * 
     *
     * JavaScript Info:
     * @property active
     * @type boolean
     * 
     */
    @JsProperty public native  void setActive(boolean value);

    /**
     * <p>Count of individual items in each buffer.<br>The scroller has 2 buffers altogether so bufferSize of 20<br>will result in 40 buffered DOM items in total.<br>Changing after initialization not supported.</p>
     *
     * JavaScript Info:
     * @property bufferSize
     * @type Number
     * 
     */
    @JsProperty public native  double getBufferSize();
    /**
     * <p>Count of individual items in each buffer.<br>The scroller has 2 buffers altogether so bufferSize of 20<br>will result in 40 buffered DOM items in total.<br>Changing after initialization not supported.</p>
     *
     * JavaScript Info:
     * @property bufferSize
     * @type Number
     * 
     */
    @JsProperty public native  void setBufferSize(double value);

    /**
     * <p>Height of individual items (in pixels).<br>Changing after initialization not supported.</p>
     *
     * JavaScript Info:
     * @property itemHeight
     * @type Number
     * 
     */
    @JsProperty public native  double getItemHeight();
    /**
     * <p>Height of individual items (in pixels).<br>Changing after initialization not supported.</p>
     *
     * JavaScript Info:
     * @property itemHeight
     * @type Number
     * 
     */
    @JsProperty public native  void setItemHeight(double value);

    /**
     * <p>Current scroller position as index. Can be a fractional number.</p>
     *
     * JavaScript Info:
     * @property position
     * @type Number
     * 
     */
    @JsProperty public native  double getPosition();
    /**
     * <p>Current scroller position as index. Can be a fractional number.</p>
     *
     * JavaScript Info:
     * @property position
     * @type Number
     * 
     */
    @JsProperty public native  void setPosition(double value);


    /**
     * 
     *
     * JavaScript Info:
     * @method modelForElement
     * @param {} el  
     * @behavior VaadinInfiniteScroller
     * 
     */
    public native void modelForElement(Object el);

    /**
     * 
     *
     * JavaScript Info:
     * @method stamp
     * @param {} model  
     * @behavior VaadinInfiniteScroller
     * 
     */
    public native void stamp(Object model);

    /**
     * 
     *
     * JavaScript Info:
     * @method templatize
     * @param {} template  
     * @behavior VaadinInfiniteScroller
     * 
     */
    public native void templatize(Object template);

}
