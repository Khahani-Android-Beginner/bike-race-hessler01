package model;

public class Break {

    //Ctrl + Alt + L

    /**
     * model
     * power    (between 0 and 10)
     */
    private String model;
    private int power;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        if (power > 0 && power < 10)
            return;

        this.power = power;
    }
}
