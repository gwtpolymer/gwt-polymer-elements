/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from iron-media-query project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.iron;

import elemental2.dom.HTMLElement;
import elemental2.dom.Element;
import com.google.gwt.core.client.JavaScriptObject;
import elemental2.core.Array;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import com.vaadin.polymer.PolymerElement;
import com.vaadin.polymer.PolymerFunction;

/**
 * <p><code>iron-media-query</code> can be used to data bind to a CSS media query.<br>The <code>query</code> property is a bare CSS media query.<br>The <code>query-matches</code> property is a boolean representing whether the page matches that media query.</p>
 * <p>Example:</p>
 * <pre><code>&lt;iron-media-query query=&quot;(min-width: 600px)&quot; query-matches=&quot;{{queryMatches}}&quot;&gt;&lt;/iron-media-query&gt;
 * 
 * 
 * </code></pre>
 */
@JsType(isNative=true, namespace = JsPackage.GLOBAL, name = "HTMLElement")
public class IronMediaQueryElement extends PolymerElement {

    @JsOverlay public static final String TAG = "iron-media-query";
    @JsOverlay public static final String SRC = "iron-media-query/iron-media-query.html";


    /**
     * <p>If true, the query attribute is assumed to be a complete media query<br>string rather than a single media feature.</p>
     *
     * JavaScript Info:
     * @property full
     * @type Boolean
     * 
     */
    @JsProperty public native  boolean getFull();
    /**
     * <p>If true, the query attribute is assumed to be a complete media query<br>string rather than a single media feature.</p>
     *
     * JavaScript Info:
     * @property full
     * @type Boolean
     * 
     */
    @JsProperty public native  void setFull(boolean value);

    /**
     * <p>The Boolean return value of the media query.</p>
     *
     * JavaScript Info:
     * @property queryMatches
     * @type Boolean
     * 
     */
    @JsProperty public native  boolean getQueryMatches();
    /**
     * <p>The Boolean return value of the media query.</p>
     *
     * JavaScript Info:
     * @property queryMatches
     * @type Boolean
     * 
     */
    @JsProperty public native  void setQueryMatches(boolean value);

    /**
     * <p>The CSS media query to evaluate.</p>
     *
     * JavaScript Info:
     * @property query
     * @type String
     * 
     */
    @JsProperty public native  String getQuery();
    /**
     * <p>The CSS media query to evaluate.</p>
     *
     * JavaScript Info:
     * @property query
     * @type String
     * 
     */
    @JsProperty public native  void setQuery(String value);


    /**
     * 
     *
     * JavaScript Info:
     * @method queryHandler
     * @param {} mq  
     * 
     * 
     */
    public native void queryHandler(Object mq);

    /**
     * 
     *
     * JavaScript Info:
     * @method queryChanged
     * 
     * 
     */
    public native void queryChanged();

}
