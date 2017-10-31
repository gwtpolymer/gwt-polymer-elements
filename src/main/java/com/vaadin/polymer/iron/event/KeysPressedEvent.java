/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from iron-a11y-keys project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.iron.event;

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
 * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Event")
public class KeysPressedEvent extends PolymerEvent {

    @JsOverlay public static final String NAME = "keys-pressed";

    public KeysPressedEvent(EventInit eventInitDict) {
        super(NAME, eventInitDict);
    }

    public KeysPressedEvent() {
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
         * <p>true if shift key is pressed</p>
         */
        @JsProperty  boolean getShift();

        /**
         * <p>true if ctrl key is pressed</p>
         */
        @JsProperty  boolean getCtrl();

        /**
         * <p>true if meta key is pressed</p>
         */
        @JsProperty  boolean getMeta();

        /**
         * <p>true if alt key is pressed</p>
         */
        @JsProperty  boolean getAlt();

        /**
         * <p>the normalized key</p>
         */
        @JsProperty  String getKey();

    }

}
