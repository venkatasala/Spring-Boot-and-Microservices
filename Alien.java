package com.venkat;

public class Alien {
    private int age;
    //private Laptop lab;
    private Computer com;
    public Alien(){

        System.out.println("object created for Alien");
    }

//    public Alien(int age, Laptop lab) {
//        this.age = age;
//        this.lab = lab;
//    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("setter called");
        this.age = age;
    }

//    public Laptop getLab() {
//        return lab;
//    }
//
//    public void setLab(Laptop lab) {
//        this.lab = lab;
//    }


    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    public void code(){

        System.out.println("coding");
        //lab.compile();
        com.compile();
    }

}
