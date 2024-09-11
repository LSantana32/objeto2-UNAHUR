public abstract class Transport {
    private Double maxVolume;
    private Integer maxWeight;

    public Boolean canCarryPackage(Package aPackage) {
        return aPackage.getVolume()<=this.getMaxVolume() && aPackage.getWeight()<=this.getMaxWeight();
    }

    public abstract Boolean canGoToCity(String aCity);

    public Boolean canSendPackageToDestiny(Package aPackage) {
        return this.canCarryPackage(aPackage) && this.canGoToCity(aPackage.getDestiny());
    }

    public Integer getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(Integer newMaxWeight) {
        maxWeight = newMaxWeight;
    }

    public Double getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(Double newMaxVolume) {
        maxVolume = newMaxVolume;
    }
}
