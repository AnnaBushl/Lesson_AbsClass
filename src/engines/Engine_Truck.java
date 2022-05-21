package engines;

import engines.Engine;

public class Engine_Truck implements Engine {
    @Override
    public String getSpeed() {
        return "Скорость = 75 км/ч";
    }
}
