/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-item project by The Polymer Authors
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
 * <p>Material design: <a href="https://www.google.com/design/spec/components/lists.html">Lists</a></p>
 * <p><code>&lt;paper-item&gt;</code> is an interactive list item. By default, it is a horizontal flexbox.</p>
 * <pre><code>&lt;paper-item&gt;Item&lt;/paper-item&gt;
 * 
 * 
 * </code></pre><p>Use this element with <code>&lt;paper-item-body&gt;</code> to make Material Design styled two-line and three-line<br>items.</p>
 * <pre><code>&lt;paper-item&gt;
 *   &lt;paper-item-body two-line&gt;
 *     &lt;div&gt;Show your status&lt;/div&gt;
 *     &lt;div secondary&gt;Your status is visible to everyone&lt;/div&gt;
 *   &lt;/paper-item-body&gt;
 *   &lt;iron-icon icon=&quot;warning&quot;&gt;&lt;/iron-icon&gt;
 * &lt;/paper-item&gt;
 * 
 * 
 * </code></pre><p>To use <code>paper-item</code> as a link, wrap it in an anchor tag. Since <code>paper-item</code> will<br>already receive focus, you may want to prevent the anchor tag from receiving<br>focus as well by setting its tabindex to -1.</p>
 * <pre><code>&lt;a href=&quot;https://www.polymer-project.org/&quot; tabindex=&quot;-1&quot;&gt;
 *   &lt;paper-item raised&gt;Polymer Project&lt;/paper-item&gt;
 * &lt;/a&gt;
 * 
 * 
 * </code></pre><p>If you are concerned about performance and want to use <code>paper-item</code> in a <code>paper-listbox</code><br>with many items, you can just use a native <code>button</code> with the <code>paper-item</code> class<br>applied (provided you have correctly included the shared styles):</p>
 * <pre><code>&lt;style is=&quot;custom-style&quot; include=&quot;paper-item-shared-styles&quot;&gt;&lt;/style&gt;
 * 
 * &lt;paper-listbox&gt;
 *   &lt;button class=&quot;paper-item&quot; role=&quot;option&quot;&gt;Inbox&lt;/button&gt;
 *   &lt;button class=&quot;paper-item&quot; role=&quot;option&quot;&gt;Starred&lt;/button&gt;
 *   &lt;button class=&quot;paper-item&quot; role=&quot;option&quot;&gt;Sent mail&lt;/button&gt;
 * &lt;/paper-listbox&gt;
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
 * <td><code>--paper-item-min-height</code></td>
 * <td>Minimum height of the item</td>
 * <td><code>48px</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-item</code></td>
 * <td>Mixin applied to the item</td>
 * <td><code>{}</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-item-selected-weight</code></td>
 * <td>The font weight of a selected item</td>
 * <td><code>bold</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-item-selected</code></td>
 * <td>Mixin applied to selected paper-items</td>
 * <td><code>{}</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-item-disabled-color</code></td>
 * <td>The color for disabled paper-items</td>
 * <td><code>--disabled-text-color</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-item-disabled</code></td>
 * <td>Mixin applied to disabled paper-items</td>
 * <td><code>{}</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-item-focused</code></td>
 * <td>Mixin applied to focused paper-items</td>
 * <td><code>{}</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-item-focused-before</code></td>
 * <td>Mixin applied to :before focused paper-items</td>
 * <td><code>{}</code></td>
 * </tr>
 * </tbody>
 * </table>
 * <h3 id="accessibility">Accessibility</h3>
 * <p>This element has <code>role=&quot;listitem&quot;</code> by default. Depending on usage, it may be more appropriate to set<br><code>role=&quot;menuitem&quot;</code>, <code>role=&quot;menuitemcheckbox&quot;</code> or <code>role=&quot;menuitemradio&quot;</code>.</p>
 * <pre><code>&lt;paper-item role=&quot;menuitemcheckbox&quot;&gt;
 *   &lt;paper-item-body&gt;
 *     Show your status
 *   &lt;/paper-item-body&gt;
 *   &lt;paper-checkbox&gt;&lt;/paper-checkbox&gt;
 * &lt;/paper-item&gt;
 * 
 * 
 * </code></pre>
 */
public class PaperItem extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public PaperItem() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public PaperItem(String html) {
        super(PaperItemElement.TAG, PaperItemElement.SRC, html);
    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public PaperItemElement getPolymerElement() {
        return Js.cast(getElement());
    }


