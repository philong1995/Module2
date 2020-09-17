package practice.InterfaceEdible;

import practice.InterfaceEdible.animal.Animal;
import practice.InterfaceEdible.animal.Chicken;
import practice.InterfaceEdible.animal.Tiger;
import practice.InterfaceEdible.edible.Edible;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
//            animal.makeSound();
            System.out.println(animal.makeSound());
// instanceof : kiểm tra xem đối tượng có phải là lớp hiện tại không.
            if (animal instanceof Chicken) {
                Edible edibler = (Chicken) animal;
                System.out.println(edibler.howToEat());
            }
            else if (animal instanceof Tiger) {
                Edible edibler = (Tiger) animal;
                System.out.println(edibler.howToEat());
            }
        }
    }
}
