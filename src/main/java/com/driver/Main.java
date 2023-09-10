package com.driver;

public class Main {
    public static void main(String[] args){
        RWOnly rwOnly=new RWOnly();
        System.out.println("Befor setting name "+ rwOnly.getName());
        rwOnly.setName("vamsi");
        System.out.println(rwOnly.getName());
    }
}