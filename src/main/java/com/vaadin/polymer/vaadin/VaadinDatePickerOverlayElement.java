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
public class VaadinDatePickerOverlayElement extends PolymerElement {

    @JsOverlay public static final String TAG = "vaadin-date-picker-overlay";
    @JsOverlay public static final String SRC = "vaadin-date-picker/vaadin-date-picker.html";


    /**
     * <p>Date value which is focused using keyboard.</p>
     *
     * JavaScript Info:
     * @property focusedDate
     * @type Date
     * 
     */
    @JsProperty public native  JavaScriptObject getFocusedDate();
    /**
     * <p>Date value which is focused using keyboard.</p>
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
     * <p>Date which should be visible when there is no value selected.</p>
     *
     * JavaScript Info:
     * @property initialPosition
     * @type Date
     * 
     */
    @JsProperty public native  JavaScriptObject getInitialPosition();
    /**
     * <p>Date which should be visible when there is no value selected.</p>
     *
     * JavaScript Info:
     * @property initialPosition
     * @type Date
     * 
     */
    @JsProperty public native  void setInitialPosition(JavaScriptObject value);

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
     * <p>The value for this element.</p>
     *
     * JavaScript Info:
     * @property selectedDate
     * @type Date
     * 
     */
    @JsProperty public native  JavaScriptObject getSelectedDate();
    /**
     * <p>The value for this element.</p>
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


    /**
     * <p>Scrolls the month and year scrollers enough to reveal the given date.</p>
     *
     * JavaScript Info:
     * @method revealDate
     * @param {} date  
     * 
     * 
     */
    public native void revealDate(Object date);

    /**
     * <p>Scrolls the list to the given Date.</p>
     *
     * JavaScript Info:
     * @method scrollToDate
     * @param {} date  
     * @param {} animate  
     * 
     * 
     */
    public native void scrollToDate(Object date, Object animate);

    /**
     * 
     *
     * JavaScript Info:
     * @method announceFocusedDate
     * 
     * 
     */
    public native void announceFocusedDate();

    /**
     * <p>Focuses the cancel button</p>
     *
     * JavaScript Info:
     * @method focusCancel
     * 
     * 
     */
    public native void focusCancel();

}
