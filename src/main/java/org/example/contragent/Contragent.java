package org.example.contragent;

import org.example.connection.Contact;
import org.example.util.DataWriter;

import java.util.ArrayList;
import java.util.List;

public class Contragent implements ContragentInterface{
    private String name;

    private List<Contact> contacts;

    public Contragent(String name, List<Contact> contacts) {
        this.name = name;
        this.contacts = contacts;
    }

    public String getName() {
        return name;
    }

    public List<Contact> getContacts() {
        List<Contact> copy = new ArrayList<>();
        for (Contact contact : contacts) {
            copy.add(contact);
        }
        return copy;
    }

    @Override
    public String toString() {
        return name +
                " " + contacts + "\n";
    }

    @Override
    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    @Override
    public void deleteContact(Contact contact) {
        contacts.remove(contact);

    }

}
