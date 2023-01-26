package org.example.connection;

public class Phone extends Contact {


    public Phone(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Телефон - " + super.getName() + '\n';
    }
}
