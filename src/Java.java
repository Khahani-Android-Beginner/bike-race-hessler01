import model.Bike;
import model.Break;
import model.Gear;

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

        System.out.println(gitan.gear.getModel());

    }
}