    /**
     * <p>The EventTarget that will be firing relevant KeyboardEvents. Set it to<br><code>null</code> to disable the listeners.</p>
     *
     * JavaScript Info:
     * @property keyEventTarget
     * @type ?EventTarget
     * @behavior VaadinDatePicker
     */
    public  JavaScriptObject getKeyEventTarget() {
        return getPolymerElement().getKeyEventTarget();
    }
    /**
     * <p>The EventTarget that will be firing relevant KeyboardEvents. Set it to<br><code>null</code> to disable the listeners.</p>
     *
     * JavaScript Info:
     * @property keyEventTarget
     * @type ?EventTarget
     * @behavior VaadinDatePicker
     */
    public  void setKeyEventTarget(JavaScriptObject value) {
        getPolymerElement().setKeyEventTarget(value);
    }

    /**
     * 
     *
     * JavaScript Info:
     * @property keyBindings
     * @type Object
     * @behavior PaperTab
     */
    public  JavaScriptObject getKeyBindings() {
        return getPolymerElement().getKeyBindings();
    }
    /**
     * 
     *
     * JavaScript Info:
     * @property keyBindings
     * @type Object
     * @behavior PaperTab
     */
    public  void setKeyBindings(JavaScriptObject value) {
        getPolymerElement().setKeyBindings(value);
    }

    /**
     * <p>If true, the element currently has focus.</p>
     *
     * JavaScript Info:
     * @property focused
     * @type Boolean
     * @behavior PaperTab
     */
    public  boolean getFocused() {
        return getPolymerElement().getFocused();
    }
    /**
     * <p>If true, the element currently has focus.</p>
     *
     * JavaScript Info:
     * @property focused
     * @type Boolean
     * @behavior PaperTab
     */
    public  void setFocused(boolean value) {
        getPolymerElement().setFocused(value);
    }

    /**
     * <p>True if the element is currently being pressed by a “pointer,” which<br>is loosely defined as mouse or touch input (but specifically excluding<br>keyboard input).</p>
     *
     * JavaScript Info:
     * @property pointerDown
     * @type Boolean
     * @behavior PaperTab
     */
    public  boolean getPointerDown() {
        return getPolymerElement().getPointerDown();
    }
    /**
     * <p>True if the element is currently being pressed by a “pointer,” which<br>is loosely defined as mouse or touch input (but specifically excluding<br>keyboard input).</p>
     *
     * JavaScript Info:
     * @property pointerDown
     * @type Boolean
     * @behavior PaperTab
     */
    public  void setPointerDown(boolean value) {
        getPolymerElement().setPointerDown(value);
    }

    /**
     * <p>If true, the user is currently holding down the button.</p>
     *
     * JavaScript Info:
     * @property pressed
     * @type Boolean
     * @behavior PaperTab
     */
    public  boolean getPressed() {
        return getPolymerElement().getPressed();
    }
    /**
     * <p>If true, the user is currently holding down the button.</p>
     *
     * JavaScript Info:
     * @property pressed
     * @type Boolean
     * @behavior PaperTab
     */
    public  void setPressed(boolean value) {
        getPolymerElement().setPressed(value);
    }

    /**
     * <p>True if the input device that caused the element to receive focus<br>was a keyboard.</p>
     *
     * JavaScript Info:
     * @property receivedFocusFromKeyboard
     * @type Boolean
     * @behavior PaperTab
     */
    public  boolean getReceivedFocusFromKeyboard() {
        return getPolymerElement().getReceivedFocusFromKeyboard();
    }
    /**
     * <p>True if the input device that caused the element to receive focus<br>was a keyboard.</p>
     *
     * JavaScript Info:
     * @property receivedFocusFromKeyboard
     * @type Boolean
     * @behavior PaperTab
     */
    public  void setReceivedFocusFromKeyboard(boolean value) {
        getPolymerElement().setReceivedFocusFromKeyboard(value);
    }

    /**
     * <p>If true, this property will cause the implementing element to<br>automatically stop propagation on any handled KeyboardEvents.</p>
     *
     * JavaScript Info:
     * @property stopKeyboardEventPropagation
     * @type Boolean
     * @behavior VaadinDatePicker
     */
    public  boolean getStopKeyboardEventPropagation() {
        return getPolymerElement().getStopKeyboardEventPropagation();
    }
    /**
     * <p>If true, this property will cause the implementing element to<br>automatically stop propagation on any handled KeyboardEvents.</p>
     *
     * JavaScript Info:
     * @property stopKeyboardEventPropagation
     * @type Boolean
     * @behavior VaadinDatePicker
     */
    public  void setStopKeyboardEventPropagation(boolean value) {
        getPolymerElement().setStopKeyboardEventPropagation(value);
    }

