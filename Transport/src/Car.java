import java.util.HashMap;
import java.util.Map;

public class Car extends Transport{
    private Map<Integer,String> cities= new HashMap<>();
    private final Integer maxCities=3;
    private Integer counter=0;


    public Car(){
        this.setMaxWeight(500);
        this.setMaxVolume(2.0);
    }


    @Override
    public Boolean canGoToCity(String aCity) {
        Boolean output=false;
        if (cities.containsValue(aCity)){
            output=true;
        } else if (counter < maxCities) {
            output=true;
            cities.put(counter, aCity);
            counter++;
        }
        return output;
    }

}
