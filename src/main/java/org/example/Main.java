package org.example;

import org.example.connection.*;
import org.example.contragent.Contragent;
import org.example.service.PhoneBook;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Contragent contragent1 = new Contragent("Иван", Arrays.asList(new Phone("89211001010"),
                new Email("ivan@mail.ru")));
        Contragent contragent2 = new Contragent("Анна", Arrays.asList(new Phone("89115664523"),
                new Email("anna@mail.ru")));
        Contragent contragent3 = new Contragent("Школа", Arrays.asList(new Address("ул.Великая, д.10"),
                new Email("shool@mail.ru")));
        PhoneBook phoneBook = new PhoneBook(Arrays.asList(contragent1,contragent2,contragent3));
        phoneBook.print();

        System.out.println("---------------------------------");

        phoneBook.search("Иван");
        phoneBook.getAll();

        phoneBook.saveAll();
    }
}