package model;

public class Map {
    private Direct d1;
    private Round r2;
    private Direct d3;
    private Round r4;

    public Map(){
        d1 = new Direct();

        r2 = new Round();
        r2.maxSpeed = 20;

        d3 = new Direct();

        r4 = new Round();
        r4.maxSpeed = 10;

        System.out.println("this constuctor");
    }

    public Direct getD1() {
        return d1;
    }

    public Round getR2() {
        return r2;
    }

    public Direct getD3() {
        return d3;
    }

    public Round getR4() {
        return r4;
    }
}
