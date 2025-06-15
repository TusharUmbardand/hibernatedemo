package com.tusha.mapping;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Subject {

    @Id
    private int id ;

    private String name ;

    private int duration;

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

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
