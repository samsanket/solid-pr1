package org.sanket.solid.funct;

public class Dog extends Animal{

    @Override
    public  String getName(){
        return "Dog";
    }

    public static void main(String[] args) {
        Animal animal=  new Dog();
        System.out.println(animal.getName());
        Animal animal1 = new Animal();

        System.out.println(animal1.getName());


    }
}
