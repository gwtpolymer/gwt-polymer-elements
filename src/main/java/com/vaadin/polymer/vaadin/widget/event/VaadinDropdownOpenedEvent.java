/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from vaadin-combo-box project by Vaadin Ltd
 * that is licensed with Apache-2.0 license.
 */
package com.vaadin.polymer.vaadin.widget.event;

import com.google.gwt.event.dom.client.DomEvent;
import elemental2.core.Array;
import com.google.gwt.core.client.JavaScriptObject;
import jsinterop.base.Js;

/**
 * <p>Fired after the <code>vaadin-dropdown</code> opens.</p>
 */
public class VaadinDropdownOpenedEvent extends DomEvent<VaadinDropdownOpenedEventHandler> {

    public static Type<VaadinDropdownOpenedEventHandler> TYPE = new Type<VaadinDropdownOpenedEventHandler>(
       com.vaadin.polymer.vaadin.event.VaadinDropdownOpenedEvent.NAME, new VaadinDropdownOpenedEvent());


    public VaadinDropdownOpenedEvent() {
    }

    public Type<VaadinDropdownOpenedEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(VaadinDropdownOpenedEventHandler handler) {
        handler.onVaadinDropdownOpened(this);
    }

    public com.vaadin.polymer.vaadin.event.VaadinDropdownOpenedEvent getPolymerEvent() {
        return Js.cast(super.getNativeEvent());
    }


}
