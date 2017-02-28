package com.example;

public class Client {
    public static void main(String[] args){
        General general=new General();
        general.attach();
        general.undo();
    }
}
