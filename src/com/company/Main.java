package com.company;

public class Main {

    public static void main(String[] args) {

        Animal animal = new Cat();
        animal.makeSound();

        Animal animal1 = new Dog();
        animal1.makeSound();

        Animal animal2 = new Snake();
        animal2.makeSound();


    }
}

class Animal{

    public void makeSound(){

        System.out.println("The sound is : " );
    }
}

class Cat extends Animal{

    public void makeSound(){

        System.out.println("Meow");
    }
}

class Dog extends Animal{

    public void makeSound(){

        System.out.println("Bark");

    }

}

class Snake extends Animal{
    public void makeSound(){
        System.out.println("Hiss");
    }
}