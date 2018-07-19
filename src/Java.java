import model.*;

public class Java {
    public static void main(String[] args) {
        System.out.println("!!! "+" Student name: dnaial hassan zadeh");


        System.out.println("match started");


        Break shimano = new Break();
        shimano.setModel("SHIMANO 2018");
        shimano.setPower(2);

        Gear shimanoG = new Gear();
        shimanoG.setModel("SH 2017");
        shimanoG.setSize(5);

        Bike gitan = new Bike();
        gitan.model = "Gitan 2018";
        gitan.gear = shimanoG;
        gitan.aBreak = shimano;

        Ciclist khahani = new Ciclist();
        khahani.setBike(gitan);
        khahani.setName("Mr.khahani");
        khahani.setPushPower(5);
        khahani.setRoundPerMinutes(8);


        Map map = new Map();

        //Direct1
        khahani.pedal();
        System.out.println(khahani.getSpeed());

        // round2
        while(khahani.getSpeed() > map.getR2().maxSpeed) {


            khahani.breaking();
            if (khahani.getSpeed() > 50) {
                System.out.println("ciclist exited of race");

            }
            else {
                System.out.println(khahani.getSpeed());
            }
        }
        // direct3
        khahani.pedal();
        System.out.println(khahani.getSpeed());

        // round 4
        while(khahani.getSpeed() > map.getR2().maxSpeed) {


            khahani.breaking();
            if (khahani.getSpeed() > 40) {
                System.out.println("ciclist exited of race");

            }
            else {
                System.out.println(khahani.getSpeed());
            }
        }

        System.out.println("Match finished");
    }
}
