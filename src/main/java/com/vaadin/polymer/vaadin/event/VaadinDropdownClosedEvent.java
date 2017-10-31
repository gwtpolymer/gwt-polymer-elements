/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from vaadin-combo-box project by Vaadin Ltd
 * that is licensed with Apache-2.0 license.
 */
package com.vaadin.polymer.vaadin.event;

import elemental2.core.Array;
import com.google.gwt.core.client.JavaScriptObject;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import elemental2.dom.Element;
import com.vaadin.polymer.PolymerEvent;
import elemental2.dom.EventInit;
import elemental2.dom.EventTarget;

/**
 * <p>Fired after the <code>vaadin-dropdown</code> closes.</p>
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Event")
public class VaadinDropdownClosedEvent extends PolymerEvent {

    @JsOverlay public static final String NAME = "vaadin-dropdown-closed";

    public VaadinDropdownClosedEvent(EventInit eventInitDict) {
        super(NAME, eventInitDict);
    }

    public VaadinDropdownClosedEvent() {
        super(NAME);
    }


}