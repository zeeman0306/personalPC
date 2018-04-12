package compParts;

public class Monitor {
    private String model;
    private String manufacturer;
    private int size;
    private int resolutionLength;
    private int resolutionLwidth;


    public Monitor(String model, String manufacturer, int size, int resolutionLength, int resolutionLwidth) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.size = size;
        this.resolutionLength = resolutionLength;
        this.resolutionLwidth = resolutionLwidth;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getSize() {
        return size;
    }

    public int getResolutionLength() {
        return resolutionLength;
    }

    public int getResolutionLwidth() {
        return resolutionLwidth;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", size=" + size +
                ", resolutionLength=" + resolutionLength +
                ", resolutionLwidth=" + resolutionLwidth +
                '}';
    }
}
