package com.devanshu.SpringREST.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Alien {
    @Id
    private int aid;
    private String aneme;

    public Alien(){
        //Default Constructor
    }

    public Alien(int aid , String aneme){
        super();
        this.aid = aid;
        this.aneme = aneme;
    }


    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getAneme() {
        return aneme;
    }

    public void setAneme(String aneme) {
        this.aneme = aneme;
    }

    @Override
    public String toString() {
        return "Alien{" +
                "aid=" + aid +
                ", aneme='" + aneme + '\'' +
                '}';
    }
}
