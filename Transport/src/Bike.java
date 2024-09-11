public class Bike extends Transport {
    private Integer packageCounter = 0;
    private String city = "";

    public Bike() {
        this.setMaxWeight(15);
        this.setMaxVolume(0.125);
    }

    @Override
    public Boolean canCarryPackage(Package aPackage) {
        Boolean puedeLlevar = false;
        if (super.canCarryPackage(aPackage) && packageCounter < 2) {
            packageCounter++;
            puedeLlevar = true;
        }
        return puedeLlevar;
    }

    public void assignCity(String aCity) {
        city = aCity;
    }

    public Boolean canGoToCity(String aCity) {
        Boolean output = false;
        if (city.isEmpty() || city.equals(aCity)) {
            output = true;
            if (city.isEmpty()) {
                this.assignCity(aCity);
            }
        }return output;
    }
}
