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
 * <p>Fired before the XHR is opened. Could be used for changing the request<br>URL. If the default is prevented, then XHR would not be opened.</p>
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Event")
public class UploadBeforeEvent extends PolymerEvent {

    @JsOverlay public static final String NAME = "upload-before";

    public UploadBeforeEvent(EventInit eventInitDict) {
        super(NAME, eventInitDict);
    }

    public UploadBeforeEvent() {
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
         * <p>the xhr</p>
         */
        @JsProperty  JavaScriptObject getXhr();

        /**
         * <p>the file being uploaded</p>
         */
        @JsProperty  JavaScriptObject getFile();

    }

}
