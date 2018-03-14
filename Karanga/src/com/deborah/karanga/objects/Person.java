package com.deborah.karanga.objects;

import java.util.Date;

public class Person {

    private String id;
    private String firstName;
    private String lastName;
    private Date   dateOfBirth;
    private String city;
    private String cityzenship;
    private String employment;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCityzenship() {
        return cityzenship;
    }

    public void setCityzenship(String cityzenship) {
        this.cityzenship = cityzenship;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmployment() {
        return employment;
    }

    public void setEmployment(String employment) {
        this.employment = employment;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public int getAge() {
    	Date dateActuelle= new Date();
    	return 0;
    }
}
