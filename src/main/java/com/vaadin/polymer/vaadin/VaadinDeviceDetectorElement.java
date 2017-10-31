/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from vaadin-context-menu project by unknown author
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
public class VaadinDeviceDetectorElement extends PolymerElement {

    @JsOverlay public static final String TAG = "vaadin-device-detector";
    @JsOverlay public static final String SRC = "vaadin-context-menu/vaadin-context-menu.html";


    /**
     * <p><code>true</code>, when running in a phone.</p>
     *
     * JavaScript Info:
     * @property phone
     * @type Boolean
     * 
     */
    @JsProperty public native  boolean getPhone();
    /**
     * <p><code>true</code>, when running in a phone.</p>
     *
     * JavaScript Info:
     * @property phone
     * @type Boolean
     * 
     */
    @JsProperty public native  void setPhone(boolean value);

    /**
     * <p><code>true</code>, when running in a touch device.</p>
     *
     * JavaScript Info:
     * @property touch
     * @type Boolean
     * 
     */
    @JsProperty public native  boolean getTouch();
    /**
     * <p><code>true</code>, when running in a touch device.</p>
     *
     * JavaScript Info:
     * @property touch
     * @type Boolean
     * 
     */
    @JsProperty public native  void setTouch(boolean value);

    /**
     * <p><code>true</code>, when running in a tablet/desktop device.</p>
     *
     * JavaScript Info:
     * @property wide
     * @type Boolean
     * 
     */
    @JsProperty public native  boolean getWide();
    /**
     * <p><code>true</code>, when running in a tablet/desktop device.</p>
     *
     * JavaScript Info:
     * @property wide
     * @type Boolean
     * 
     */
    @JsProperty public native  void setWide(boolean value);


}
