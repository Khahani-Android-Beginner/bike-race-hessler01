package model;

public class Gear {
    /**
     * model
     * size (between 0 and 10)
     */

    private String model;
    private int size;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        if (size < 0 && size > 10)
            return;
        
        this.size = size;
    }
}
