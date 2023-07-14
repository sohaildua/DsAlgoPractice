package org.designpattern.factorymethod;

public class FactoryMethod {
    public static void main(String[] args) {
        VideoGameType videoGameType = new Nintendo();
        videoGameType.getTax();
        videoGameType.calculateGamePrice(20);

    }
}


abstract class VideoGameType{
    protected double tax;
    abstract void  getTax();

    public void calculateGamePrice(double price){
            System.out.println(tax * price + price);
    }
}

