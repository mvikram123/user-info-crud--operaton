package com.jpaIntroduction.jpademo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Author {
    @Id
    int id;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    String name;
    int noOfBooks;

    public Author(){

    }


    public Author(int id, String name, int noOfBooks) {
        this.id = id;
        this.name = name;
        this.noOfBooks = noOfBooks;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNoOfBooks() {
        return noOfBooks;
    }

    public void setNoOfBooks(int noOfBooks) {
        this.noOfBooks = noOfBooks;
    }
}
