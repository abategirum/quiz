package org.example.model;

public class Phone {
    private String phoneNo;
    private String label;

    public Phone(String phoneNo, String label) {
        this.phoneNo = phoneNo;
        this.label = label;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public String getLabel() {
        return label;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "phoneNo='" + phoneNo + '\'' +
                ", label='" + label + '\'' +
                '}';
    }
}
