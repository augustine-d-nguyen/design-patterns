package com.tinyolo.java.designpattern.prototype;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * A personal data row.
 */
@Getter
@Setter
@NoArgsConstructor
public class PersonRow extends DataRow {
    /** Specific attribute of the PersonRow data. */
    private String personName;
    /** Specific attribute of the PersonRow data. */
    private String personAddress;

    public PersonRow(final PersonRow row) {
        // - Invoke parent constructor to copy the its attribute's values.
        super(row);
        // - Copy the specific attribute's values.
        this.personName = row.personName;
        this.personAddress = row.personAddress;
    }
    public Row clone() {
        return new PersonRow(this);
    }
}
