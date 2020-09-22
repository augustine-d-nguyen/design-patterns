/**
* @author augustine.d.nguyen
* @email augustine.d.nguyen@outlook.com
* @year 2020
*
*/
package com.tinyolo.java.designpattern;

import static org.testng.Assert.assertEquals;

import java.util.Date;

import com.tinyolo.java.designpattern.prototype.PersonRow;
import com.tinyolo.java.designpattern.singleton.Database;
/**
 * Creation patterns
 */
public class CreationalPatterns {
    public static void main(final String[] args) {

        // - Singleton.
        final Database one = Database.getInstance();
        final Database two = Database.getInstance();
        assertEquals(one, two);

        // - Prototype
        final PersonRow rowOne = new PersonRow();
        rowOne.setRowName("rowOne");
        rowOne.setCreateDate(new Date());
        rowOne.setPersonName("augustine");
        rowOne.setPersonAddress("the earth");
        // - Clone
        final PersonRow cloneRow = PersonRow.class.cast(rowOne.clone());
        assertEquals(rowOne.getRowName(), cloneRow.getRowName());
    }
}
