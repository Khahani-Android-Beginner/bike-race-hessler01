package model;

public class Bike {
    /**
     * name
     * gear
     * break
     * speed    ( speed < 0 => 0 )
     *
     *
     * pedal( rpm )         (speed = gear size * rpm )
     * breaking ( push )    (speed -= break power * push)
     */
    public String model;

    public Gear gear;

    public Break aBreak;

    public int speed;

    public void pedal(int rpm){
        speed = gear.getSize() * rpm;
    }

    public void breaking(int push){
        speed -= aBreak.getPower() * push;

        if (speed < 0)
            speed = 0;
    }

}
