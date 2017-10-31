/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from iron-component-page project by The Polymer Authors
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
 * 
 */
@JsType(isNative=true, namespace = JsPackage.GLOBAL, name = "HTMLElement")
public class IronComponentPageElement extends PolymerElement {

    @JsOverlay public static final String TAG = "iron-component-page";
    @JsOverlay public static final String SRC = "iron-component-page/iron-component-page.html";


    /**
     * <p>By default all routing is performed using the URL fragment<br>(e.g. <code>docs.html#/elements/my-element</code>).</p>
     * <p>If your server supports it and you would like to use the real URL<br>path instead (e.g. <code>/api/docs/elements/my-element</code>), set this to<br>the base path where the page is mounted, omitting the trailing<br>slash (e.g. <code>/api/docs</code> or <em>empty string</em> for the root path).</p>
     *
     * JavaScript Info:
     * @property baseHref
     * @type string
     * 
     */
    @JsProperty public native  String getBaseHref();
    /**
     * <p>By default all routing is performed using the URL fragment<br>(e.g. <code>docs.html#/elements/my-element</code>).</p>
     * <p>If your server supports it and you would like to use the real URL<br>path instead (e.g. <code>/api/docs/elements/my-element</code>), set this to<br>the base path where the page is mounted, omitting the trailing<br>slash (e.g. <code>/api/docs</code> or <em>empty string</em> for the root path).</p>
     *
     * JavaScript Info:
     * @property baseHref
     * @type string
     * 
     */
    @JsProperty public native  void setBaseHref(String value);

    /**
     * <p>URL prefix for demo iframes.</p>
     *
     * JavaScript Info:
     * @property demoSrcPrefix
     * @type string
     * 
     */
    @JsProperty public native  String getDemoSrcPrefix();
    /**
     * <p>URL prefix for demo iframes.</p>
     *
     * JavaScript Info:
     * @property demoSrcPrefix
     * @type string
     * 
     */
    @JsProperty public native  void setDemoSrcPrefix(String value);

    /**
     * <p>URL of the Polymer Analyzer descriptor to fetch and display.</p>
     *
     * JavaScript Info:
     * @property descriptorUrl
     * @type String
     * 
     */
    @JsProperty public native  String getDescriptorUrl();
    /**
     * <p>URL of the Polymer Analyzer descriptor to fetch and display.</p>
     *
     * JavaScript Info:
     * @property descriptorUrl
     * @type String
     * 
     */
    @JsProperty public native  void setDescriptorUrl(String value);

    /**
     * <p>Instead of displaying items relative to the top level of<br><code>descriptor</code>, start from this namespace.</p>
     *
     * JavaScript Info:
     * @property rootNamespace
     * @type string
     * 
     */
    @JsProperty public native  String getRootNamespace();
    /**
     * <p>Instead of displaying items relative to the top level of<br><code>descriptor</code>, start from this namespace.</p>
     *
     * JavaScript Info:
     * @property rootNamespace
     * @type string
     * 
     */
    @JsProperty public native  void setRootNamespace(String value);


}
