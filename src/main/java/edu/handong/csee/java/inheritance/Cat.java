package edu.handong.csee.java.inheritance;

public class Cat extends Animal {
    public static void testClassMethod() {
        System.out.println("The static method in Cat");
    }
    public void testInstanceMethod() {
        System.out.println("The instance method in Cat");
    }

    public static void main(String[] args) {
        Cat myCat = new Cat();
        Animal myAnimal = myCat;//다형성.myAnimal은 Animal클래스이지만 Cat가 될 수 있음.
        Animal.testClassMethod();//
        myAnimal.testInstanceMethod();//overriding->부모 메소드를 가려버림.
        
        Dog myDog = new Dog();
        Animal myAnimal1 = myDog;
        Animal.testClassMethod();//다형성.myAnimal은 Animal클래스이지만 Dog 될 수 있음.
        myAnimal1.testInstanceMethod();//overriding->부모 메소드를 가려버림.
        
    }
}
