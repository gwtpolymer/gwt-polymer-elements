/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from vaadin-date-picker project by Vaadin Ltd
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
 * <p>Fired when the scroller reaches the target scrolling position.</p>
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Event")
public class ScrollAnimationFinishedEvent extends PolymerEvent {

    @JsOverlay public static final String NAME = "scroll-animation-finished";

    public ScrollAnimationFinishedEvent(EventInit eventInitDict) {
        super(NAME, eventInitDict);
    }

    public ScrollAnimationFinishedEvent() {
        super(NAME);
    }


    @Override
    @JsProperty
    public native Detail getDetail();

    @JsType(isNative=true)
    public interface Detail extends PolymerEvent.Detail {

        /**
         * <p>new position</p>
         */
        @JsProperty  double getPosition();

        /**
         * <p>old position</p>
         */
        @JsProperty  double getOldPosition();

    }

}
