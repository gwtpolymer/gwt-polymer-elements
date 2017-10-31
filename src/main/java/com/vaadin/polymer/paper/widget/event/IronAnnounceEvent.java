/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-toast project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.paper.widget.event;

import com.google.gwt.event.dom.client.DomEvent;
import elemental2.core.Array;
import com.google.gwt.core.client.JavaScriptObject;
import jsinterop.base.Js;

/**
 * <p>Fired when <code>paper-toast</code> is opened.</p>
 */
public class IronAnnounceEvent extends DomEvent<IronAnnounceEventHandler> {

    public static Type<IronAnnounceEventHandler> TYPE = new Type<IronAnnounceEventHandler>(
       com.vaadin.polymer.paper.event.IronAnnounceEvent.NAME, new IronAnnounceEvent());


    public IronAnnounceEvent() {
    }

    public Type<IronAnnounceEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(IronAnnounceEventHandler handler) {
        handler.onIronAnnounce(this);
    }

    public com.vaadin.polymer.paper.event.IronAnnounceEvent getPolymerEvent() {
        return Js.cast(super.getNativeEvent());
    }


    /**
     * <p>Contains text that will be announced.</p>
     */
    public  JavaScriptObject getDetail() {
        return getPolymerEvent().getDetail().getDetail();
    }

}
