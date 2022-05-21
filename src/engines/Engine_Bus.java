package engines;

import engines.Engine;

public class Engine_Bus implements Engine {
    @Override
    public String getSpeed() {
        return "Скорость = 60 км/ч";
    }
}
