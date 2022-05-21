import beepers.Beeper;
import engines.Engine;
import tanks.Tank;
import tracks.Music;

public class Bus extends Car{
    public Bus(Beeper beeper, Engine engine, Music music, Tank tank) {
        super(beeper, engine, music, tank);
    }
}
