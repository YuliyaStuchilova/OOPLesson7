package org.example.service;

import org.example.connection.Contact;
import org.example.contragent.Contragent;

public interface DataService {

    public void print();

    public void addContragent(Contragent contragent);

    public void delete(Contragent contragent);

    public void getAll();

    public void search(String name);

    public void saveAll();







}
