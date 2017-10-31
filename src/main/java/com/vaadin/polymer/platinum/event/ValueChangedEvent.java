/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from platinum-bluetooth project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.platinum.event;

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
 * <p>Fired when value gets changed during a notification session.</p>
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
         * <p>value</p>
         */
        @JsProperty  JavaScriptObject getThe();

    }

}
