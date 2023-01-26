package org.example.connection;

public class VK extends Contact {


    public VK(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "VK - " + super.getName() + '\n';
    }

}
