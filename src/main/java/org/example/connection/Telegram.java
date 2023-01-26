package org.example.connection;

public class Telegram extends Contact {


    public Telegram(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Telegram - " + super.getName() + '\n';
    }
}
