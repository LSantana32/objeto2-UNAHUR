public class Package {
    private double volume;
    private int weight;
    private String destiny;

    public Package(double height, double width, double depth,int weight, String destiny) {
        this.volume=height*width*depth;
        this.weight=weight;
        this.destiny=destiny;
    }

    public String getDestiny() {
        return this.destiny;
    }

    public int getWeight() {
        return this.weight;
    }

    public double getVolume() {
        return this.volume;
    }
}
