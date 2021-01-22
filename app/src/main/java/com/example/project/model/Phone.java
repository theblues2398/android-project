package com.example.project.model;

import java.io.Serializable;

public class Phone extends Account implements Serializable {
    private int phoneID;
    private String title;
    private String model;
    private String status;
    private String color;
    private String memory;
    private String description;
    private String price;
    private byte[] image;
    private int accountID;

    public Phone() {
    }

    public Phone(String title, String model, String status, String color, String memory,
                 String description, String price, byte[] image, int accountID) {
        this.title = title;
        this.model = model;
        this.status = status;
        this.color = color;
        this.memory = memory;
        this.description = description;
        this.price = price;
        this.image = image;
        this.accountID = accountID;
    }

    public Phone(int PhoneID, String title, String model, String status, String color, String memory,
                 String description, String price, int accountID) {
        this.phoneID = PhoneID;
        this.title = title;
        this.model = model;
        this.status = status;
        this.color = color;
        this.memory = memory;
        this.description = description;
        this.price = price;
        this.accountID = accountID;
    }



    public Phone(int phoneID, String title, String model, String status, String color, String memory, String description, String price, byte[] image, int accountID) {
        this.phoneID = phoneID;
        this.title = title;
        this.model = model;
        this.status = status;
        this.color = color;
        this.memory = memory;
        this.description = description;
        this.price = price;
        this.image = image;
        this.accountID = accountID;
    }

    public int getPhoneID() {
        return phoneID;
    }

    public void setPhoneID(int phoneID) {
        this.phoneID = phoneID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getAccountID() {
        return accountID;
    }
    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }
    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }
}
