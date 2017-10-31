/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from app-layout project by The Polymer Authors
 * that is licensed with https://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.app.widget;

import com.vaadin.polymer.app.*;

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
 * <p>app-scrollpos-control is a manager for saving and restoring the scroll position when multiple<br>pages are sharing the same document scroller.</p>
 * <p>Example:</p>
 * <pre><code class="lang-html">&lt;app-scrollpos-control selected=&quot;{{page}}&quot;&gt;&lt;/app-scrollpos-control&gt;
 * 
 * &lt;app-drawer-layout&gt;
 * 
 *   &lt;app-drawer&gt;
 *     &lt;paper-menu selected=&quot;{{page}}&quot;&gt;
 *       &lt;paper-item&gt;Home&lt;/paper-item&gt;
 *       &lt;paper-item&gt;About&lt;/paper-item&gt;
 *       &lt;paper-item&gt;Schedule&lt;/paper-item&gt;
 *       &lt;paper-item&gt;Account&lt;/paper-item&gt;
 *     &lt;/paper-menu&gt;
 *   &lt;/app-drawer&gt;
 * 
 *   &lt;div&gt;
 *     &lt;app-toolbar&gt;
 *       &lt;paper-icon-button icon=&quot;menu&quot; drawer-toggle&gt;&lt;/paper-icon-button&gt;
 *     &lt;/app-toolbar&gt;
 *     &lt;iron-pages selected=&quot;{{page}}&quot;&gt;
 *       &lt;sample-content size=&quot;100&quot;&gt;&lt;/sample-content&gt;
 *       &lt;sample-content size=&quot;100&quot;&gt;&lt;/sample-content&gt;
 *       &lt;sample-content size=&quot;100&quot;&gt;&lt;/sample-content&gt;
 *       &lt;sample-content size=&quot;100&quot;&gt;&lt;/sample-content&gt;
 *     &lt;/iron-pages&gt;
 *   &lt;/div&gt;
 * 
 * &lt;/app-drawer-layout&gt;
 * </code></pre>
 */
public class AppScrollposControl extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public AppScrollposControl() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public AppScrollposControl(String html) {
        super(AppScrollposControlElement.TAG, AppScrollposControlElement.SRC, html);
    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public AppScrollposControlElement getPolymerElement() {
        return Js.cast(getElement());
    }


    /**
     * <p>Reset the scroll position to 0.</p>
     *
     * JavaScript Info:
     * @property reset
     * @type Boolean
     * 
     */
    public  boolean getReset() {
        return getPolymerElement().getReset();
    }
    /**
     * <p>Reset the scroll position to 0.</p>
     *
     * JavaScript Info:
     * @property reset
     * @type Boolean
     * 
     */
    public  void setReset(boolean value) {
        getPolymerElement().setReset(value);
    }

