package com.restapi.RestAPI;

public class User {
    private String firstName;
    private String lastName;
    private int age;
    private Long id;

    private static Long seqId = 1l;

    public User() {
    }

    public User(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.id = incrementId();
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public static Long incrementId() {
        return seqId++;
    }

    public User addNewId() {
        this.id = incrementId();
        return this;
    }
}
