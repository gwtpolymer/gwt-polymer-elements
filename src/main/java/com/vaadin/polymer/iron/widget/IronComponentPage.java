/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from iron-component-page project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.iron.widget;

import com.vaadin.polymer.iron.*;

import com.vaadin.polymer.*;
import com.vaadin.polymer.PolymerWidget;
import elemental2.core.Array;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.core.client.JavaScriptObject;
import com.vaadin.polymer.PolymerFunction;
import elemental2.dom.Element;
import elemental2.dom.HTMLElement;
import jsinterop.base.Js;

/**
 * 
 */
public class IronComponentPage extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public IronComponentPage() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public IronComponentPage(String html) {
        super(IronComponentPageElement.TAG, IronComponentPageElement.SRC, html);
    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public IronComponentPageElement getPolymerElement() {
        return Js.cast(getElement());
    }


    /**
     * <p>By default all routing is performed using the URL fragment<br>(e.g. <code>docs.html#/elements/my-element</code>).</p>
     * <p>If your server supports it and you would like to use the real URL<br>path instead (e.g. <code>/api/docs/elements/my-element</code>), set this to<br>the base path where the page is mounted, omitting the trailing<br>slash (e.g. <code>/api/docs</code> or <em>empty string</em> for the root path).</p>
     *
     * JavaScript Info:
     * @property baseHref
     * @type string
     * 
     */
    public  String getBaseHref() {
        return getPolymerElement().getBaseHref();
    }
    /**
     * <p>By default all routing is performed using the URL fragment<br>(e.g. <code>docs.html#/elements/my-element</code>).</p>
     * <p>If your server supports it and you would like to use the real URL<br>path instead (e.g. <code>/api/docs/elements/my-element</code>), set this to<br>the base path where the page is mounted, omitting the trailing<br>slash (e.g. <code>/api/docs</code> or <em>empty string</em> for the root path).</p>
     *
     * JavaScript Info:
     * @property baseHref
     * @type string
     * 
     */
    public  void setBaseHref(String value) {
        getPolymerElement().setBaseHref(value);
    }

    /**
     * <p>URL prefix for demo iframes.</p>
     *
     * JavaScript Info:
     * @property demoSrcPrefix
     * @type string
     * 
     */
    public  String getDemoSrcPrefix() {
        return getPolymerElement().getDemoSrcPrefix();
    }
    /**
     * <p>URL prefix for demo iframes.</p>
     *
     * JavaScript Info:
     * @property demoSrcPrefix
     * @type string
     * 
     */
    public  void setDemoSrcPrefix(String value) {
        getPolymerElement().setDemoSrcPrefix(value);
    }

    /**
     * <p>URL of the Polymer Analyzer descriptor to fetch and display.</p>
     *
     * JavaScript Info:
     * @property descriptorUrl
     * @type String
     * 
     */
    public  String getDescriptorUrl() {
        return getPolymerElement().getDescriptorUrl();
    }
    /**
     * <p>URL of the Polymer Analyzer descriptor to fetch and display.</p>
     *
     * JavaScript Info:
     * @property descriptorUrl
     * @type String
     * 
     */
    public  void setDescriptorUrl(String value) {
        getPolymerElement().setDescriptorUrl(value);
    }

    /**
     * <p>Instead of displaying items relative to the top level of<br><code>descriptor</code>, start from this namespace.</p>
     *
     * JavaScript Info:
     * @property rootNamespace
     * @type string
     * 
     */
    public  String getRootNamespace() {
        return getPolymerElement().getRootNamespace();
    }
    /**
     * <p>Instead of displaying items relative to the top level of<br><code>descriptor</code>, start from this namespace.</p>
     *
     * JavaScript Info:
     * @property rootNamespace
     * @type string
     * 
     */
    public  void setRootNamespace(String value) {
        getPolymerElement().setRootNamespace(value);
    }




}
