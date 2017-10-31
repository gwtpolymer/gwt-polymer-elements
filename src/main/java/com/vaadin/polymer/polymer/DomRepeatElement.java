/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from polymer project by The Polymer Authors (http://polymer.github.io/AUTHORS.txt)
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.polymer;

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
public class DomRepeatElement extends PolymerElement {

    @JsOverlay public static final String TAG = "dom-repeat";
    @JsOverlay public static final String SRC = "polymer/polymer.html";


    /**
     * 
     *
     * JavaScript Info:
     * @property initialCount
     * @type Number
     * 
     */
    @JsProperty public native  double getInitialCount();
    /**
     * 
     *
     * JavaScript Info:
     * @property initialCount
     * @type Number
     * 
     */
    @JsProperty public native  void setInitialCount(double value);

    /**
     * 
     *
     * JavaScript Info:
     * @property items
     * @type Array
     * 
     */
    @JsProperty public native <E> Array<E> getItems();
    /**
     * 
     *
     * JavaScript Info:
     * @property items
     * @type Array
     * 
     */
    @JsProperty public native <E> void setItems(Array<E> value);

    /**
     * 
     *
     * JavaScript Info:
     * @property notifyDomChange
     * @type Boolean
     * 
     */
    @JsProperty public native  boolean getNotifyDomChange();
    /**
     * 
     *
     * JavaScript Info:
     * @property notifyDomChange
     * @type Boolean
     * 
     */
    @JsProperty public native  void setNotifyDomChange(boolean value);

    /**
     * 
     *
     * JavaScript Info:
     * @property delay
     * @type number
     * 
     */
    @JsProperty public native  double getDelay();
    /**
     * 
     *
     * JavaScript Info:
     * @property delay
     * @type number
     * 
     */
    @JsProperty public native  void setDelay(double value);

    /**
     * 
     *
     * JavaScript Info:
     * @property renderedItemCount
     * @type Number
     * 
     */
    @JsProperty public native  double getRenderedItemCount();
    /**
     * 
     *
     * JavaScript Info:
     * @property renderedItemCount
     * @type Number
     * 
     */
    @JsProperty public native  void setRenderedItemCount(double value);

    /**
     * 
     *
     * JavaScript Info:
     * @property targetFramerate
     * @type Number
     * 
     */
    @JsProperty public native  double getTargetFramerate();
    /**
     * 
     *
     * JavaScript Info:
     * @property targetFramerate
     * @type Number
     * 
     */
    @JsProperty public native  void setTargetFramerate(double value);

    /**
     * 
     *
     * JavaScript Info:
     * @property filter
     * @type Function
     * 
     */
    @JsProperty public native  PolymerFunction getFilter();
    /**
     * 
     *
     * JavaScript Info:
     * @property filter
     * @type Function
     * 
     */
    @JsProperty public native  void setFilter(PolymerFunction value);

    /**
     * 
     *
     * JavaScript Info:
     * @property sort
     * @type Function
     * 
     */
    @JsProperty public native  PolymerFunction getSort();
    /**
     * 
     *
     * JavaScript Info:
     * @property sort
     * @type Function
     * 
     */
    @JsProperty public native  void setSort(PolymerFunction value);

    /**
     * 
     *
     * JavaScript Info:
     * @property observe
     * @type String
     * 
     */
    @JsProperty public native  String getObserve();
    /**
     * 
     *
     * JavaScript Info:
     * @property observe
     * @type String
     * 
     */
    @JsProperty public native  void setObserve(String value);

    /**
     * 
     *
     * JavaScript Info:
     * @property indexAs
     * @type String
     * 
     */
    @JsProperty public native  String getIndexAs();
    /**
     * 
     *
     * JavaScript Info:
     * @property indexAs
     * @type String
     * 
     */
    @JsProperty public native  void setIndexAs(String value);

    /**
     * 
     *
     * JavaScript Info:
     * @property as
     * @type String
     * 
     */
    @JsProperty public native  String getAs();
    /**
     * 
     *
     * JavaScript Info:
     * @property as
     * @type String
     * 
     */
    @JsProperty public native  void setAs(String value);


    /**
     * 
     *
     * JavaScript Info:
     * @method indexForElement
     * @param {} el  
     * 
     * 
     */
    public native void indexForElement(Object el);

    /**
     * 
     *
     * JavaScript Info:
     * @method keyForElement
     * @param {} el  
     * 
     * 
     */
    public native void keyForElement(Object el);

    /**
     * 
     *
     * JavaScript Info:
     * @method modelForElement
     * @param {} el  
     * 
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

    /**
     * 
     *
     * JavaScript Info:
     * @method itemForElement
     * @param {} el  
     * 
     * 
     */
    public native void itemForElement(Object el);

    /**
     * 
     *
     * JavaScript Info:
     * @method render
     * 
     * 
     */
    public native void render();

}
