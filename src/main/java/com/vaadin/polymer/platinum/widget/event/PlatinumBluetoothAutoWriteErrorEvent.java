/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from platinum-bluetooth project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.platinum.widget.event;

import com.google.gwt.event.dom.client.DomEvent;
import elemental2.core.Array;
import com.google.gwt.core.client.JavaScriptObject;
import jsinterop.base.Js;

/**
 * <p>Fired when an error occurs while writing automatically to a characteristic.</p>
 */
public class PlatinumBluetoothAutoWriteErrorEvent extends DomEvent<PlatinumBluetoothAutoWriteErrorEventHandler> {

    public static Type<PlatinumBluetoothAutoWriteErrorEventHandler> TYPE = new Type<PlatinumBluetoothAutoWriteErrorEventHandler>(
       com.vaadin.polymer.platinum.event.PlatinumBluetoothAutoWriteErrorEvent.NAME, new PlatinumBluetoothAutoWriteErrorEvent());


    public PlatinumBluetoothAutoWriteErrorEvent() {
    }

    public Type<PlatinumBluetoothAutoWriteErrorEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(PlatinumBluetoothAutoWriteErrorEventHandler handler) {
        handler.onPlatinumBluetoothAutoWriteError(this);
    }

    public com.vaadin.polymer.platinum.event.PlatinumBluetoothAutoWriteErrorEvent getPolymerEvent() {
        return Js.cast(super.getNativeEvent());
    }


    /**
     * <p>error message</p>
     */
    public  String getThe() {
        return getPolymerEvent().getDetail().getThe();
    }

}
