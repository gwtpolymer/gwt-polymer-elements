/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from vaadin-date-picker project by Vaadin Ltd
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
 * <p>Fired when the value changes.</p>
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Event")
public class ValueChangedEvent extends PolymerEvent {

    @JsOverlay public static final String NAME = "value-changed";

    public ValueChangedEvent(EventInit eventInitDict) {
        super(NAME, eventInitDict);
    }

    public ValueChangedEvent() {
        super(NAME);
    }


    @Override
    @JsProperty
    public native Detail getDetail();

    @JsType(isNative=true)
    public interface Detail extends PolymerEvent.Detail {

        /**
         * 
         */
        @JsProperty  JavaScriptObject getDetail();

        /**
         * <p>the date value or an empty <code>String</code>.</p>
         */
        @JsProperty  String getValue();

    }

}
