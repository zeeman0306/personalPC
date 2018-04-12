package compParts;

public class Case {
    private String model;
    private String manufacturer;
    private String powerSupply;
    private int dimensionsLength;
    private int dimensionswidth;


    public Case(String model, String manufacturer, String powerSupply, int dimensionsLength, int dimensionswidth) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.powerSupply = powerSupply;
        this.dimensionsLength = dimensionsLength;
        this.dimensionswidth = dimensionswidth;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public int getDimensionsLength() {
        return dimensionsLength;
    }

    public int getDimensionswidth() {
        return dimensionswidth;
    }

    @Override
    public String toString() {
        return "Case{" +
                "model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", powerSupply='" + powerSupply + '\'' +
                ", dimensionsLength=" + dimensionsLength +
                ", dimensionswidth=" + dimensionswidth +
                '}';
    }
}
