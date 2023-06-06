package org.smartphone;

abstract class Contact {
    protected String name;
    public String getName() {
        return this.name;
    }
    protected Contact(String name) {
        this.name = name;
    }
}
