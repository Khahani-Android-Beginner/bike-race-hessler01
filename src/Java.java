import model.Bike;
import model.Break;
import model.Gear;
import model.Map;

public class Java {
    public static void main(String[] args) {
        Break shimano = new Break();
        shimano.setModel("SHIMANO 2018");
        shimano.setPower(8);

        Gear shimanoG = new Gear();
        shimanoG.setModel("SH 2017");
        shimanoG.setSize(5);

        Bike gitan = new Bike();
        gitan.model = "Gitan 2018";
        gitan.gear = shimanoG;
        gitan.aBreak = shimano;

        gitan.pedal(8);
        System.out.println(gitan.speed);

        gitan.breaking(3);
        System.out.println(gitan.speed);
        gitan.breaking(3);
        System.out.println(gitan.speed);
        gitan.breaking(3);
        System.out.println(gitan.speed);
        gitan.breaking(3);
        System.out.println(gitan.speed);


        Map map1 = new Map();
        System.out.println(map1.getR2().maxSpeed);
        System.out.println(map1.getR4().maxSpeed);
    }
}
