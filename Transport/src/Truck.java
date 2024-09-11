public class Truck extends Transport{
    public Truck(){
        this.setMaxWeight(16000);
        this.setMaxVolume(20.0);
    }

    @Override
    public Boolean canGoToCity(String aCity) {
        return true;
    }
}
