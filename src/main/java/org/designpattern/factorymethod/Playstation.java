package org.designpattern.factorymethod;

public class Playstation extends VideoGameType{
    @Override
    void getTax() {
        tax = 0.30;
    }
}

