package org.smartphone;

import java.util.Arrays;

public class Smartphone implements Radio, GPS {
    private String modelName;
    private String brandName;
    private Contact[] contacts;

    private String position = "Köln";

    public Smartphone(){}

    public Smartphone(String modelName, String brandName, Contact[] contacts) {
        this.modelName = modelName;
        this.brandName = brandName;
        this.contacts = contacts;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getModelName() {
        return this.modelName;
    }

    public void setContacts(Contact[] contacts) {
        this.contacts = contacts;
    }

    public Contact[] getContacts() {
        return this.contacts;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getBrandName() {
        return this.brandName;
    }

    @Override
    public boolean startRadio() {
        System.out.println("Radio started");
        return true;
    }

    @Override
    public boolean stopRadio() {
        System.out.println("Radio stopped");
        return false;
    }

    @Override
    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String getPosition() {
        return this.position;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
            "modelName='" + modelName + '\'' +
            ", brandName='" + brandName + '\'' +
            ", contacts=" + Arrays.toString(contacts) +
            ", position='" + position + '\'' +
            '}';
    }

    public void addContact(Contact contact) {
        Contact[] newContacts = Arrays.copyOf(this.contacts, this.contacts.length + 1);
        newContacts[newContacts.length - 1] = contact;
        this.contacts = newContacts;
    }

    public Contact getContact(int index) {
        return this.contacts[index];
    }
}
