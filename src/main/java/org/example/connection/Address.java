package org.example.connection;

public class Address extends Contact {


    public Address(String name) {
        super(name);
    }
    @Override
    public String toString() {
        return "Адрес - " + super.getName() + '\n';
    }
}
