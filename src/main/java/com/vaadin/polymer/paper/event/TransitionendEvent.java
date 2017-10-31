/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-ripple project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.paper.event;

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
 * <pre><code>  Fired when the animation finishes.
 *   This is useful if you want to wait until
 *   the ripple animation finishes to perform some action.
 * 
 * 
 * </code></pre>
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Event")
public class TransitionendEvent extends PolymerEvent {

    @JsOverlay public static final String NAME = "transitionend";

    public TransitionendEvent(EventInit eventInitDict) {
        super(NAME, eventInitDict);
    }

    public TransitionendEvent() {
        super(NAME);
    }


    @Override
    @JsProperty
    public native Detail getDetail();

    @JsType(isNative=true)
    public interface Detail extends PolymerEvent.Detail {

        /**
         * <p>Contains the animated node.</p>
         */
        @JsProperty  JavaScriptObject getDetail();

    }

}
