package com.urneba.iwvg.ecosystem.practicas;

public class User {

    private int number;

    private String name;

    private String familyName;

    public User(int number, String name, String familyName) {
        this.number = number;
        this.name = this.format(name);
        this.familyName = this.format(familyName);
    }

    private String format(String string) {
        return string.trim().substring(0, 1).toUpperCase() + string.substring(1).toLowerCase();
    }

    public String fullName() {
        return this.name + " " + this.familyName;
    }

    public String fullNameUpper() {
        return this.fullName().toUpperCase();
    }

    public String fullNameLower() {
        return this.fullName().toLowerCase();
    }

    public String initials() {
        return this.name.substring(0, 1) + ".";
    }

    public int getNumber() {
        return this.number;
    }

    public String getName() {
        return this.name;
    }

    public String getFamilyName() {
        return this.familyName;
    }

    @Override
    public String toString() {
        return "User{" +
                "number=" + this.number +
                ",name=" + this.name +
                ",familyName=" + this.familyName +
                '}';
    }
}
