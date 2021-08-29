package com.mkm.springmvc.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Alien {
    @Id
    private int id;
    private String name;
    private int age;


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Alien() {
        System.out.println("Alien Object is created");
    }

    public Alien(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getAid() {
        return id;
    }

    public void setAid(int id) {
        this.id = id;
    }

    public String getAname() {
        return this.name;
    }

    public void setAname(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Alien{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
