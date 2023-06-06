package org.smartphone;

public class Main {
    public static void main(String[] args) {
        Friend friend = new Friend("josh", 123456);
        System.out.println(friend);

        Contact[] contacts = {
            new Friend("Tas", 12345),
            new Friend("Saman", 54321),
            new Friend("Ammar", 99999),
            new BusinessContact("Enrico", "Project404")
        };

        Smartphone smartphone = new Smartphone("Mein Phone", "Apple", contacts);

        smartphone.setPosition("Hamburg");
        System.out.println(smartphone);

        System.out.println();

        BusinessContact businessContact = new BusinessContact("Enrico", "Project404");
        System.out.println(businessContact);

        System.out.println();

        System.out.println(smartphone.getContact(2));

        System.out.println();

        System.out.println(smartphone.getContact("Enrico"));

        System.out.println();

        smartphone.removeContact("Tas");
        System.out.println(smartphone);

    }
}