package com.venkat;

public class Laptop implements Computer {
    public Laptop(){
        System.out.println("object created");
    }

    @Override
    public void compile() {
        System.out.println("compiling for laptop");
    }
}
