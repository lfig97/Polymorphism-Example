package ExampleCode;

import java.util.ArrayList;

public class App {
    public static void main(String[] args){
        Dog dog = new Dog();
        Cat cat = new Cat();
        Animal animal = new Dog();

        ArrayList<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        //dogs.add(new String("not acceptable"));

        Interrogator.convinceToTalk(dog); //prints "Woof!"
        Interrogator.convinceToTalk(cat); //prints "Meow!"
        Interrogator.convinceToTalk(animal); //prints "Woof!"
    }
}