    /**
     * <p>Specifies the element that will handle the scroll event<br>on the behalf of the current element. This is typically a reference to an element,<br>but there are a few more posibilities:</p>
     * <h3 id="elements-id">Elements id</h3>
     * <pre><code class="lang-html">&lt;div id=&quot;scrollable-element&quot; style=&quot;overflow: auto;&quot;&gt;
     *  &lt;x-element scroll-target=&quot;scrollable-element&quot;&gt;
     *    &lt;!-- Content--&gt;
     *  &lt;/x-element&gt;
     * &lt;/div&gt;
     * </code></pre>
     * <p>In this case, the <code>scrollTarget</code> will point to the outer div element.</p>
     * <h3 id="document-scrolling">Document scrolling</h3>
     * <p>For document scrolling, you can use the reserved word <code>document</code>:</p>
     * <pre><code class="lang-html">&lt;x-element scroll-target=&quot;document&quot;&gt;
     *   &lt;!-- Content --&gt;
     * &lt;/x-element&gt;
     * </code></pre>
     * <h3 id="elements-reference">Elements reference</h3>
     * <pre><code class="lang-js">appHeader.scrollTarget = document.querySelector(&#39;#scrollable-element&#39;);
     * </code></pre>
     *
     * JavaScript Info:
     * @property scrollTarget
     * @type Element
     * @behavior IronScrollThreshold
     */
    public  Element getScrollTarget() {
        return getPolymerElement().getScrollTarget();
    }
    /**
     * <p>Specifies the element that will handle the scroll event<br>on the behalf of the current element. This is typically a reference to an element,<br>but there are a few more posibilities:</p>
     * <h3 id="elements-id">Elements id</h3>
     * <pre><code class="lang-html">&lt;div id=&quot;scrollable-element&quot; style=&quot;overflow: auto;&quot;&gt;
     *  &lt;x-element scroll-target=&quot;scrollable-element&quot;&gt;
     *    &lt;!-- Content--&gt;
     *  &lt;/x-element&gt;
     * &lt;/div&gt;
     * </code></pre>
     * <p>In this case, the <code>scrollTarget</code> will point to the outer div element.</p>
     * <h3 id="document-scrolling">Document scrolling</h3>
     * <p>For document scrolling, you can use the reserved word <code>document</code>:</p>
     * <pre><code class="lang-html">&lt;x-element scroll-target=&quot;document&quot;&gt;
     *   &lt;!-- Content --&gt;
     * &lt;/x-element&gt;
     * </code></pre>
     * <h3 id="elements-reference">Elements reference</h3>
     * <pre><code class="lang-js">appHeader.scrollTarget = document.querySelector(&#39;#scrollable-element&#39;);
     * </code></pre>
     *
     * JavaScript Info:
     * @property scrollTarget
     * @type Element
     * @behavior IronScrollThreshold
     */
    public  void setScrollTarget(Element value) {
        getPolymerElement().setScrollTarget(value);
    }

    /**
     * <p>The selected page.</p>
     *
     * JavaScript Info:
     * @property selected
     * @type String
     * 
     */
    public  String getSelected() {
        return getPolymerElement().getSelected();
    }
    /**
     * <p>The selected page.</p>
     *
     * JavaScript Info:
     * @property selected
     * @type String
     * 
     */
    public  void setSelected(String value) {
        getPolymerElement().setSelected(value);
    }


    // Needed in UIBinder
    /**
     * <p>Specifies the element that will handle the scroll event<br>on the behalf of the current element. This is typically a reference to an element,<br>but there are a few more posibilities:</p>
     * <h3 id="elements-id">Elements id</h3>
     * <pre><code class="lang-html">&lt;div id=&quot;scrollable-element&quot; style=&quot;overflow: auto;&quot;&gt;
     *  &lt;x-element scroll-target=&quot;scrollable-element&quot;&gt;
     *    &lt;!-- Content--&gt;
     *  &lt;/x-element&gt;
     * &lt;/div&gt;
     * </code></pre>
     * <p>In this case, the <code>scrollTarget</code> will point to the outer div element.</p>
     * <h3 id="document-scrolling">Document scrolling</h3>
     * <p>For document scrolling, you can use the reserved word <code>document</code>:</p>
     * <pre><code class="lang-html">&lt;x-element scroll-target=&quot;document&quot;&gt;
     *   &lt;!-- Content --&gt;
     * &lt;/x-element&gt;
     * </code></pre>
     * <h3 id="elements-reference">Elements reference</h3>
     * <pre><code class="lang-js">appHeader.scrollTarget = document.querySelector(&#39;#scrollable-element&#39;);
     * </code></pre>
     *
     * JavaScript Info:
     * @attribute scroll-target
     * @behavior IronScrollThreshold
     */
    public void setScrollTarget(String value) {
        Polymer.property(this.getPolymerElement(), "scrollTarget", value);
    }


    /**
     * <p>Enables or disables the scroll event listener.</p>
     *
     * JavaScript Info:
     * @method toggleScrollListener
     * @param {boolean} yes  
     * @behavior IronScrollThreshold
     * 
     */
    public void toggleScrollListener(boolean yes) {
        getPolymerElement().toggleScrollListener(yes);
    }

    /**
     * <p>Scrolls the content to a particular place.</p>
     *
     * JavaScript Info:
     * @method scroll
     * @param {number} left  
     * @param {number} top  
     * @behavior IronScrollThreshold
     * 
     */
    public void scroll(double left, double top) {
        getPolymerElement().scroll(left, top);
    }


}
