package org.smartphone;

abstract class Contact {
    private String name;
    public String getName() {
        return this.name;
    }
    public Contact(String name) {
        this.name = name;
    }
}
