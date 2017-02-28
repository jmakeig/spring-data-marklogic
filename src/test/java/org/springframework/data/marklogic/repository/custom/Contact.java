package org.springframework.data.marklogic.repository.custom;

import org.springframework.data.marklogic.core.Person;
import org.springframework.data.marklogic.core.mapping.Document;
import org.springframework.data.marklogic.core.mapping.TypePersistenceStrategy;

@Document(typeStrategy = TypePersistenceStrategy.NONE)
public class Contact extends Person {
    String phone;

    public Contact(String name, String phone) {
        super(name);
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
