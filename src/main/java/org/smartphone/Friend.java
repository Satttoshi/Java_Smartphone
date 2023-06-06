package org.smartphone;

public class Friend extends Contact{
    private int phoneNumber;

    public Friend(){
        super("Unknown name");
    }

    public Friend(String name, int phoneNumber){
        super(name);
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Friend{" +
            "phoneNumber=" + phoneNumber +
            "} " + super.toString();
    }
}
