/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-tabs project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.paper.widget;

import com.vaadin.polymer.paper.*;

import com.vaadin.polymer.iron.widget.event.IronActivateEvent;
import com.vaadin.polymer.iron.widget.event.IronActivateEventHandler;

import com.vaadin.polymer.iron.widget.event.IronDeselectEvent;
import com.vaadin.polymer.iron.widget.event.IronDeselectEventHandler;

import com.vaadin.polymer.iron.widget.event.IronItemsChangedEvent;
import com.vaadin.polymer.iron.widget.event.IronItemsChangedEventHandler;

import com.vaadin.polymer.iron.widget.event.IronSelectEvent;
import com.vaadin.polymer.iron.widget.event.IronSelectEventHandler;

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
 * <p>Material design: <a href="https://www.google.com/design/spec/components/tabs.html">Tabs</a></p>
 * <p><code>paper-tabs</code> makes it easy to explore and switch between different views or functional aspects of<br>an app, or to browse categorized data sets.</p>
 * <p>Use <code>selected</code> property to get or set the selected tab.</p>
 * <p>Example:</p>
 * <pre><code>&lt;paper-tabs selected=&quot;0&quot;&gt;
 *   &lt;paper-tab&gt;TAB 1&lt;/paper-tab&gt;
 *   &lt;paper-tab&gt;TAB 2&lt;/paper-tab&gt;
 *   &lt;paper-tab&gt;TAB 3&lt;/paper-tab&gt;
 * &lt;/paper-tabs&gt;
 * 
 * 
 * </code></pre><p>See <a href="?active=paper-tab">paper-tab</a> for more information about<br><code>paper-tab</code>.</p>
 * <p>A common usage for <code>paper-tabs</code> is to use it along with <code>iron-pages</code> to switch<br>between different views.</p>
 * <pre><code>&lt;paper-tabs selected=&quot;{{selected}}&quot;&gt;
 *   &lt;paper-tab&gt;Tab 1&lt;/paper-tab&gt;
 *   &lt;paper-tab&gt;Tab 2&lt;/paper-tab&gt;
 *   &lt;paper-tab&gt;Tab 3&lt;/paper-tab&gt;
 * &lt;/paper-tabs&gt;
 * 
 * &lt;iron-pages selected=&quot;{{selected}}&quot;&gt;
 *   &lt;div&gt;Page 1&lt;/div&gt;
 *   &lt;div&gt;Page 2&lt;/div&gt;
 *   &lt;div&gt;Page 3&lt;/div&gt;
 * &lt;/iron-pages&gt;
 * 
 * 
 * 
 * </code></pre><p>To use links in tabs, add <code>link</code> attribute to <code>paper-tab</code> and put an <code>&lt;a&gt;</code><br>element in <code>paper-tab</code> with a <code>tabindex</code> of -1.</p>
 * <p>Example:</p>
 * <pre><code>
 * &lt;style is="custom-style">
 *   .link {
 *     &#64;apply --layout-horizontal;
 *     &#64;apply --layout-center-center;
 *   }
 * &lt;/style>
 * 
 * &lt;paper-tabs selected="0">
 *   &lt;paper-tab link>
 *     &lt;a href="#link1" class="link" tabindex="-1">TAB ONE&lt;/a>
 *   &lt;/paper-tab>
 *   &lt;paper-tab link>
 *     &lt;a href="#link2" class="link" tabindex="-1">TAB TWO&lt;/a>
 *   &lt;/paper-tab>
 *   &lt;paper-tab link>
 *     &lt;a href="#link3" class="link" tabindex="-1">TAB THREE&lt;/a>
 *   &lt;/paper-tab>
 * &lt;/paper-tabs>
 * </code></pre>
 * 
 * <h3 id="styling">Styling</h3>
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
 * <td><code>--paper-tabs-selection-bar-color</code></td>
 * <td>Color for the selection bar</td>
 * <td><code>--paper-yellow-a100</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-tabs-selection-bar</code></td>
 * <td>Mixin applied to the selection bar</td>
 * <td><code>{}</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-tabs</code></td>
 * <td>Mixin applied to the tabs</td>
 * <td><code>{}</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-tabs-content</code></td>
 * <td>Mixin applied to the content container of tabs</td>
 * <td><code>{}</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-tabs-container</code></td>
 * <td>Mixin applied to the layout container of tabs</td>
 * <td><code>{}</code></td>
 * </tr>
 * </tbody>
 * </table>
 */
