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
 * <p>Fired when a file cannot be added to the queue due to a constrain:<br> file-size, file-type or maxFiles</p>
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Event")
public class FileRejectEvent extends PolymerEvent {

    @JsOverlay public static final String NAME = "file-reject";

    public FileRejectEvent(EventInit eventInitDict) {
        super(NAME, eventInitDict);
    }

    public FileRejectEvent() {
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
         * <p>the file added</p>
         */
        @JsProperty  JavaScriptObject getFile();

        /**
         * <p>the cause</p>
         */
        @JsProperty  JavaScriptObject getError();

    }

}
