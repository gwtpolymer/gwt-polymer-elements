/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from iron-meta project by The Polymer Authors
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
 * <p><code>iron-meta</code> is a generic element you can use for sharing information across the DOM tree.<br>It uses <a href="http://c2.com/cgi/wiki?MonostatePattern">monostate pattern</a> such that any<br>instance of iron-meta has access to the shared<br>information. You can use <code>iron-meta</code> to share whatever you want (or create an extension<br>[like x-meta] for enhancements).</p>
 * <p>The <code>iron-meta</code> instances containing your actual data can be loaded in an import,<br>or constructed in any way you see fit. The only requirement is that you create them<br>before you try to access them.</p>
 * <p>Examples:</p>
 * <p>If I create an instance like this:</p>
 * <pre><code>&lt;iron-meta key=&quot;info&quot; value=&quot;foo/bar&quot;&gt;&lt;/iron-meta&gt;
 * 
 * 
 * </code></pre><p>Note that value=”foo/bar” is the metadata I’ve defined. I could define more<br>attributes or use child nodes to define additional metadata.</p>
 * <p>Now I can access that element (and it’s metadata) from any iron-meta instance<br>via the byKey method, e.g.</p>
 * <pre><code>meta.byKey(&#39;info&#39;);
 * 
 * 
 * </code></pre><p>Pure imperative form would be like:</p>
 * <pre><code>document.createElement(&#39;iron-meta&#39;).byKey(&#39;info&#39;);
 * 
 * 
 * </code></pre><p>Or, in a Polymer element, you can include a meta in your template:</p>
 * <pre><code>&lt;iron-meta id=&quot;meta&quot;&gt;&lt;/iron-meta&gt;
 * ...
 * this.$.meta.byKey(&#39;info&#39;);
 * 
 * 
 * </code></pre>
 */
@JsType(isNative=true, namespace = JsPackage.GLOBAL, name = "HTMLElement")
public class IronMetaQueryElement extends PolymerElement {

    @JsOverlay public static final String TAG = "iron-meta-query";
    @JsOverlay public static final String SRC = "iron-meta/iron-meta.html";


    /**
     * <p>Array of all meta-data values for the given type.</p>
     *
     * JavaScript Info:
     * @property list
     * @type Array
     * 
     */
    @JsProperty public native <E> Array<E> getList();
    /**
     * <p>Array of all meta-data values for the given type.</p>
     *
     * JavaScript Info:
     * @property list
     * @type Array
     * 
     */
    @JsProperty public native <E> void setList(Array<E> value);

    /**
     * <p>The meta-data to store or retrieve.</p>
     *
     * JavaScript Info:
     * @property value
     * @type Object
     * 
     */
    @JsProperty public native  JavaScriptObject getValue();
    /**
     * <p>The meta-data to store or retrieve.</p>
     *
     * JavaScript Info:
     * @property value
     * @type Object
     * 
     */
    @JsProperty public native  void setValue(JavaScriptObject value);

    /**
     * <p>Specifies a key to use for retrieving <code>value</code> from the <code>type</code><br>namespace.</p>
     *
     * JavaScript Info:
     * @property key
     * @type String
     * 
     */
    @JsProperty public native  String getKey();
    /**
     * <p>Specifies a key to use for retrieving <code>value</code> from the <code>type</code><br>namespace.</p>
     *
     * JavaScript Info:
     * @property key
     * @type String
     * 
     */
    @JsProperty public native  void setKey(String value);

    /**
     * <p>The type of meta-data.  All meta-data of the same type is stored<br>together.</p>
     *
     * JavaScript Info:
     * @property type
     * @type String
     * 
     */
    @JsProperty public native  String getType();
    /**
     * <p>The type of meta-data.  All meta-data of the same type is stored<br>together.</p>
     *
     * JavaScript Info:
     * @property type
     * @type String
     * 
     */
    @JsProperty public native  void setType(String value);


    /**
     * <p>Actually a factory method, not a true constructor. Only runs if<br>someone invokes it directly (via <code>new Polymer.IronMeta()</code>);</p>
     *
     * JavaScript Info:
     * @method factoryImpl
     * @param {{type: (string|undefined), key: (string|undefined)}=} config  
     * 
     * 
     */
    public native void factoryImpl(Object config);

    /**
     * <p>Retrieves meta data value by key.</p>
     *
     * JavaScript Info:
     * @method byKey
     * @param {string} key  
     * 
     * @return {JavaScriptObject}
     */
    public native JavaScriptObject byKey(String key);

}
