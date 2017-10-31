/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from vaadin-pouchdb project by Manolo Carrasco Moñino <manolo@apache.org>
 * that is licensed with Apache license.
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
public interface DbRow {

    @JsOverlay public static final String NAME = "DbRow";
    @JsOverlay public static final String SRC = "vaadin-pouchdb/vaadin-pouchdb.html";
    @JsOverlay public default <T> T cast() {
      return (T)this;
    }


    /**
     * 
     *
     * JavaScript Info:
     * @property doc
     * @type Object
     * 
     */
    @JsProperty  JavaScriptObject getDoc();
    /**
     * 
     *
     * JavaScript Info:
     * @property doc
     * @type Object
     * 
     */
    @JsProperty  void setDoc(JavaScriptObject value);


}
