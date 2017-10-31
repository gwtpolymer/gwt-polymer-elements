/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from app-pouchdb project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.app;

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
 * <p><code>app-pouchdb-conflict-resolution</code> enables declarative configuration of conflict<br>resolution strategies ordered by logical relationships in the DOM. Currently<br>two basic strategies are supported: <code>firstWriteWins</code> and <code>lastWriteWins</code>.</p>
 * <p>To use <code>app-pouchdb-conflict-resolution</code>, simply include the element somewhere<br>in a document subtree at or above the ShadowRoot of an <code>app-pouchdb-document</code><br>or <code>app-pouchdb-query</code>:</p>
 * <pre><code class="lang-html">&lt;app-pouchdb-conflict-resolution
 *     strategy=&quot;lastWriteWins&quot;&gt;
 * &lt;/app-pouchdb-conflict-resolution&gt;
 * &lt;app-pouchdb-document
 *     db-name=&quot;cats&quot;
 *     doc-id=&quot;parsnip&quot;&gt;
 * &lt;/app-pouchdb-document&gt;
 * </code></pre>
 * <p>When a conflict occurs, the <code>app-pouchdb-document</code> will request fire an event<br>to notify of the conflict and request a resolution strategy. The<br><code>app-pouchdb-conflict-resolution</code> element listens at its nearest ShadowRoot<br>boundary for conflict notifications, and responds to them as needed with a<br>configured strategy.</p>
 */
@JsType(isNative=true, namespace = JsPackage.GLOBAL, name = "HTMLElement")
public class AppPouchdbConflictResolutionElement extends PolymerElement {

    @JsOverlay public static final String TAG = "app-pouchdb-conflict-resolution";
    @JsOverlay public static final String SRC = "app-pouchdb/app-pouchdb-conflict-resolution.html";


    /**
     * <p>By default, this element stops propagation of any conflict events<br>that it is able to handle. If set to <code>true</code>, the element will allow<br>such events to continue propagating, opening the possibility that<br>another conflict resolution strategy higher up the document tree will<br>superseed this one.</p>
     *
     * JavaScript Info:
     * @property allowAncestralResolution
     * @type Boolean
     * 
     */
    @JsProperty public native  boolean getAllowAncestralResolution();
    /**
     * <p>By default, this element stops propagation of any conflict events<br>that it is able to handle. If set to <code>true</code>, the element will allow<br>such events to continue propagating, opening the possibility that<br>another conflict resolution strategy higher up the document tree will<br>superseed this one.</p>
     *
     * JavaScript Info:
     * @property allowAncestralResolution
     * @type Boolean
     * 
     */
    @JsProperty public native  void setAllowAncestralResolution(boolean value);

    /**
     * <p>The name of the strategy to use to reslve the conflict. Supported<br>strategies are <code>firstWriteWins</code> (the default) and <code>lastWriteWins</code>.</p>
     *
     * JavaScript Info:
     * @property strategy
     * @type String
     * 
     */
    @JsProperty public native  String getStrategy();
    /**
     * <p>The name of the strategy to use to reslve the conflict. Supported<br>strategies are <code>firstWriteWins</code> (the default) and <code>lastWriteWins</code>.</p>
     *
     * JavaScript Info:
     * @property strategy
     * @type String
     * 
     */
    @JsProperty public native  void setStrategy(String value);


    /**
     * 
     *
     * JavaScript Info:
     * @method firstWriteWins
     * @param {} db  
     * @param {} method  
     * @param {} doc  
     * @param {} error  
     * 
     * 
     */
    public native void firstWriteWins(Object db, Object method, Object doc, Object error);

    /**
     * 
     *
     * JavaScript Info:
     * @method lastWriteWins
     * @param {} db  
     * @param {} method  
     * @param {} doc  
     * @param {} error  
     * 
     * 
     */
    public native void lastWriteWins(Object db, Object method, Object doc, Object error);

    /**
     * 
     *
     * JavaScript Info:
     * @method resolveConflict
     * @param {} event  
     * 
     * 
     */
    public native void resolveConflict(Object event);

}
