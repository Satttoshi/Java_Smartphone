package org.smartphone;

import java.util.Objects;

abstract class Contact {
    protected String name;
    public String getName() {
        return this.name;
    }
    protected Contact(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Contact{" +
            "name='" + name + '\'' +
            '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Contact contact))
            return false;
        return Objects.equals(name, contact.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
