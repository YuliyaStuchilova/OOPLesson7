package org.example.connection;

public class Email extends Contact {


    public Email(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Email - " + super.getName() + '\n';
    }
}
