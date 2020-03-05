package com.cecum.pf;

import java.util.List;

public class MutablePerson_3 {
	
	private String firstName;
    private String lastName;

    private final List<String> emails; //AGREGAMOS FINAL

    public MutablePerson_3(List<String> emails) {
        this.emails = emails;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<String> getEmails() {
        return emails;
    }

    @Override
    public String toString() {
        return "MutablePerson_3{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", emails=" + emails +
                '}';
    }
}
