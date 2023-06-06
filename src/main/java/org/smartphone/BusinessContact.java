package org.smartphone;

public class BusinessContact extends Contact {
    private String companyName;

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return this.companyName;
    }

    public BusinessContact(){
        super("Unknown name");
        this.companyName = "Unknown company name";
    }

    public BusinessContact(String name) {
        super(name);
        this.companyName = "Unknown company name";
    }

    public BusinessContact(String name, String companyName) {
        super(name);
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return "BusinessContact{" +
            "companyName='" + companyName + '\'' +
            "} " + super.toString();
    }
}
