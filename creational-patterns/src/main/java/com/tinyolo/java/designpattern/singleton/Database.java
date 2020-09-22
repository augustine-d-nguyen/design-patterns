/**
* @author augustine.d.nguyen
* @email augustine.d.nguyen@outlook.com
* @year 2020
*
*/
package com.tinyolo.java.designpattern.singleton;

/**
 * A single connection will be shared among other functions.
 * So we will apply the singleton pattern to archive it.
 *
 */
public class Database {
    // - This static variable holds the single instance.
    private static Database singleInstance;
    // - Make sure other functions cannot create directly an instance.
    private Database() {}

    // - A global method at class level to provide the instance to others.
    public static Database getInstance() {
        // - Create an instance if not exist
        if (null == singleInstance) {
            singleInstance = new Database();
        }
        return singleInstance;
    }
}
