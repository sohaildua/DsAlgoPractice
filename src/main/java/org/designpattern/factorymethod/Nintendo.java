package org.designpattern.factorymethod;

public class Nintendo extends VideoGameType {

    @Override
    void getTax() {
        tax = 0.36;
    }
}
