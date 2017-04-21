import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by u6023478 on 4/7/2017.
 */
public class CHMTest {

    public static void main(String[] args) {
        ConcurrentHashMap<String, String> concurrentHashMap = new ConcurrentHashMap();
        concurrentHashMap.put("A","A");

        System.out.println(concurrentHashMap.remove(null));

    }
}