public class PaperTabs extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public PaperTabs() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public PaperTabs(String html) {
        super(PaperTabsElement.TAG, PaperTabsElement.SRC, html);
    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public PaperTabsElement getPolymerElement() {
        return Js.cast(getElement());
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
     * <p>The delay (in milliseconds) between when the user stops interacting<br>with the tabs through the keyboard and when the focused item is<br>automatically selected (if <code>autoselect</code> is true).</p>
     *
     * JavaScript Info:
     * @property autoselectDelay
     * @type Number
     * 
     */
    public  double getAutoselectDelay() {
        return getPolymerElement().getAutoselectDelay();
    }
    /**
     * <p>The delay (in milliseconds) between when the user stops interacting<br>with the tabs through the keyboard and when the focused item is<br>automatically selected (if <code>autoselect</code> is true).</p>
     *
     * JavaScript Info:
     * @property autoselectDelay
     * @type Number
     * 
     */
    public  void setAutoselectDelay(double value) {
        getPolymerElement().setAutoselectDelay(value);
    }

    /**
     * <p>The list of items from which a selection can be made.</p>
     *
     * JavaScript Info:
     * @property items
     * @type Array
     * @behavior PaperTabs
     */
    public <E> Array<E> getItems() {
        return getPolymerElement().getItems();
    }
    /**
     * <p>The list of items from which a selection can be made.</p>
     *
     * JavaScript Info:
     * @property items
     * @type Array
     * @behavior PaperTabs
     */
    public <E> void setItems(Array<E> value) {
        getPolymerElement().setItems(value);
    }

    /**
     * <p>Returns an array of currently selected items.</p>
     *
     * JavaScript Info:
     * @property selectedItems
     * @type Array
     * @behavior PaperTabs
     */
    public <E> Array<E> getSelectedItems() {
        return getPolymerElement().getSelectedItems();
    }
    /**
     * <p>Returns an array of currently selected items.</p>
     *
     * JavaScript Info:
     * @property selectedItems
     * @type Array
     * @behavior PaperTabs
     */
    public <E> void setSelectedItems(Array<E> value) {
        getPolymerElement().setSelectedItems(value);
    }

    /**
     * <p>Gets or sets the selected elements. This is used instead of <code>selected</code> when <code>multi</code><br>is true.</p>
     *
     * JavaScript Info:
     * @property selectedValues
     * @type Array
     * @behavior PaperTabs
     */
    public <E> Array<E> getSelectedValues() {
        return getPolymerElement().getSelectedValues();
    }
    /**
     * <p>Gets or sets the selected elements. This is used instead of <code>selected</code> when <code>multi</code><br>is true.</p>
     *
     * JavaScript Info:
     * @property selectedValues
     * @type Array
     * @behavior PaperTabs
     */
    public <E> void setSelectedValues(Array<E> value) {
        getPolymerElement().setSelectedValues(value);
    }

    /**
     * 
     *
     * JavaScript Info:
     * @property keyBindings
     * @type Object
     * @behavior PaperTabs
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
     * @behavior PaperTabs
     */
    public  void setKeyBindings(JavaScriptObject value) {
        getPolymerElement().setKeyBindings(value);
    }

    /**
     * <p>Returns the currently selected item.</p>
     *
     * JavaScript Info:
     * @property selectedItem
     * @type ?Object
     * @behavior PaperTabs
     */
    public  JavaScriptObject getSelectedItem() {
        return getPolymerElement().getSelectedItem();
    }
    /**
     * <p>Returns the currently selected item.</p>
     *
     * JavaScript Info:
     * @property selectedItem
     * @type ?Object
     * @behavior PaperTabs
     */
    public  void setSelectedItem(JavaScriptObject value) {
        getPolymerElement().setSelectedItem(value);
    }

    /**
     * <p>Returns the currently focused item.</p>
     *
     * JavaScript Info:
     * @property focusedItem
     * @type ?Object
     * @behavior PaperTabs
     */
    public  JavaScriptObject getFocusedItem() {
        return getPolymerElement().getFocusedItem();
    }
    /**
     * <p>Returns the currently focused item.</p>
     *
     * JavaScript Info:
     * @property focusedItem
     * @type ?Object
     * @behavior PaperTabs
     */
    public  void setFocusedItem(JavaScriptObject value) {
        getPolymerElement().setFocusedItem(value);
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
     * <p>Gets or sets the selected element. The default is to use the index of the item.</p>
     *
     * JavaScript Info:
     * @property selected
     * @type (string|number)
     * @behavior PaperTabs
     */
    public  Object getSelected() {
        return getPolymerElement().getSelected();
    }
    /**
     * <p>Gets or sets the selected element. The default is to use the index of the item.</p>
     *
     * JavaScript Info:
     * @property selected
     * @type (string|number)
     * @behavior PaperTabs
     */
    public  void setSelected(Object value) {
        getPolymerElement().setSelected(value);
    }

    /**
     * 
     *
     * JavaScript Info:
     * @property disabled
     * @type Boolean
     * @behavior PaperTabs
     */
    public  boolean getDisabled() {
        return getPolymerElement().getDisabled();
    }
    /**
     * 
     *
     * JavaScript Info:
     * @property disabled
     * @type Boolean
     * @behavior PaperTabs
     */
    public  void setDisabled(boolean value) {
        getPolymerElement().setDisabled(value);
    }

    /**
     * <p>If true, the tabs are aligned to bottom (the selection bar appears at the top).</p>
     *
     * JavaScript Info:
     * @property alignBottom
     * @type Boolean
     * 
     */
    public  boolean getAlignBottom() {
        return getPolymerElement().getAlignBottom();
    }
    /**
     * <p>If true, the tabs are aligned to bottom (the selection bar appears at the top).</p>
     *
     * JavaScript Info:
     * @property alignBottom
     * @type Boolean
     * 
     */
    public  void setAlignBottom(boolean value) {
        getPolymerElement().setAlignBottom(value);
    }

    /**
     * <p>If true, tabs are automatically selected when focused using the<br>keyboard.</p>
     *
     * JavaScript Info:
     * @property autoselect
     * @type Boolean
     * 
     */
    public  boolean getAutoselect() {
        return getPolymerElement().getAutoselect();
    }
    /**
     * <p>If true, tabs are automatically selected when focused using the<br>keyboard.</p>
     *
     * JavaScript Info:
     * @property autoselect
     * @type Boolean
     * 
     */
    public  void setAutoselect(boolean value) {
        getPolymerElement().setAutoselect(value);
    }

    /**
     * <p>If true, the bottom bar to indicate the selected tab will not be shown.</p>
     *
     * JavaScript Info:
     * @property noBar
     * @type Boolean
     * 
     */
    public  boolean getNoBar() {
        return getPolymerElement().getNoBar();
    }
    /**
     * <p>If true, the bottom bar to indicate the selected tab will not be shown.</p>
     *
     * JavaScript Info:
     * @property noBar
     * @type Boolean
     * 
     */
    public  void setNoBar(boolean value) {
        getPolymerElement().setNoBar(value);
    }

    /**
     * <p>If true, multiple selections are allowed.</p>
     *
     * JavaScript Info:
     * @property multi
     * @type Boolean
     * @behavior PaperTabs
     */
    public  boolean getMulti() {
        return getPolymerElement().getMulti();
    }
    /**
     * <p>If true, multiple selections are allowed.</p>
     *
     * JavaScript Info:
     * @property multi
     * @type Boolean
     * @behavior PaperTabs
     */
    public  void setMulti(boolean value) {
        getPolymerElement().setMulti(value);
    }

    /**
     * <p>If true, the slide effect for the bottom bar is disabled.</p>
     *
     * JavaScript Info:
     * @property noSlide
     * @type Boolean
     * 
     */
    public  boolean getNoSlide() {
        return getPolymerElement().getNoSlide();
    }
    /**
     * <p>If true, the slide effect for the bottom bar is disabled.</p>
     *
     * JavaScript Info:
     * @property noSlide
     * @type Boolean
     * 
     */
    public  void setNoSlide(boolean value) {
        getPolymerElement().setNoSlide(value);
    }

    /**
     * <p>If true, ink ripple effect is disabled. When this property is changed,<br>all descendant <code>&lt;paper-tab&gt;</code> elements have their <code>noink</code> property<br>changed to the new value as well.</p>
     *
     * JavaScript Info:
     * @property noink
     * @type Boolean
     * 
     */
    public  boolean getNoink() {
        return getPolymerElement().getNoink();
    }
    /**
     * <p>If true, ink ripple effect is disabled. When this property is changed,<br>all descendant <code>&lt;paper-tab&gt;</code> elements have their <code>noink</code> property<br>changed to the new value as well.</p>
     *
     * JavaScript Info:
     * @property noink
     * @type Boolean
     * 
     */
    public  void setNoink(boolean value) {
        getPolymerElement().setNoink(value);
    }

    /**
     * <p>If true, tabs are scrollable and the tab width is based on the label width.</p>
     *
     * JavaScript Info:
     * @property scrollable
     * @type Boolean
     * 
     */
    public  boolean getScrollable() {
        return getPolymerElement().getScrollable();
    }
    /**
     * <p>If true, tabs are scrollable and the tab width is based on the label width.</p>
     *
     * JavaScript Info:
     * @property scrollable
     * @type Boolean
     * 
     */
    public  void setScrollable(boolean value) {
        getPolymerElement().setScrollable(value);
    }

    /**
     * <p>If true, dragging on the tabs to scroll is disabled.</p>
     *
     * JavaScript Info:
     * @property disableDrag
     * @type Boolean
     * 
     */
    public  boolean getDisableDrag() {
        return getPolymerElement().getDisableDrag();
    }
    /**
     * <p>If true, dragging on the tabs to scroll is disabled.</p>
     *
     * JavaScript Info:
     * @property disableDrag
     * @type Boolean
     * 
     */
    public  void setDisableDrag(boolean value) {
        getPolymerElement().setDisableDrag(value);
    }

    /**
     * <p>If true, tabs expand to fit their container. This currently only applies when<br>scrollable is true.</p>
     *
     * JavaScript Info:
     * @property fitContainer
     * @type Boolean
     * 
     */
    public  boolean getFitContainer() {
        return getPolymerElement().getFitContainer();
    }
    /**
     * <p>If true, tabs expand to fit their container. This currently only applies when<br>scrollable is true.</p>
     *
     * JavaScript Info:
     * @property fitContainer
     * @type Boolean
     * 
     */
    public  void setFitContainer(boolean value) {
        getPolymerElement().setFitContainer(value);
    }

    /**
     * <p>If true, scroll buttons (left/right arrow) will be hidden for scrollable tabs.</p>
     *
     * JavaScript Info:
     * @property hideScrollButtons
     * @type Boolean
     * 
     */
    public  boolean getHideScrollButtons() {
        return getPolymerElement().getHideScrollButtons();
    }
    /**
     * <p>If true, scroll buttons (left/right arrow) will be hidden for scrollable tabs.</p>
     *
     * JavaScript Info:
     * @property hideScrollButtons
     * @type Boolean
     * 
     */
    public  void setHideScrollButtons(boolean value) {
        getPolymerElement().setHideScrollButtons(value);
    }

    /**
     * <p>This is a CSS selector string.  If this is set, only items that match the CSS selector<br>are selectable.</p>
     *
     * JavaScript Info:
     * @property selectable
     * @type string
     * @behavior PaperTabs
     */
    public  String getSelectable() {
        return getPolymerElement().getSelectable();
    }
    /**
     * <p>This is a CSS selector string.  If this is set, only items that match the CSS selector<br>are selectable.</p>
     *
     * JavaScript Info:
     * @property selectable
     * @type string
     * @behavior PaperTabs
     */
    public  void setSelectable(String value) {
        getPolymerElement().setSelectable(value);
    }

    /**
     * <p>The attribute to set on elements when selected.</p>
     *
     * JavaScript Info:
     * @property selectedAttribute
     * @type String
     * @behavior PaperTabs
     */
    public  String getSelectedAttribute() {
        return getPolymerElement().getSelectedAttribute();
    }
    /**
     * <p>The attribute to set on elements when selected.</p>
     *
     * JavaScript Info:
     * @property selectedAttribute
     * @type String
     * @behavior PaperTabs
     */
    public  void setSelectedAttribute(String value) {
        getPolymerElement().setSelectedAttribute(value);
    }

    /**
     * <p>The class to set on elements when selected.</p>
     *
     * JavaScript Info:
     * @property selectedClass
     * @type String
     * @behavior PaperTabs
     */
    public  String getSelectedClass() {
        return getPolymerElement().getSelectedClass();
    }
    /**
     * <p>The class to set on elements when selected.</p>
     *
     * JavaScript Info:
     * @property selectedClass
     * @type String
     * @behavior PaperTabs
     */
    public  void setSelectedClass(String value) {
        getPolymerElement().setSelectedClass(value);
    }

    /**
     * <p>If you want to use an attribute value or property of an element for<br><code>selected</code> instead of the index, set this to the name of the attribute<br>or property. Hyphenated values are converted to camel case when used to<br>look up the property of a selectable element. Camel cased values are<br><em>not</em> converted to hyphenated values for attribute lookup. It’s<br>recommended that you provide the hyphenated form of the name so that<br>selection works in both cases. (Use <code>attr-or-property-name</code> instead of<br><code>attrOrPropertyName</code>.)</p>
     *
     * JavaScript Info:
     * @property attrForSelected
     * @type String
     * @behavior PaperTabs
     */
    public  String getAttrForSelected() {
        return getPolymerElement().getAttrForSelected();
    }
    /**
     * <p>If you want to use an attribute value or property of an element for<br><code>selected</code> instead of the index, set this to the name of the attribute<br>or property. Hyphenated values are converted to camel case when used to<br>look up the property of a selectable element. Camel cased values are<br><em>not</em> converted to hyphenated values for attribute lookup. It’s<br>recommended that you provide the hyphenated form of the name so that<br>selection works in both cases. (Use <code>attr-or-property-name</code> instead of<br><code>attrOrPropertyName</code>.)</p>
     *
     * JavaScript Info:
     * @property attrForSelected
     * @type String
     * @behavior PaperTabs
     */
    public  void setAttrForSelected(String value) {
        getPolymerElement().setAttrForSelected(value);
    }

    /**
     * <p>The event that fires from items when they are selected. Selectable<br>will listen for this event from items and update the selection state.<br>Set to empty string to listen to no events.</p>
     *
     * JavaScript Info:
     * @property activateEvent
     * @type String
     * @behavior PaperTabs
     */
    public  String getActivateEvent() {
        return getPolymerElement().getActivateEvent();
    }
    /**
     * <p>The event that fires from items when they are selected. Selectable<br>will listen for this event from items and update the selection state.<br>Set to empty string to listen to no events.</p>
     *
     * JavaScript Info:
     * @property activateEvent
     * @type String
     * @behavior PaperTabs
     */
    public  void setActivateEvent(String value) {
        getPolymerElement().setActivateEvent(value);
    }

    /**
     * <p>Default fallback if the selection based on selected with <code>attrForSelected</code><br>is not found.</p>
     *
     * JavaScript Info:
     * @property fallbackSelection
     * @type String
     * @behavior PaperTabs
     */
    public  String getFallbackSelection() {
        return getPolymerElement().getFallbackSelection();
    }
    /**
     * <p>Default fallback if the selection based on selected with <code>attrForSelected</code><br>is not found.</p>
     *
     * JavaScript Info:
     * @property fallbackSelection
     * @type String
     * @behavior PaperTabs
     */
    public  void setFallbackSelection(String value) {
        getPolymerElement().setFallbackSelection(value);
    }

    /**
     * <p>The attribute to use on menu items to look up the item title. Typing the first<br>letter of an item when the menu is open focuses that item. If unset, <code>textContent</code><br>will be used.</p>
     *
     * JavaScript Info:
     * @property attrForItemTitle
     * @type String
     * @behavior PaperTabs
     */
    public  String getAttrForItemTitle() {
        return getPolymerElement().getAttrForItemTitle();
    }
    /**
     * <p>The attribute to use on menu items to look up the item title. Typing the first<br>letter of an item when the menu is open focuses that item. If unset, <code>textContent</code><br>will be used.</p>
     *
     * JavaScript Info:
     * @property attrForItemTitle
     * @type String
     * @behavior PaperTabs
     */
    public  void setAttrForItemTitle(String value) {
        getPolymerElement().setAttrForItemTitle(value);
    }


    // Needed in UIBinder
    /**
     * <p>Gets or sets the selected element. The default is to use the index of the item.</p>
     *
     * JavaScript Info:
     * @attribute selected
     * @behavior PaperTabs
     */
    public void setSelected(String value) {
        Polymer.property(this.getPolymerElement(), "selected", value);
    }

    // Needed in UIBinder
    /**
     * <p>Returns the currently selected item.</p>
     *
     * JavaScript Info:
     * @attribute selected-item
     * @behavior PaperTabs
     */
    public void setSelectedItem(String value) {
        Polymer.property(this.getPolymerElement(), "selectedItem", value);
    }

    // Needed in UIBinder
    /**
     * <p>Returns the currently focused item.</p>
     *
     * JavaScript Info:
     * @attribute focused-item
     * @behavior PaperTabs
     */
    public void setFocusedItem(String value) {
        Polymer.property(this.getPolymerElement(), "focusedItem", value);
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
     * <p>The list of items from which a selection can be made.</p>
     *
     * JavaScript Info:
     * @attribute items
     * @behavior PaperTabs
     */
    public void setItems(String value) {
        Polymer.property(this.getPolymerElement(), "items", value);
    }

    // Needed in UIBinder
    /**
     * <p>Gets or sets the selected elements. This is used instead of <code>selected</code> when <code>multi</code><br>is true.</p>
     *
     * JavaScript Info:
     * @attribute selected-values
     * @behavior PaperTabs
     */
    public void setSelectedValues(String value) {
        Polymer.property(this.getPolymerElement(), "selectedValues", value);
    }

    // Needed in UIBinder
    /**
     * <p>Returns an array of currently selected items.</p>
     *
     * JavaScript Info:
     * @attribute selected-items
     * @behavior PaperTabs
     */
    public void setSelectedItems(String value) {
        Polymer.property(this.getPolymerElement(), "selectedItems", value);
    }

    // Needed in UIBinder
    /**
     * <p>The delay (in milliseconds) between when the user stops interacting<br>with the tabs through the keyboard and when the focused item is<br>automatically selected (if <code>autoselect</code> is true).</p>
     *
     * JavaScript Info:
     * @attribute autoselect-delay
     * 
     */
    public void setAutoselectDelay(String value) {
        Polymer.property(this.getPolymerElement(), "autoselectDelay", value);
    }


    /**
     * <p>Used to assign the closest resizable ancestor to this resizable<br>if the ancestor detects a request for notifications.</p>
     *
     * JavaScript Info:
     * @method assignParentResizable
     * @param {} parentResizable  
     * @behavior VaadinSplitLayout
     * 
     */
    public void assignParentResizable(Object parentResizable) {
        getPolymerElement().assignParentResizable(parentResizable);
    }

    /**
     * <p>Selects the given value. If the <code>multi</code> property is true, then the selected state of the<br><code>value</code> will be toggled; otherwise the <code>value</code> will be selected.</p>
     *
     * JavaScript Info:
     * @method select
     * @param {(string|number)} value  
     * @behavior PaperTabs
     * 
     */
    public void select(Object value) {
        getPolymerElement().select(value);
    }

    /**
     * 
     *
     * JavaScript Info:
     * @method multiChanged
     * @param {} multi  
     * @behavior PaperTabs
     * 
     */
    public void multiChanged(Object multi) {
        getPolymerElement().multiChanged(multi);
    }

    /**
     * <p>Selects the item at the given index.</p>
     *
     * JavaScript Info:
     * @method selectIndex
     * @param {} index  
     * @behavior PaperTabs
     * 
     */
    public void selectIndex(Object index) {
        getPolymerElement().selectIndex(index);
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
     * <p>Used to remove a resizable descendant from the list of descendants<br>that should be notified of a resize change.</p>
     *
     * JavaScript Info:
     * @method stopResizeNotificationsFor
     * @param {} target  
     * @behavior VaadinSplitLayout
     * 
     */
    public void stopResizeNotificationsFor(Object target) {
        getPolymerElement().stopResizeNotificationsFor(target);
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
     * <p>Force a synchronous update of the <code>items</code> property.</p>
     * <p>NOTE: Consider listening for the <code>iron-items-changed</code> event to respond to<br>updates to the set of selectable items after updates to the DOM list and<br>selection state have been made.</p>
     * <p>WARNING: If you are using this method, you should probably consider an<br>alternate approach. Synchronously querying for items is potentially<br>slow for many use cases. The <code>items</code> property will update asynchronously<br>on its own to reflect selectable items in the DOM.</p>
     *
     * JavaScript Info:
     * @method forceSynchronousItemUpdate
     * @behavior PaperTabs
     * 
     */
    public void forceSynchronousItemUpdate() {
        getPolymerElement().forceSynchronousItemUpdate();
    }

    /**
     * <p>Selects the next item.</p>
     *
     * JavaScript Info:
     * @method selectNext
     * @behavior PaperTabs
     * 
     */
    public void selectNext() {
        getPolymerElement().selectNext();
    }

    /**
     * <p>Selects the previous item.</p>
     *
     * JavaScript Info:
     * @method selectPrevious
     * @behavior PaperTabs
     * 
     */
    public void selectPrevious() {
        getPolymerElement().selectPrevious();
    }

    /**
     * <p>Can be called to manually notify a resizable and its descendant<br>resizables of a resize change.</p>
     *
     * JavaScript Info:
     * @method notifyResize
     * @behavior VaadinSplitLayout
     * 
     */
    public void notifyResize() {
        getPolymerElement().notifyResize();
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

    /**
     * <p>This method can be overridden to filter nested elements that should or<br>should not be notified by the current element. Return true if an element<br>should be notified, or false if it should not be notified.</p>
     *
     * JavaScript Info:
     * @method resizerShouldNotify
     * @param {HTMLElement} element  
     * @behavior VaadinSplitLayout
     * @return {boolean}
     */
    public boolean resizerShouldNotify(HTMLElement element) {
        return getPolymerElement().resizerShouldNotify(element);
    }

    /**
     * <p>Returns the index of the given item.</p>
     *
     * JavaScript Info:
     * @method indexOf
     * @param {Object} item  
     * @behavior PaperTabs
     * 
     */
    public void indexOf(JavaScriptObject item) {
        getPolymerElement().indexOf(item);
    }


    /**
     * <p>Fired when iron-selector is activated (selected or deselected).<br>It is fired before the selected items are changed.<br>Cancel the event to abort selection.</p>
     *
     * JavaScript Info:
     * @event iron-activate
     */
    public HandlerRegistration addIronActivateHandler(IronActivateEventHandler handler) {
        return addDomHandler(handler, IronActivateEvent.TYPE);
    }

    /**
     * <p>Fired when an item is deselected</p>
     *
     * JavaScript Info:
     * @event iron-deselect
     */
    public HandlerRegistration addIronDeselectHandler(IronDeselectEventHandler handler) {
        return addDomHandler(handler, IronDeselectEvent.TYPE);
    }

    /**
     * <p>Fired when the list of selectable items changes (e.g., items are<br>added or removed). The detail of the event is a mutation record that<br>describes what changed.</p>
     *
     * JavaScript Info:
     * @event iron-items-changed
     */
    public HandlerRegistration addIronItemsChangedHandler(IronItemsChangedEventHandler handler) {
        return addDomHandler(handler, IronItemsChangedEvent.TYPE);
    }

    /**
     * <p>Fired when an item is selected</p>
     *
     * JavaScript Info:
     * @event iron-select
     */
    public HandlerRegistration addIronSelectHandler(IronSelectEventHandler handler) {
        return addDomHandler(handler, IronSelectEvent.TYPE);
    }

}