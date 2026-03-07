import java.util.HashMap;
import java.util.Map;

public class DistanceService {

    static Map<String, Map<String, Double>> distanceMap = new HashMap<>();

    public static void initialize() {

        addDistance("Delhi","Mumbai",1400);
        addDistance("Delhi","Jaipur",280);
        addDistance("Delhi","Chandigarh",250);
        addDistance("Mumbai","Jaipur",1140);
        addDistance("Mumbai","Chandigarh",1660);
        addDistance("Jaipur","Chandigarh",500);
    }

    private static void addDistance(String a, String b, double d) {

        distanceMap.putIfAbsent(a,new HashMap<>());
        distanceMap.putIfAbsent(b,new HashMap<>());

        distanceMap.get(a).put(b,d);
        distanceMap.get(b).put(a,d);
    }

    public static double getDistance(String a,String b){

        return distanceMap.get(a).get(b);
    }
}