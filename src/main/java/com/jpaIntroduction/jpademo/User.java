package com.jpaIntroduction.jpademo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_info")
public class User {



    @Id
    @Column(name="id")
    int rollNo;
    String name;
    String emailId;
    String mob;
    //String error;
 public User(){

 }
    public User(int rollNo, String name, String emailId, String mob) {
        this.rollNo = rollNo;
        this.name = name;
        this.emailId = emailId;
        this.mob = mob;
      //  this.error=error;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getMob() {
        return mob;
    }

    public void setMob(String mob) {
        this.mob = mob;
    }

//    public String getError(){
//     return error;
//    }
//    public String setError(String error){
//     return this.error=error;
//    }
}
