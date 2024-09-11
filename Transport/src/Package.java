public class Package {
    private Double volume;
    private Integer weight;
    private String destiny;

    public Package(Double height, Double width, Double depth,Integer weight, String destiny) {
        this.volume=height*width*depth;
        this.weight=weight;
        this.destiny=destiny;
    }

    public String getDestiny() {
        return this.destiny;
    }

    public Integer getWeight() {
        return this.weight;
    }

    public Double getVolume() {
        return this.volume;
    }
}
