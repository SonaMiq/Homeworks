package com.company.Day0408;

public class Main {
    public static void main(String[] args) {
        /*
        new Cat().sound();
        new Horse().sound();

         */

        Animal cat1 = new Cat();
        Cat cat2 = new Cat();
        cat1.sound();
        cat2.sound();
        System.out.println(cat1.age+" "+cat1.name);
        System.out.println(cat2.age+" "+cat2.name);

        Shape[] arr=new Shape[5];
        arr[0]=new Square(4);
        arr[1]=new Circle(8);
        arr[2]=new Rectangle(5,4);
        arr[3]=new Circle(4);
        arr[4]=new Square(7);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i].area()+" "+arr[i].perimeter());
        }
    }
}
