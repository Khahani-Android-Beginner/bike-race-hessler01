package model;

public class Ciclist {
    /**
     * name
     * roundPerMinutes
     * pushPower
     * bike
     * speed
     *
     * pedal()
     * breaking()
     */
    private String name;
    private int pushPower;
    private int roundPerMinutes;

    public int getRoundPerMinutes() {
        return roundPerMinutes;
    }

    public void setRoundPerMinutes(int roundPerMinutes) {
        this.roundPerMinutes = roundPerMinutes;
    }

    private Bike bike;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPushPower() {
        return pushPower;
    }

    public void setPushPower(int pushPower) {
        this.pushPower = pushPower;
    }

    public Bike getBike() {
        return bike;
    }

    public void setBike(Bike bike) {
        this.bike = bike;
    }

    public int getSpeed(){
        return bike.speed;
    }

    public void pedal(){
        bike.pedal(roundPerMinutes);
    }

    public void breaking(){
        bike.breaking(pushPower);
    }

}
