/**
* @author augustine.d.nguyen
* @email augustine.d.nguyen@outlook.com
* @year 2020
*
*/
package com.tinyolo.java.designpattern.prototype;

import java.util.Date;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * An abstract of a prototype
 */
@Getter
@Setter
@NoArgsConstructor
public abstract class DataRow implements Row {
    /** The row name. */
    private String rowName;
    /** The creation date. */
    private Date createDate;

    /** Create a new DataRow from the a row. */
    public DataRow(DataRow row) {
        this.rowName = row.rowName;
        this.createDate = row.createDate;
    }

    public abstract Row clone();
}
