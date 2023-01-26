package org.example.connection;

public abstract class Contact {
    private final String name;

    public Contact(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public String toString(){
        return null;
    }
}
