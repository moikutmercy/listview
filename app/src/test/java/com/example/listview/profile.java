package com.example.listview; // Replace with your actual package name

public class profile {
    private int imageResource;
    private String name;
    private String age;
    private String email;
    private String phoneNumber;
    private String address;

    public profile(int imageResource, String name, String age, String email, String phoneNumber, String address) {
        this.imageResource = imageResource;
        this.name = name;
        this.age = age;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public int getImageResource() {
        return imageResource;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }
}
