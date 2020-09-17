package practice.InterfaceEdible.animal;

import practice.InterfaceEdible.edible.Edible;

public class Tiger extends Animal implements Edible{
    @Override
    public String makeSound() {
        return "Tiger: roarrrrr!";
    }

    @Override
    public String howToEat() {
        return "could be meat. ";
    }
}
