/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from vaadin-grid project by Vaadin Ltd
 * that is licensed with Apache-2.0 license.
 */
package com.vaadin.polymer.vaadin.widget.event;

import com.google.gwt.event.dom.client.DomEvent;
import elemental2.core.Array;
import com.google.gwt.core.client.JavaScriptObject;
import jsinterop.base.Js;

/**
 * <p>A change in the selection mode.</p>
 */
public class SelectionModeChangedEvent extends DomEvent<SelectionModeChangedEventHandler> {

    public static Type<SelectionModeChangedEventHandler> TYPE = new Type<SelectionModeChangedEventHandler>(
       com.vaadin.polymer.vaadin.event.SelectionModeChangedEvent.NAME, new SelectionModeChangedEvent());


    public SelectionModeChangedEvent() {
    }

    public Type<SelectionModeChangedEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(SelectionModeChangedEventHandler handler) {
        handler.onSelectionModeChanged(this);
    }

    public com.vaadin.polymer.vaadin.event.SelectionModeChangedEvent getPolymerEvent() {
        return Js.cast(super.getNativeEvent());
    }


}
