package org.example.service;

import org.example.contragent.Contragent;
import org.example.util.DataWriter;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook implements DataService{
    private final List<Contragent> book;

    public PhoneBook(List<Contragent> book) {
        this.book = book;
    }

    public List<Contragent> getBook() {
        List<Contragent> copy = new ArrayList<>();
        for (Contragent contact : book) {
            copy.add(contact);
        }
        return copy;
    }

    @Override
    public String toString() {
        return  book + "\n";
    }

    public void addContragent(Contragent contragent){
        book.add(contragent);
    }

    public void delete(Contragent contragent){
        book.remove(contragent);
    }

    public void getAll(){
        for (Contragent contact : book) {
            System.out.println(contact.getName());
        }
    }

    public void search(String name){
        for (Contragent contact : book) {
            if(name.equals(contact.getName())){
                System.out.println(contact);
            };
        }
    }

    @Override
    public void print() {
        System.out.println(getBook());

    }

    public void saveAll() {
        DataWriter dataWriter = new DataWriter();
        dataWriter.writeFileStudent(book);

    }

}
