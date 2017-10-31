/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from vaadin-date-picker project by Vaadin Ltd
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
 * 
 */
@JsType(isNative=true, namespace = JsPackage.GLOBAL, name = "HTMLElement")
public class VaadinMonthCalendarElement extends PolymerElement {

    @JsOverlay public static final String TAG = "vaadin-month-calendar";
    @JsOverlay public static final String SRC = "vaadin-date-picker/vaadin-date-picker.html";


    /**
     * <p>A <code>Date</code> object for the currently focused date.</p>
     *
     * JavaScript Info:
     * @property focusedDate
     * @type Date
     * 
     */
    @JsProperty public native  JavaScriptObject getFocusedDate();
    /**
     * <p>A <code>Date</code> object for the currently focused date.</p>
     *
     * JavaScript Info:
     * @property focusedDate
     * @type Date
     * 
     */
    @JsProperty public native  void setFocusedDate(JavaScriptObject value);

    /**
     * 
     *
     * JavaScript Info:
     * @property i18n
     * @type Object
     * 
     */
    @JsProperty public native  JavaScriptObject getI18n();
    /**
     * 
     *
     * JavaScript Info:
     * @property i18n
     * @type Object
     * 
     */
    @JsProperty public native  void setI18n(JavaScriptObject value);

    /**
     * <p>Flag stating whether taps on the component should be ignored.</p>
     *
     * JavaScript Info:
     * @property ignoreTaps
     * @type boolean
     * 
     */
    @JsProperty public native  boolean getIgnoreTaps();
    /**
     * <p>Flag stating whether taps on the component should be ignored.</p>
     *
     * JavaScript Info:
     * @property ignoreTaps
     * @type boolean
     * 
     */
    @JsProperty public native  void setIgnoreTaps(boolean value);

    /**
     * <p>The latest date that can be selected. All later dates will be disabled.</p>
     *
     * JavaScript Info:
     * @property maxDate
     * @type Date
     * 
     */
    @JsProperty public native  JavaScriptObject getMaxDate();
    /**
     * <p>The latest date that can be selected. All later dates will be disabled.</p>
     *
     * JavaScript Info:
     * @property maxDate
     * @type Date
     * 
     */
    @JsProperty public native  void setMaxDate(JavaScriptObject value);

    /**
     * <p>The earliest date that can be selected. All earlier dates will be disabled.</p>
     *
     * JavaScript Info:
     * @property minDate
     * @type Date
     * 
     */
    @JsProperty public native  JavaScriptObject getMinDate();
    /**
     * <p>The earliest date that can be selected. All earlier dates will be disabled.</p>
     *
     * JavaScript Info:
     * @property minDate
     * @type Date
     * 
     */
    @JsProperty public native  void setMinDate(JavaScriptObject value);

    /**
     * <p>A <code>Date</code> object defining the month to be displayed. Only year and<br>month properties are actually used.</p>
     *
     * JavaScript Info:
     * @property month
     * @type Date
     * 
     */
    @JsProperty public native  JavaScriptObject getMonth();
    /**
     * <p>A <code>Date</code> object defining the month to be displayed. Only year and<br>month properties are actually used.</p>
     *
     * JavaScript Info:
     * @property month
     * @type Date
     * 
     */
    @JsProperty public native  void setMonth(JavaScriptObject value);

    /**
     * <p>A <code>Date</code> object for the currently selected date.</p>
     *
     * JavaScript Info:
     * @property selectedDate
     * @type Date
     * 
     */
    @JsProperty public native  JavaScriptObject getSelectedDate();
    /**
     * <p>A <code>Date</code> object for the currently selected date.</p>
     *
     * JavaScript Info:
     * @property selectedDate
     * @type Date
     * 
     */
    @JsProperty public native  void setSelectedDate(JavaScriptObject value);

    /**
     * 
     *
     * JavaScript Info:
     * @property showWeekNumbers
     * @type Boolean
     * 
     */
    @JsProperty public native  boolean getShowWeekNumbers();
    /**
     * 
     *
     * JavaScript Info:
     * @property showWeekNumbers
     * @type Boolean
     * 
     */
    @JsProperty public native  void setShowWeekNumbers(boolean value);


}
