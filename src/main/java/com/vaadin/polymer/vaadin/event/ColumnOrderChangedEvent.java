/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from vaadin-grid project by Vaadin Ltd
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
 * <p>A change in the column order.</p>
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Event")
public class ColumnOrderChangedEvent extends PolymerEvent {

    @JsOverlay public static final String NAME = "column-order-changed";

    public ColumnOrderChangedEvent(EventInit eventInitDict) {
        super(NAME, eventInitDict);
    }

    public ColumnOrderChangedEvent() {
        super(NAME);
    }


}
