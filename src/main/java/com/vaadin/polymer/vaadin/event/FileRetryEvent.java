/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from vaadin-upload project by Vaadin Ltd
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
 * <p>Fired when the retry button is pressed. It is listened by <code>vaadin-upload</code><br>which will start a new upload process of this file.</p>
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Event")
public class FileRetryEvent extends PolymerEvent {

    @JsOverlay public static final String NAME = "file-retry";

    public FileRetryEvent(EventInit eventInitDict) {
        super(NAME, eventInitDict);
    }

    public FileRetryEvent() {
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
         * <p>file to retry upload of</p>
         */
        @JsProperty  JavaScriptObject getFile();

    }

}
