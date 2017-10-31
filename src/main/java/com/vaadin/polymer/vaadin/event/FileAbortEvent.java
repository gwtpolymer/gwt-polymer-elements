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
 * <p>Fired when abort button is pressed. It is listened by <code>vaadin-upload</code> which<br>will abort the upload in progress, but will not remove the file from the list<br>to allow the animation to hide the element to be run.</p>
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Event")
public class FileAbortEvent extends PolymerEvent {

    @JsOverlay public static final String NAME = "file-abort";

    public FileAbortEvent(EventInit eventInitDict) {
        super(NAME, eventInitDict);
    }

    public FileAbortEvent() {
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
         * <p>file to abort upload of</p>
         */
        @JsProperty  JavaScriptObject getFile();

    }

}
