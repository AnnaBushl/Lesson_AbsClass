import beepers.Beeper;
import beepers.Honk;
import beepers.Signal;
import engines.Engine;
import engines.Engine_Bus;
import engines.Engine_Truck;
import tanks.Tank;
import tanks.Tank_Bus;
import tanks.Tank_Truck;
import tracks.Music;
import tracks.Music_Bus;
import tracks.Music_Truck;

public class Main {

    public static void main(String[] args) {
        Beeper honk = new Honk();
        Engine engine_Truck = new Engine_Truck();
        Music music_Truck = new Music_Truck();
        Tank tank_Truck= new Tank_Truck();

        Truck truck = new Truck(honk, engine_Truck, music_Truck, tank_Truck);

        Beeper signal = new Signal();
        Engine engine_Bus = new Engine_Bus();
        Music music_Bus = new Music_Bus();
        Tank tank_Bus= new Tank_Bus();

        Bus bus = new Bus(signal, engine_Bus, music_Bus, tank_Bus);


        System.out.println("Данные по грузовику:");
        System.out.println(truck.beeper.makeSound());
        System.out.println(truck.engine.getSpeed());
        System.out.println(truck.music.playMusic());
        System.out.println(truck.tank.pourBenzin());

        System.out.println("-----------");

        System.out.println("Данные по автобусу:");
        System.out.println(bus.beeper.makeSound());
        System.out.println(bus.engine.getSpeed());
        System.out.println(bus.music.playMusic());
        System.out.println(bus.tank.pourBenzin());


    }
}
