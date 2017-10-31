/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-dialog-scrollable project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.paper.widget;

import com.vaadin.polymer.paper.*;

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
 * <p>Material design: <a href="https://www.google.com/design/spec/components/dialogs.html">Dialogs</a></p>
 * <p><code>paper-dialog-scrollable</code> implements a scrolling area used in a Material Design dialog. It shows<br>a divider at the top and/or bottom indicating more content, depending on scroll position. Use this<br>together with elements implementing <code>Polymer.PaperDialogBehavior</code>.</p>
 * <pre><code>&lt;paper-dialog-impl&gt;
 *   &lt;h2&gt;Header&lt;/h2&gt;
 *   &lt;paper-dialog-scrollable&gt;
 *     Lorem ipsum...
 *   &lt;/paper-dialog-scrollable&gt;
 *   &lt;div class=&quot;buttons&quot;&gt;
 *     &lt;paper-button&gt;OK&lt;/paper-button&gt;
 *   &lt;/div&gt;
 * &lt;/paper-dialog-impl&gt;
 * 
 * 
 * </code></pre><p>It shows a top divider after scrolling if it is not the first child in its parent container,<br>indicating there is more content above. It shows a bottom divider if it is scrollable and it is not<br>the last child in its parent container, indicating there is more content below. The bottom divider<br>is hidden if it is scrolled to the bottom.</p>
 * <p>If <code>paper-dialog-scrollable</code> is not a direct child of the element implementing <code>Polymer.PaperDialogBehavior</code>,<br>remember to set the <code>dialogElement</code>:</p>
 * <pre><code>&lt;paper-dialog-impl id=&quot;myDialog&quot;&gt;
 *   &lt;h2&gt;Header&lt;/h2&gt;
 *   &lt;div class=&quot;my-content-wrapper&quot;&gt;
 *     &lt;h4&gt;Sub-header&lt;/h4&gt;
 *     &lt;paper-dialog-scrollable&gt;
 *       Lorem ipsum...
 *     &lt;/paper-dialog-scrollable&gt;
 *   &lt;/div&gt;
 *   &lt;div class=&quot;buttons&quot;&gt;
 *     &lt;paper-button&gt;OK&lt;/paper-button&gt;
 *   &lt;/div&gt;
 * &lt;/paper-dialog-impl&gt;
 * 
 * &lt;script&gt;
 *   var scrollable = Polymer.dom(myDialog).querySelector(&#39;paper-dialog-scrollable&#39;);
 *   scrollable.dialogElement = myDialog;
 * &lt;/script&gt;
 * 
 * 
 * </code></pre><h3 id="styling">Styling</h3>
 * <p>The following custom properties and mixins are available for styling:</p>
 * <table>
 * <thead>
 * <tr>
 * <th>Custom property</th>
 * <th>Description</th>
 * <th>Default</th>
 * </tr>
 * </thead>
 * <tbody>
 * <tr>
 * <td><code>--paper-dialog-scrollable</code></td>
 * <td>Mixin for the scrollable content</td>
 * <td>{}</td>
 * </tr>
 * </tbody>
 * </table>
 */
public class PaperDialogScrollable extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public PaperDialogScrollable() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public PaperDialogScrollable(String html) {
        super(PaperDialogScrollableElement.TAG, PaperDialogScrollableElement.SRC, html);
    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public PaperDialogScrollableElement getPolymerElement() {
        return Js.cast(getElement());
    }


    /**
     * <p>The dialog element that implements <code>Polymer.PaperDialogBehavior</code> containing this element.</p>
     *
     * JavaScript Info:
     * @property dialogElement
     * @type ?Node
     * 
     */
    public  JavaScriptObject getDialogElement() {
        return getPolymerElement().getDialogElement();
    }
    /**
     * <p>The dialog element that implements <code>Polymer.PaperDialogBehavior</code> containing this element.</p>
     *
     * JavaScript Info:
     * @property dialogElement
     * @type ?Node
     * 
     */
    public  void setDialogElement(JavaScriptObject value) {
        getPolymerElement().setDialogElement(value);
    }


    // Needed in UIBinder
    /**
     * <p>The dialog element that implements <code>Polymer.PaperDialogBehavior</code> containing this element.</p>
     *
     * JavaScript Info:
     * @attribute dialog-element
     * 
     */
    public void setDialogElement(String value) {
        Polymer.property(this.getPolymerElement(), "dialogElement", value);
    }


    /**
     * 
     *
     * JavaScript Info:
     * @method updateScrollState
     * 
     * 
     */
    public void updateScrollState() {
        getPolymerElement().updateScrollState();
    }


}
