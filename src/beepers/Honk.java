package beepers;

import beepers.Beeper;

public class Honk implements Beeper {

    @Override
    public String makeSound() {
        return "Бип-Бип-Бип-Бип";
    }
}
