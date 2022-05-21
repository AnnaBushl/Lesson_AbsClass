import tracks.Music;
import beepers.Beeper;
import engines.Engine;
import tanks.Tank;

public abstract class Car {
    Beeper beeper;
    Engine engine;
    Music music;
    Tank tank;

    public Car(Beeper beeper, Engine engine, Music music,Tank tank) {
        this.beeper = beeper;
        this.engine = engine;
        this.music = music;
        this.tank = tank;
    }

}
