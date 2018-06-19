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

    public void pedal(int rpm){
        //...
    }

}
