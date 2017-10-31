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
 * <p>Fired when we have the actual server response, and before the component<br>analises it. It’s useful for developers to make the upload fail depending<br>on the server response. If the event is preventDefault the vaadin-upload<br>will return allowing the user to do something on his own like retry the<br>upload, etc. since he has full access to the <code>xhr</code> and <code>file</code> objects.<br>Otherwise, if the event is not prevented default <code>vaadin-upload</code> continues<br>with the normal workflow checking the <code>xhr.status</code> and <code>file.error</code><br>which also might be modified by the user to force a customised response.</p>
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Event")
public class UploadResponseEvent extends PolymerEvent {

    @JsOverlay public static final String NAME = "upload-response";

    public UploadResponseEvent(EventInit eventInitDict) {
        super(NAME, eventInitDict);
    }

    public UploadResponseEvent() {
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