    /**
     * <p>If true, the button toggles the active state with each tap or press<br>of the spacebar.</p>
     *
     * JavaScript Info:
     * @property toggles
     * @type Boolean
     * @behavior PaperTab
     */
    public  boolean getToggles() {
        return getPolymerElement().getToggles();
    }
    /**
     * <p>If true, the button toggles the active state with each tap or press<br>of the spacebar.</p>
     *
     * JavaScript Info:
     * @property toggles
     * @type Boolean
     * @behavior PaperTab
     */
    public  void setToggles(boolean value) {
        getPolymerElement().setToggles(value);
    }

    /**
     * <p>If true, the button is a toggle and is currently in the active state.</p>
     *
     * JavaScript Info:
     * @property active
     * @type Boolean
     * @behavior PaperTab
     */
    public  boolean getActive() {
        return getPolymerElement().getActive();
    }
    /**
     * <p>If true, the button is a toggle and is currently in the active state.</p>
     *
     * JavaScript Info:
     * @property active
     * @type Boolean
     * @behavior PaperTab
     */
    public  void setActive(boolean value) {
        getPolymerElement().setActive(value);
    }

    /**
     * <p>If true, the user cannot interact with this element.</p>
     *
     * JavaScript Info:
     * @property disabled
     * @type Boolean
     * @behavior PaperTab
     */
    public  boolean getDisabled() {
        return getPolymerElement().getDisabled();
    }
    /**
     * <p>If true, the user cannot interact with this element.</p>
     *
     * JavaScript Info:
     * @property disabled
     * @type Boolean
     * @behavior PaperTab
     */
    public  void setDisabled(boolean value) {
        getPolymerElement().setDisabled(value);
    }

    /**
     * <p>The aria attribute to be set if the button is a toggle and in the<br>active state.</p>
     *
     * JavaScript Info:
     * @property ariaActiveAttribute
     * @type String
     * @behavior PaperTab
     */
    public  String getAriaActiveAttribute() {
        return getPolymerElement().getAriaActiveAttribute();
    }
    /**
     * <p>The aria attribute to be set if the button is a toggle and in the<br>active state.</p>
     *
     * JavaScript Info:
     * @property ariaActiveAttribute
     * @type String
     * @behavior PaperTab
     */
    public  void setAriaActiveAttribute(String value) {
        getPolymerElement().setAriaActiveAttribute(value);
    }


    // Needed in UIBinder
    /**
     * <p>The EventTarget that will be firing relevant KeyboardEvents. Set it to<br><code>null</code> to disable the listeners.</p>
     *
     * JavaScript Info:
     * @attribute key-event-target
     * @behavior VaadinDatePicker
     */
    public void setKeyEventTarget(String value) {
        Polymer.property(this.getPolymerElement(), "keyEventTarget", value);
    }

    // Needed in UIBinder
    /**
     * <p>To be used to express what combination of keys  will trigger the relative<br>callback. e.g. <code>keyBindings: { &#39;esc&#39;: &#39;_onEscPressed&#39;}</code></p>
     *
     * JavaScript Info:
     * @attribute key-bindings
     * @behavior VaadinDatePicker
     */
    public void setKeyBindings(String value) {
        Polymer.property(this.getPolymerElement(), "keyBindings", value);
    }


    /**
     * <p>Can be used to imperatively add a key binding to the implementing<br>element. This is the imperative equivalent of declaring a keybinding<br>in the <code>keyBindings</code> prototype property.</p>
     *
     * JavaScript Info:
     * @method addOwnKeyBinding
     * @param {} eventString  
     * @param {} handlerName  
     * @behavior VaadinDatePicker
     * 
     */
    public void addOwnKeyBinding(Object eventString, Object handlerName) {
        getPolymerElement().addOwnKeyBinding(eventString, handlerName);
    }

    /**
     * <p>When called, will remove all imperatively-added key bindings.</p>
     *
     * JavaScript Info:
     * @method removeOwnKeyBindings
     * @behavior VaadinDatePicker
     * 
     */
    public void removeOwnKeyBindings() {
        getPolymerElement().removeOwnKeyBindings();
    }

    /**
     * <p>Returns true if a keyboard event matches <code>eventString</code>.</p>
     *
     * JavaScript Info:
     * @method keyboardEventMatchesKeys
     * @param {KeyboardEvent} event  
     * @param {string} eventString  
     * @behavior VaadinDatePicker
     * @return {boolean}
     */
    public boolean keyboardEventMatchesKeys(JavaScriptObject event, String eventString) {
        return getPolymerElement().keyboardEventMatchesKeys(event, eventString);
    }


}
