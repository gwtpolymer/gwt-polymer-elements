/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from iron-autogrow-textarea project by The Polymer Authors
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
 * <p><code>iron-autogrow-textarea</code> is an element containing a textarea that grows in height as more<br>lines of input are entered. Unless an explicit height or the <code>maxRows</code> property is set, it will<br>never scroll.</p>
 * <p>Example:</p>
 * <pre><code>&lt;iron-autogrow-textarea&gt;&lt;/iron-autogrow-textarea&gt;
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
 * <td><code>--iron-autogrow-textarea</code></td>
 * <td>Mixin applied to the textarea</td>
 * <td><code>{}</code></td>
 * </tr>
 * <tr>
 * <td><code>--iron-autogrow-textarea-placeholder</code></td>
 * <td>Mixin applied to the textarea placeholder</td>
 * <td><code>{}</code></td>
 * </tr>
 * </tbody>
 * </table>
 */
@JsType(isNative=true, namespace = JsPackage.GLOBAL, name = "HTMLElement")
public class IronAutogrowTextareaElement extends PolymerElement {

    @JsOverlay public static final String TAG = "iron-autogrow-textarea";
    @JsOverlay public static final String SRC = "iron-autogrow-textarea/iron-autogrow-textarea.html";


    /**
     * <p>Set to true to mark the textarea as required.</p>
     *
     * JavaScript Info:
     * @property required
     * @type Boolean
     * 
     */
    @JsProperty public native  boolean getRequired();
    /**
     * <p>Set to true to mark the textarea as required.</p>
     *
     * JavaScript Info:
     * @property required
     * @type Boolean
     * 
     */
    @JsProperty public native  void setRequired(boolean value);

    /**
     * <p>The maximum number of rows this element can grow to until it<br>scrolls. 0 means no maximum.</p>
     *
     * JavaScript Info:
     * @property maxRows
     * @type Number
     * 
     */
    @JsProperty public native  double getMaxRows();
    /**
     * <p>The maximum number of rows this element can grow to until it<br>scrolls. 0 means no maximum.</p>
     *
     * JavaScript Info:
     * @property maxRows
     * @type Number
     * 
     */
    @JsProperty public native  void setMaxRows(double value);

    /**
     * <p>The maximum length of the input value.</p>
     *
     * JavaScript Info:
     * @property maxlength
     * @type Number
     * 
     */
    @JsProperty public native  double getMaxlength();
    /**
     * <p>The maximum length of the input value.</p>
     *
     * JavaScript Info:
     * @property maxlength
     * @type Number
     * 
     */
    @JsProperty public native  void setMaxlength(double value);

    /**
     * <p>The minimum length of the input value.</p>
     *
     * JavaScript Info:
     * @property minlength
     * @type Number
     * 
     */
    @JsProperty public native  double getMinlength();
    /**
     * <p>The minimum length of the input value.</p>
     *
     * JavaScript Info:
     * @property minlength
     * @type Number
     * 
     */
    @JsProperty public native  void setMinlength(double value);

    /**
     * <p>Use this property instead of <code>value</code> for two-way data binding.<br>This property will be deprecated in the future. Use <code>value</code> instead.</p>
     *
     * JavaScript Info:
     * @property bindValue
     * @type (string|number)
     * 
     */
    @JsProperty public native  Object getBindValue();
    /**
     * <p>Use this property instead of <code>value</code> for two-way data binding.<br>This property will be deprecated in the future. Use <code>value</code> instead.</p>
     *
     * JavaScript Info:
     * @property bindValue
     * @type (string|number)
     * 
     */
    @JsProperty public native  void setBindValue(Object value);

    /**
     * <p>The initial number of rows.</p>
     *
     * JavaScript Info:
     * @property rows
     * @type Number
     * 
     */
    @JsProperty public native  double getRows();
    /**
     * <p>The initial number of rows.</p>
     *
     * JavaScript Info:
     * @property rows
     * @type Number
     * 
     */
    @JsProperty public native  void setRows(double value);

