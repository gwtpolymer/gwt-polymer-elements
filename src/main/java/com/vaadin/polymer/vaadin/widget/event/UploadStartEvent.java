/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from vaadin-upload project by Vaadin Ltd
 * that is licensed with Apache-2.0 license.
 */
package com.vaadin.polymer.vaadin.widget.event;

import com.google.gwt.event.dom.client.DomEvent;
import elemental2.core.Array;
import com.google.gwt.core.client.JavaScriptObject;
import jsinterop.base.Js;

/**
 * <p>Fired when the XHR is sent.</p>
 */
public class UploadStartEvent extends DomEvent<UploadStartEventHandler> {

    public static Type<UploadStartEventHandler> TYPE = new Type<UploadStartEventHandler>(
       com.vaadin.polymer.vaadin.event.UploadStartEvent.NAME, new UploadStartEvent());


    public UploadStartEvent() {
    }

    public Type<UploadStartEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(UploadStartEventHandler handler) {
        handler.onUploadStart(this);
    }

    public com.vaadin.polymer.vaadin.event.UploadStartEvent getPolymerEvent() {
        return Js.cast(super.getNativeEvent());
    }


    /**
     * 
     */
    public  JavaScriptObject getDetail() {
        return getPolymerEvent().getDetail().getDetail();
    }

    /**
     * <p>the xhr</p>
     */
    public  JavaScriptObject getXhr() {
        return getPolymerEvent().getDetail().getXhr();
    }

    /**
     * <p>the file being uploaded</p>
     */
    public  JavaScriptObject getFile() {
        return getPolymerEvent().getDetail().getFile();
    }

}
