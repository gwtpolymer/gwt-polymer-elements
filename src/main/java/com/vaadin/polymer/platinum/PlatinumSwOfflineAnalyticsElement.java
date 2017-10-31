/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from platinum-sw project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.platinum;

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
 * <p>The <code>&lt;platinum-sw-offline-analytics&gt;</code> element registers a service worker handler to<br>intercepts requests for Google Analytics pings.</p>
 * <p>If the HTTP GET for the ping is successful (because the browser is online), then everything<br>proceeds as it normally would. If the HTTP GET fails, the ping request is saved to IndexedDB, and each time the service worker<br>script starts up it will attempt to “replay” those saved ping requests, giving up after one day<br>has passed.</p>
 * <p>The <a href="https://developers.google.com/analytics/devguides/collection/protocol/v1/parameters#qt"><code>qt</code></a><br>URL parameter is automatically added to the replayed HTTP GET and set to the number of<br>milliseconds that has passed since the initial ping request was attempted, to ensure that the<br>original time attribution is correct.</p>
 * <p><code>&lt;platinum-sw-offline-analytics&gt;</code> does not take care of setting up Google Analytics on your<br>page, and assumes that you have <a href="https://support.google.com/analytics/answer/1008080">properly configured</a><br>Google Analytics tracking code registered elsewhere on your page.</p>
 * <p>Since <code>&lt;platinum-sw-offline-analytics&gt;</code> is only useful if the page that is being tracked with<br>Google Analytics works offline, it’s best used in conjunction with the <code>&lt;platinum-sw-cache&gt;</code><br>element, which takes care of caching your site’s resources and serving them while offline.</p>
 * <p>A basic configuration is</p>
 * <pre><code>&lt;platinum-sw-register auto-register&gt;
 *   &lt;platinum-sw-offline-analytics&gt;&lt;/platinum-sw-offline-analytics&gt;
 *   &lt;platinum-sw-cache&gt;&lt;/platinum-sw-cache&gt;
 * &lt;/platinum-sw-register&gt;
 * 
 * 
 * </code></pre>
 */
@JsType(isNative=true, namespace = JsPackage.GLOBAL, name = "HTMLElement")
public class PlatinumSwOfflineAnalyticsElement extends PolymerElement {

    @JsOverlay public static final String TAG = "platinum-sw-offline-analytics";
    @JsOverlay public static final String SRC = "platinum-sw/platinum-sw-offline-analytics.html";



}
