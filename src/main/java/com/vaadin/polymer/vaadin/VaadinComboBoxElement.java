/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from vaadin-combo-box project by Vaadin Ltd
 * that is licensed with Apache-2.0 license.
 */
package com.vaadin.polymer.vaadin;

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
 * <p><code>&lt;vaadin-combo-box&gt;</code> is a combo box element combining a dropdown list with an<br>input field for filtering the list of items. If you want to replace the default<br>input field with a custom implementation, you should use the<br><a href="#vaadin-combo-box-light"><code>&lt;vaadin-combo-box-light&gt;</code></a> element.</p>
 * <p>Items in the dropdown list must be provided as a list of <code>String</code> values.<br>Defining the items is done using the <code>items</code> property, which can be assigned<br>with data-binding, using an attribute or directly with the JavaScript property.</p>
 * <pre><code class="lang-html">&lt;vaadin-combo-box
 *     label=&quot;Fruit&quot;
 *     items=&quot;[[data]]&quot;&gt;
 * &lt;/vaadin-combo-box&gt;
 * </code></pre>
 * <pre><code class="lang-js">combobox.items = [&#39;apple&#39;, &#39;orange&#39;, &#39;banana&#39;];
 * </code></pre>
 * <p>When the selected <code>value</code> is changed, a <code>value-changed</code> event is triggered.</p>
 * <p>This element is also extended with the <code>IronFormElementBehavior</code> to<br>enable usage within an <code>iron-form</code>.</p>
 * <h3 id="item-template">Item Template</h3>
 * <p><code>&lt;vaadin-combo-box&gt;</code> supports using custom item template provided in the light<br>DOM:</p>
 * <pre><code class="lang-html">&lt;vaadin-combo-box items=&#39;[{&quot;label&quot;: &quot;Hydrogen&quot;, &quot;value&quot;: &quot;H&quot;}]&#39;&gt;
 *   &lt;template&gt;
 *     [[index]]: [[item.label]] &lt;b&gt;[[item.value]&lt;/b&gt;
 *   &lt;/template&gt;
 * &lt;/vaadin-combo-box&gt;
 * </code></pre>
 * <p>The following properties are available for item template bindings:</p>
 * <table>
 * <thead>
 * <tr>
 * <th>Property name</th>
 * <th>Type</th>
 * <th>Description</th>
 * </tr>
 * </thead>
 * <tbody>
 * <tr>
 * <td><code>index</code></td>
 * <td>Number</td>
 * <td>Index of the item in the <code>items</code> array</td>
 * </tr>
 * <tr>
 * <td><code>item</code></td>
 * <td>String or Object</td>
 * <td>The item reference</td>
 * </tr>
 * <tr>
 * <td><code>selected</code></td>
 * <td>Boolean</td>
 * <td>True when item is selected</td>
 * </tr>
 * <tr>
 * <td><code>focused</code></td>
 * <td>Boolean</td>
 * <td>True when item is focused</td>
 * </tr>
 * </tbody>
 * </table>
 * <p>See the <a href="demo/item-template.html">Item Template Live Demos</a> for more examples.</p>
 * <h3 id="styling">Styling</h3>
 * <p>There are custom properties and mixins you can use to style the component:</p>
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
 * <td><code>--vaadin-combo-box-overlay-max-height</code></td>
 * <td>Property that determines the max height of overlay</td>
 * <td><code>65vh</code></td>
 * </tr>
 * </tbody>
 * </table>
 */
@JsType(isNative=true, namespace = JsPackage.GLOBAL, name = "HTMLElement")
public class VaadinComboBoxElement extends PolymerElement {

    @JsOverlay public static final String TAG = "vaadin-combo-box";
    @JsOverlay public static final String SRC = "vaadin-combo-box/vaadin-combo-box.html";


    /**
     * <p>True if the last call to <code>validate</code> is invalid.</p>
     *
     * JavaScript Info:
     * @property invalid
     * @type Boolean
     * @behavior VaadinDatePicker
     */
    @JsProperty public native  boolean getInvalid();
    /**
     * <p>True if the last call to <code>validate</code> is invalid.</p>
     *
     * JavaScript Info:
     * @property invalid
     * @type Boolean
     * @behavior VaadinDatePicker
     */
    @JsProperty public native  void setInvalid(boolean value);

    /**
     * <p>Returns a reference to the input element.</p>
     *
     * JavaScript Info:
     * @property inputElement
     * @type HTMLElement
     * 
     */
    @JsProperty public native  HTMLElement getInputElement();
    /**
     * <p>Returns a reference to the input element.</p>
     *
     * JavaScript Info:
     * @property inputElement
     * @type HTMLElement
     * 
     */
    @JsProperty public native  void setInputElement(HTMLElement value);

    /**
     * <p>The selected item from the <code>items</code> array.</p>
     *
     * JavaScript Info:
     * @property selectedItem
     * @type Object
     * 
     */
    @JsProperty public native  JavaScriptObject getSelectedItem();
    /**
     * <p>The selected item from the <code>items</code> array.</p>
     *
     * JavaScript Info:
     * @property selectedItem
     * @type Object
     * 
     */
    @JsProperty public native  void setSelectedItem(JavaScriptObject value);

    /**
     * <p>A full set of items to filter the visible options from.<br>The items can be of either <code>String</code> or <code>Object</code> type.</p>
     *
     * JavaScript Info:
     * @property items
     * @type Array
     * 
     */
    @JsProperty public native <E> Array<E> getItems();
    /**
     * <p>A full set of items to filter the visible options from.<br>The items can be of either <code>String</code> or <code>Object</code> type.</p>
     *
     * JavaScript Info:
     * @property items
     * @type Array
     * 
     */
    @JsProperty public native <E> void setItems(Array<E> value);

    /**
     * <p>A subset of items, filtered based on the user input. Filtered items<br>can be assigned directly to omit the internal filtering functionality.<br>The items can be of either <code>String</code> or <code>Object</code> type.</p>
     *
     * JavaScript Info:
     * @property filteredItems
     * @type Array
     * @behavior VaadinComboBox
     */
    @JsProperty public native <E> Array<E> getFilteredItems();
    /**
     * <p>A subset of items, filtered based on the user input. Filtered items<br>can be assigned directly to omit the internal filtering functionality.<br>The items can be of either <code>String</code> or <code>Object</code> type.</p>
     *
     * JavaScript Info:
     * @property filteredItems
     * @type Array
     * @behavior VaadinComboBox
     */
    @JsProperty public native <E> void setFilteredItems(Array<E> value);

    /**
     * 
     *
     * JavaScript Info:
     * @property size
     * @type Number
     * 
     */
    @JsProperty public native  double getSize();
    /**
     * 
     *
     * JavaScript Info:
     * @property size
     * @type Number
     * 
     */
    @JsProperty public native  void setSize(double value);

    /**
     * <p>Set to true to disable this element.</p>
     *
     * JavaScript Info:
     * @property disabled
     * @type Boolean
     * @behavior VaadinComboBox
     */
    @JsProperty public native  boolean getDisabled();
    /**
     * <p>Set to true to disable this element.</p>
     *
     * JavaScript Info:
     * @property disabled
     * @type Boolean
     * @behavior VaadinComboBox
     */
    @JsProperty public native  void setDisabled(boolean value);

    /**
     * <p>When present, it specifies that the element field is read-only.</p>
     *
     * JavaScript Info:
     * @property readonly
     * @type Boolean
     * @behavior VaadinComboBox
     */
    @JsProperty public native  boolean getReadonly();
    /**
     * <p>When present, it specifies that the element field is read-only.</p>
     *
     * JavaScript Info:
     * @property readonly
     * @type Boolean
     * @behavior VaadinComboBox
     */
    @JsProperty public native  void setReadonly(boolean value);

    /**
     * <p>True if the dropdown is open, false otherwise.</p>
     *
     * JavaScript Info:
     * @property opened
     * @type Boolean
     * @behavior VaadinComboBox
     */
    @JsProperty public native  boolean getOpened();
    /**
     * <p>True if the dropdown is open, false otherwise.</p>
     *
     * JavaScript Info:
     * @property opened
     * @type Boolean
     * @behavior VaadinComboBox
     */
    @JsProperty public native  void setOpened(boolean value);

    /**
     * <p>When set to <code>true</code>, a loading spinner is displayed on top of the list of options.</p>
     *
     * JavaScript Info:
     * @property loading
     * @type Boolean
     * 
     */
    @JsProperty public native  boolean getLoading();
    /**
     * <p>When set to <code>true</code>, a loading spinner is displayed on top of the list of options.</p>
     *
     * JavaScript Info:
     * @property loading
     * @type Boolean
     * 
     */
    @JsProperty public native  void setLoading(boolean value);

    /**
     * <p>Set to true to mark the input as required. If used in a form, a<br>custom element that uses this behavior should also use<br>Polymer.IronValidatableBehavior and define a custom validation method.<br>Otherwise, a <code>required</code> element will always be considered valid.<br>It’s also strongly recommended to provide a visual style for the element<br>when its value is invalid.</p>
     *
     * JavaScript Info:
     * @property required
     * @type Boolean
     * @behavior VaadinDatePicker
     */
    @JsProperty public native  boolean getRequired();
    /**
     * <p>Set to true to mark the input as required. If used in a form, a<br>custom element that uses this behavior should also use<br>Polymer.IronValidatableBehavior and define a custom validation method.<br>Otherwise, a <code>required</code> element will always be considered valid.<br>It’s also strongly recommended to provide a visual style for the element<br>when its value is invalid.</p>
     *
     * JavaScript Info:
     * @property required
     * @type Boolean
     * @behavior VaadinDatePicker
     */
    @JsProperty public native  void setRequired(boolean value);

    /**
     * 
     *
     * JavaScript Info:
     * @property autofocus
     * @type Boolean
     * 
     */
    @JsProperty public native  boolean getAutofocus();
    /**
     * 
     *
     * JavaScript Info:
     * @property autofocus
     * @type Boolean
     * 
     */
    @JsProperty public native  void setAutofocus(boolean value);

    /**
     * <p>Set to true to disable the floating label.</p>
     *
     * JavaScript Info:
     * @property noLabelFloat
     * @type Boolean
     * 
     */
    @JsProperty public native  boolean getNoLabelFloat();
    /**
     * <p>Set to true to disable the floating label.</p>
     *
     * JavaScript Info:
     * @property noLabelFloat
     * @type Boolean
     * 
     */
    @JsProperty public native  void setNoLabelFloat(boolean value);

    /**
     * <p>If <code>true</code>, the user can input a value that is not present in the items list.<br><code>value</code> property will be set to the input value in this case.<br>Also, when <code>value</code> is set programmatically, the input value will be set<br>to reflect that value.</p>
     *
     * JavaScript Info:
     * @property allowCustomValue
     * @type Boolean
     * 
     */
    @JsProperty public native  boolean getAllowCustomValue();
    /**
     * <p>If <code>true</code>, the user can input a value that is not present in the items list.<br><code>value</code> property will be set to the input value in this case.<br>Also, when <code>value</code> is set programmatically, the input value will be set<br>to reflect that value.</p>
     *
     * JavaScript Info:
     * @property allowCustomValue
     * @type Boolean
     * 
     */
    @JsProperty public native  void setAllowCustomValue(boolean value);

    /**
     * <p>True when the input field has focus.</p>
     *
     * JavaScript Info:
     * @property focused
     * @type Boolean
     * 
     */
    @JsProperty public native  boolean getFocused();
    /**
     * <p>True when the input field has focus.</p>
     *
     * JavaScript Info:
     * @property focused
     * @type Boolean
     * 
     */
    @JsProperty public native  void setFocused(boolean value);

    /**
     * <p>A read-only property indicating whether this combo box has a value<br>selected or not. It can be used for example in styling of the component.</p>
     *
     * JavaScript Info:
     * @property hasValue
     * @type Boolean
     * 
     */
    @JsProperty public native  boolean getHasValue();
    /**
     * <p>A read-only property indicating whether this combo box has a value<br>selected or not. It can be used for example in styling of the component.</p>
     *
     * JavaScript Info:
     * @property hasValue
     * @type Boolean
     * 
     */
    @JsProperty public native  void setHasValue(boolean value);

    /**
     * <p>Set to true to prevent the user from entering invalid input.</p>
     *
     * JavaScript Info:
     * @property preventInvalidInput
     * @type Boolean
     * 
     */
    @JsProperty public native  boolean getPreventInvalidInput();
    /**
     * <p>Set to true to prevent the user from entering invalid input.</p>
     *
     * JavaScript Info:
     * @property preventInvalidInput
     * @type Boolean
     * 
     */
    @JsProperty public native  void setPreventInvalidInput(boolean value);

    /**
     * <p>Set to true to always float the label.</p>
     *
     * JavaScript Info:
     * @property alwaysFloatLabel
     * @type Boolean
     * 
     */
    @JsProperty public native  boolean getAlwaysFloatLabel();
    /**
     * <p>Set to true to always float the label.</p>
     *
     * JavaScript Info:
     * @property alwaysFloatLabel
     * @type Boolean
     * 
     */
    @JsProperty public native  void setAlwaysFloatLabel(boolean value);

    /**
     * <p>Set to true to auto-validate the input value.</p>
     *
     * JavaScript Info:
     * @property autoValidate
     * @type Boolean
     * 
     */
    @JsProperty public native  boolean getAutoValidate();
    /**
     * <p>Set to true to auto-validate the input value.</p>
     *
     * JavaScript Info:
     * @property autoValidate
     * @type Boolean
     * 
     */
    @JsProperty public native  void setAutoValidate(boolean value);

    /**
     * <p>Path for the value of the item. If <code>items</code> is an array of objects, the<br><code>itemValuePath:</code> is used to fetch the string value for the selected<br>item.</p>
     * <p>The item value is used in the <code>value</code> property of the combo box,<br>to provide the form value.</p>
     *
     * JavaScript Info:
     * @property itemValuePath
     * @type String
     * @behavior VaadinComboBox
     */
    @JsProperty public native  String getItemValuePath();
    /**
     * <p>Path for the value of the item. If <code>items</code> is an array of objects, the<br><code>itemValuePath:</code> is used to fetch the string value for the selected<br>item.</p>
     * <p>The item value is used in the <code>value</code> property of the combo box,<br>to provide the form value.</p>
     *
     * JavaScript Info:
     * @property itemValuePath
     * @type String
     * @behavior VaadinComboBox
     */
    @JsProperty public native  void setItemValuePath(String value);

    /**
     * <p>Filtering string the user has typed into the input field.</p>
     *
     * JavaScript Info:
     * @property filter
     * @type String
     * @behavior VaadinComboBox
     */
    @JsProperty public native  String getFilter();
    /**
     * <p>Filtering string the user has typed into the input field.</p>
     *
     * JavaScript Info:
     * @property filter
     * @type String
     * @behavior VaadinComboBox
     */
    @JsProperty public native  void setFilter(String value);

    /**
     * <p>The <code>String</code> value for the selected item of the combo box. Provides<br>the value for <code>iron-form</code>.</p>
     * <p>When there’s no item selected, the value is an empty string.</p>
     * <p>Use <code>selectedItem</code> property to get the raw selected item from<br>the <code>items</code> array.</p>
     *
     * JavaScript Info:
     * @property value
     * @type String
     * @behavior VaadinComboBox
     */
    @JsProperty public native  String getValue();
    /**
     * <p>The <code>String</code> value for the selected item of the combo box. Provides<br>the value for <code>iron-form</code>.</p>
     * <p>When there’s no item selected, the value is an empty string.</p>
     * <p>Use <code>selectedItem</code> property to get the raw selected item from<br>the <code>items</code> array.</p>
     *
     * JavaScript Info:
     * @property value
     * @type String
     * @behavior VaadinComboBox
     */
    @JsProperty public native  void setValue(String value);

    /**
     * <p>Namespace for this validator. This property is deprecated and should<br>not be used. For all intents and purposes, please consider it a<br>read-only, config-time property.</p>
     *
     * JavaScript Info:
     * @property validatorType
     * @type String
     * @behavior VaadinDatePicker
     */
    @JsProperty public native  String getValidatorType();
    /**
     * <p>Namespace for this validator. This property is deprecated and should<br>not be used. For all intents and purposes, please consider it a<br>read-only, config-time property.</p>
     *
     * JavaScript Info:
     * @property validatorType
     * @type String
     * @behavior VaadinDatePicker
     */
    @JsProperty public native  void setValidatorType(String value);

    /**
     * <p>Name of the validator to use.</p>
     *
     * JavaScript Info:
     * @property validator
     * @type String
     * @behavior VaadinDatePicker
     */
    @JsProperty public native  String getValidator();
    /**
     * <p>Name of the validator to use.</p>
     *
     * JavaScript Info:
     * @property validator
     * @type String
     * @behavior VaadinDatePicker
     */
    @JsProperty public native  void setValidator(String value);

    /**
     * <p>The name of this element.</p>
     *
     * JavaScript Info:
     * @property name
     * @type String
     * @behavior VaadinDatePicker
     */
    @JsProperty public native  String getName();
    /**
     * <p>The name of this element.</p>
     *
     * JavaScript Info:
     * @property name
     * @type String
     * @behavior VaadinDatePicker
     */
    @JsProperty public native  void setName(String value);

    /**
     * <p>Set this to specify the pattern allowed by <code>preventInvalidInput</code>.</p>
     *
     * JavaScript Info:
     * @property allowedPattern
     * @type String
     * 
     */
    @JsProperty public native  String getAllowedPattern();
    /**
     * <p>Set this to specify the pattern allowed by <code>preventInvalidInput</code>.</p>
     *
     * JavaScript Info:
     * @property allowedPattern
     * @type String
     * 
     */
    @JsProperty public native  void setAllowedPattern(String value);

    /**
     * <p>Path for label of the item. If <code>items</code> is an array of objects, the<br><code>itemLabelPath</code> is used to fetch the displayed string label for each<br>item.</p>
     * <p>The item label is also used for matching items when processing user<br>input, i.e., for filtering and selecting items.</p>
     * <p>When using item templates, the property is still needed because it is used<br>for filtering, and for displaying the selected item value in the input box.</p>
     *
     * JavaScript Info:
     * @property itemLabelPath
     * @type String
     * @behavior VaadinComboBox
     */
    @JsProperty public native  String getItemLabelPath();
    /**
     * <p>Path for label of the item. If <code>items</code> is an array of objects, the<br><code>itemLabelPath</code> is used to fetch the displayed string label for each<br>item.</p>
     * <p>The item label is also used for matching items when processing user<br>input, i.e., for filtering and selecting items.</p>
     * <p>When using item templates, the property is still needed because it is used<br>for filtering, and for displaying the selected item value in the input box.</p>
     *
     * JavaScript Info:
     * @property itemLabelPath
     * @type String
     * @behavior VaadinComboBox
     */
    @JsProperty public native  void setItemLabelPath(String value);

    /**
     * <p>A pattern to validate the <code>input</code> with.</p>
     *
     * JavaScript Info:
     * @property pattern
     * @type String
     * 
     */
    @JsProperty public native  String getPattern();
    /**
     * <p>A pattern to validate the <code>input</code> with.</p>
     *
     * JavaScript Info:
     * @property pattern
     * @type String
     * 
     */
    @JsProperty public native  void setPattern(String value);

    /**
     * <p>The label for this element.</p>
     *
     * JavaScript Info:
     * @property label
     * @type String
     * 
     */
    @JsProperty public native  String getLabel();
    /**
     * <p>The label for this element.</p>
     *
     * JavaScript Info:
     * @property label
     * @type String
     * 
     */
    @JsProperty public native  void setLabel(String value);

    /**
     * 
     *
     * JavaScript Info:
     * @property inputmode
     * @type String
     * 
     */
    @JsProperty public native  String getInputmode();
    /**
     * 
     *
     * JavaScript Info:
     * @property inputmode
     * @type String
     * 
     */
    @JsProperty public native  void setInputmode(String value);

    /**
     * <p>The error message to display when the input is invalid.</p>
     *
     * JavaScript Info:
     * @property errorMessage
     * @type String
     * 
     */
    @JsProperty public native  String getErrorMessage();
    /**
     * <p>The error message to display when the input is invalid.</p>
     *
     * JavaScript Info:
     * @property errorMessage
     * @type String
     * 
     */
    @JsProperty public native  void setErrorMessage(String value);

    /**
     * <p>A placeholder string in addition to the label. If this is set, the label will always float.</p>
     *
     * JavaScript Info:
     * @property placeholder
     * @type String
     * 
     */
    @JsProperty public native  String getPlaceholder();
    /**
     * <p>A placeholder string in addition to the label. If this is set, the label will always float.</p>
     *
     * JavaScript Info:
     * @property placeholder
     * @type String
     * 
     */
    @JsProperty public native  void setPlaceholder(String value);


    /**
     * 
     *
     * JavaScript Info:
     * @method stamp
     * @param {} model  
     * @behavior VaadinInfiniteScroller
     * 
     */
    public native void stamp(Object model);

    /**
     * 
     *
     * JavaScript Info:
     * @method modelForElement
     * @param {} el  
     * @behavior VaadinInfiniteScroller
     * 
     */
    public native void modelForElement(Object el);

    /**
     * 
     *
     * JavaScript Info:
     * @method templatize
     * @param {} template  
     * @behavior VaadinInfiniteScroller
     * 
     */
    public native void templatize(Object template);

    /**
     * <p>Opens the dropdown list.</p>
     *
     * JavaScript Info:
     * @method open
     * 
     * 
     */
    public native void open();

    /**
     * <p>Removes focus from the input field.</p>
     *
     * JavaScript Info:
     * @method blur
     * 
     * 
     */
    public native void blur();

    /**
     * <p>Sets focus on the input field.</p>
     *
     * JavaScript Info:
     * @method focus
     * 
     * 
     */
    public native void focus();

    /**
     * 
     *
     * JavaScript Info:
     * @method hasValidator
     * @behavior VaadinDatePicker
     * @return {boolean}
     */
    public native boolean hasValidator();

    /**
     * <p>Reverts back to original value.</p>
     *
     * JavaScript Info:
     * @method cancel
     * 
     * 
     */
    public native void cancel();

    /**
     * <p>Closes the dropdown list.</p>
     *
     * JavaScript Info:
     * @method close
     * @behavior VaadinComboBox
     * 
     */
    public native void close();

    /**
     * <p>Returns true if the <code>value</code> is valid, and updates <code>invalid</code>. If you want<br>your element to have custom validation logic, do not override this method;<br>override <code>_getValidity(value)</code> instead.</p>
     *
     * JavaScript Info:
     * @method validate
     * @param {Object} value  
     * @behavior VaadinDatePicker
     * @return {boolean}
     */
    public native boolean validate(JavaScriptObject value);

}
