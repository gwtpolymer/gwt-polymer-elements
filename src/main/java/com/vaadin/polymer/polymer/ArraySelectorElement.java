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
public class ArraySelectorElement extends PolymerElement {

    @JsOverlay public static final String TAG = "array-selector";
    @JsOverlay public static final String SRC = "polymer/polymer.html";


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
     * @property multi
     * @type Boolean
     * 
     */
    @JsProperty public native  boolean getMulti();
    /**
     * 
     *
     * JavaScript Info:
     * @property multi
     * @type Boolean
     * 
     */
    @JsProperty public native  void setMulti(boolean value);

    /**
     * 
     *
     * JavaScript Info:
     * @property selected
     * @type Object
     * 
     */
    @JsProperty public native  JavaScriptObject getSelected();
    /**
     * 
     *
     * JavaScript Info:
     * @property selected
     * @type Object
     * 
     */
    @JsProperty public native  void setSelected(JavaScriptObject value);

    /**
     * 
     *
     * JavaScript Info:
     * @property selectedItem
     * @type Object
     * 
     */
    @JsProperty public native  JavaScriptObject getSelectedItem();
    /**
     * 
     *
     * JavaScript Info:
     * @property selectedItem
     * @type Object
     * 
     */
    @JsProperty public native  void setSelectedItem(JavaScriptObject value);

    /**
     * 
     *
     * JavaScript Info:
     * @property toggle
     * @type Boolean
     * 
     */
    @JsProperty public native  boolean getToggle();
    /**
     * 
     *
     * JavaScript Info:
     * @property toggle
     * @type Boolean
     * 
     */
    @JsProperty public native  void setToggle(boolean value);


    /**
     * 
     *
     * JavaScript Info:
     * @method deselect
     * @param {} item  
     * 
     * 
     */
    public native void deselect(Object item);

    /**
     * 
     *
     * JavaScript Info:
     * @method isSelected
     * @param {} item  
     * 
     * 
     */
    public native void isSelected(Object item);

    /**
     * 
     *
     * JavaScript Info:
     * @method select
     * @param {} item  
     * 
     * 
     */
    public native void select(Object item);

    /**
     * 
     *
     * JavaScript Info:
     * @method clearSelection
     * 
     * 
     */
    public native void clearSelection();

}
