/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from vaadin-grid project by Vaadin Ltd
 * that is licensed with Apache-2.0 license.
 */
package com.vaadin.polymer.vaadin;

import elemental2.dom.*;
import com.google.gwt.core.client.JavaScriptObject;
import elemental2.core.Array;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import com.vaadin.polymer.PolymerFunction;


/**
 * <p>Object for accessing and controlling footer rows.</p>
 * <h4 id="example-">Example:</h4>
 * <pre><code class="lang-js">grid.footer.addRow();
 * var footerCell = grid.footer.getCell(0,0);
 * </code></pre>
 */
@JsType(isNative=true)
public interface Footer {

    @JsOverlay public static final String NAME = "Footer";
    @JsOverlay public static final String SRC = "vaadin-grid/vaadin-grid-doc.html";
    @JsOverlay public default <T> T cast() {
      return (T)this;
    }


    /**
     * <p>Hides all footer rows in the grid if set to <code>true</code>.</p>
     * <h4 id="javascript-example-">JavaScript example:</h4>
     * <pre><code class="lang-js">grid.footer.hidden = true;
     * </code></pre>
     * <h4 id="declarative-example-">Declarative example:</h4>
     * <pre><code class="lang-html">&lt;tfoot hidden&gt;
     * </code></pre>
     *
     * JavaScript Info:
     * @property hidden
     * @type boolean
     * 
     */
    @JsProperty  boolean getHidden();
    /**
     * <p>Hides all footer rows in the grid if set to <code>true</code>.</p>
     * <h4 id="javascript-example-">JavaScript example:</h4>
     * <pre><code class="lang-js">grid.footer.hidden = true;
     * </code></pre>
     * <h4 id="declarative-example-">Declarative example:</h4>
     * <pre><code class="lang-html">&lt;tfoot hidden&gt;
     * </code></pre>
     *
     * JavaScript Info:
     * @property hidden
     * @type boolean
     * 
     */
    @JsProperty  void setHidden(boolean value);

    /**
     * <p>Number of rows in the footer.</p>
     *
     * JavaScript Info:
     * @property rowCount
     * @type Number
     * 
     */
    @JsProperty  double getRowCount();
    /**
     * <p>Number of rows in the footer.</p>
     *
     * JavaScript Info:
     * @property rowCount
     * @type Number
     * 
     */
    @JsProperty  void setRowCount(double value);


    /**
     * <p>Sets the CSS class name for a footer row.</p>
     *
     * JavaScript Info:
     * @method setRowClassName
     * @param {Number} rowIndex  
     * @param {String} className  
     * 
     * 
     */
     void setRowClassName(double rowIndex, String className);

    /**
     * <p>Returns an object reference to a particular footer cell.</p>
     *
     * JavaScript Info:
     * @method getCell
     * @param {Number} rowIndex  
     * @param {(Number|String)} column  
     * 
     * @return {HeaderAndFooterCell}
     */
     HeaderAndFooterCell getCell(double rowIndex, Object column);

    /**
     * <p>Adds a new footer row.</p>
     *
     * JavaScript Info:
     * @method addRow
     * @param {Number} index  
     * 
     * 
     */
     void addRow(double index);

    /**
     * <p>Removes a specific footer row.</p>
     *
     * JavaScript Info:
     * @method removeRow
     * @param {Number} index  
     * 
     * 
     */
     void removeRow(double index);

}
