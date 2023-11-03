package org.example;

public class Customer {
    private String fullName;
    private int age;
    private int phoneNumber;
    private String gender;

    public Customer(String fullName, int age, int phoneNumber, String gender) {
        this.fullName = fullName;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }

    // Геттеры и сеттеры

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
