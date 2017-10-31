/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from vaadin-grid project by Vaadin Ltd
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
 * <p>Fired when an event registered in the <code>detailedEvents</code> array is fired.<br>The name of the event depends of the original event type, for instance if the<br>original event is <code>contextmenu</code> the event name will be <code>detailed-contextmenu</code>.</p>
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Event")
public class DetailedEventEvent extends PolymerEvent {

    @JsOverlay public static final String NAME = "detailed-event";

    public DetailedEventEvent(EventInit eventInitDict) {
        super(NAME, eventInitDict);
    }

    public DetailedEventEvent() {
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
         * <p>The original event.</p>
         */
        @JsProperty  JavaScriptObject getEvent();

        /**
         * <p>The column index where the element is located.</p>
         */
        @JsProperty  double getColumn();

        /**
         * <p>The row index where the element is located</p>
         */
        @JsProperty  double getRow();

        /**
         * <p>The section name in the grid (header|body|footer)</p>
         */
        @JsProperty  String getSection();

        /**
         * <p>The row data if the event was on the body, otherwise undefined</p>
         */
        @JsProperty  JavaScriptObject getData();

    }

}
