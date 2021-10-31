package com.studybuddy.springbackend.model;

import javax.persistence.*;
/*import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
 */

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String address;
    private int v;
    private int a;
    private int r;
    private int k;
    private int pref;
    private ArrayList<String> userinfo;

    public User() {
        
        
        /*0 is id
        1 is firstname 
        2 is lastname 
        3 is gender 
        4 v 
        5 a
        6 r
        7 k
        8 group size preference
        
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

    /*public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    */
    
    

}