    /**
     * <p>If true, the user cannot interact with this element.</p>
     *
     * JavaScript Info:
     * @property disabled
     * @type Boolean
     * @behavior PaperTab
     */
    @JsProperty public native  boolean getDisabled();
    /**
     * <p>If true, the user cannot interact with this element.</p>
     *
     * JavaScript Info:
     * @property disabled
     * @type Boolean
     * @behavior PaperTab
     */
    @JsProperty public native  void setDisabled(boolean value);

    /**
     * <p>If true, the element currently has focus.</p>
     *
     * JavaScript Info:
     * @property focused
     * @type Boolean
     * @behavior PaperTab
     */
    @JsProperty public native  boolean getFocused();
    /**
     * <p>If true, the element currently has focus.</p>
     *
     * JavaScript Info:
     * @property focused
     * @type Boolean
     * @behavior PaperTab
     */
    @JsProperty public native  void setFocused(boolean value);

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
     * <p>Bound to the textarea’s <code>autofocus</code> attribute.</p>
     *
     * JavaScript Info:
     * @property autofocus
     * @type Boolean
     * 
     */
    @JsProperty public native  boolean getAutofocus();
    /**
     * <p>Bound to the textarea’s <code>autofocus</code> attribute.</p>
     *
     * JavaScript Info:
     * @property autofocus
     * @type Boolean
     * 
     */
    @JsProperty public native  void setAutofocus(boolean value);

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
     * <p>Bound to the textarea’s <code>autocomplete</code> attribute.</p>
     *
     * JavaScript Info:
     * @property autocomplete
     * @type String
     * 
     */
    @JsProperty public native  String getAutocomplete();
    /**
     * <p>Bound to the textarea’s <code>autocomplete</code> attribute.</p>
     *
     * JavaScript Info:
     * @property autocomplete
     * @type String
     * 
     */
    @JsProperty public native  void setAutocomplete(String value);

    /**
     * <p>The value for this element.</p>
     *
     * JavaScript Info:
     * @property value
     * @type String
     * @behavior VaadinDatePicker
     */
    @JsProperty public native  String getValue();
    /**
     * <p>The value for this element.</p>
     *
     * JavaScript Info:
     * @property value
     * @type String
     * @behavior VaadinDatePicker
     */
    @JsProperty public native  void setValue(String value);

    /**
     * <p>Bound to the textarea’s <code>inputmode</code> attribute.</p>
     *
     * JavaScript Info:
     * @property inputmode
     * @type String
     * 
     */
    @JsProperty public native  String getInputmode();
    /**
     * <p>Bound to the textarea’s <code>inputmode</code> attribute.</p>
     *
     * JavaScript Info:
     * @property inputmode
     * @type String
     * 
     */
    @JsProperty public native  void setInputmode(String value);

    /**
     * <p>Bound to the textarea’s <code>placeholder</code> attribute.</p>
     *
     * JavaScript Info:
     * @property placeholder
     * @type String
     * 
     */
    @JsProperty public native  String getPlaceholder();
    /**
     * <p>Bound to the textarea’s <code>placeholder</code> attribute.</p>
     *
     * JavaScript Info:
     * @property placeholder
     * @type String
     * 
     */
    @JsProperty public native  void setPlaceholder(String value);

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
     * <p>Bound to the textarea’s <code>readonly</code> attribute.</p>
     *
     * JavaScript Info:
     * @property readonly
     * @type String
     * 
     */
    @JsProperty public native  String getReadonly();
    /**
     * <p>Bound to the textarea’s <code>readonly</code> attribute.</p>
     *
     * JavaScript Info:
     * @property readonly
     * @type String
     * 
     */
    @JsProperty public native  void setReadonly(String value);


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
     * <p>Returns true if <code>value</code> is valid. The validator provided in <code>validator</code><br>will be used first, if it exists; otherwise, the <code>textarea</code>‘s validity<br>is used.</p>
     *
     * JavaScript Info:
     * @method validate
     * 
     * @return {boolean}
     */
    public native boolean validate();

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
