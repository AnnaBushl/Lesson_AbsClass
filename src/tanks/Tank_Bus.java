package tanks;

import tanks.Tank;

public class Tank_Bus implements Tank {
    @Override
    public String pourBenzin() {
        return "V = 200 литров";
    }
}
