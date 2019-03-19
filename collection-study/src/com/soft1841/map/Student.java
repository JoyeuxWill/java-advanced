package com.soft1841.map;

public class Student {
    public Integer ID;
    public String name;

    @Override
    public String toString() {
        return ID + "       " + name ;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(Integer ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    public Student() {
    }
}
