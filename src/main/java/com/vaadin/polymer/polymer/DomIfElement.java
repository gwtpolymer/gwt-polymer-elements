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
public class DomIfElement extends PolymerElement {

    @JsOverlay public static final String TAG = "dom-if";
    @JsOverlay public static final String SRC = "polymer/polymer.html";


    /**
     * 
     *
     * JavaScript Info:
     * @property if
     * @type Boolean
     * 
     */
    @JsProperty public native  boolean getIf();
    /**
     * 
     *
     * JavaScript Info:
     * @property if
     * @type Boolean
     * 
     */
    @JsProperty public native  void setIf(boolean value);

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
     * @property restamp
     * @type Boolean
     * 
     */
    @JsProperty public native  boolean getRestamp();
    /**
     * 
     *
     * JavaScript Info:
     * @property restamp
     * @type Boolean
     * 
     */
    @JsProperty public native  void setRestamp(boolean value);


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
     * @method stamp
     * @param {} model  
     * 
     * 
     */
    public native void stamp(Object model);

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
