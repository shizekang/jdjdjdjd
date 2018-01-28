import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Test1 {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
        Map<String, Object> map = new HashMap<String, Object>();
        Iterator<Map.Entry<String, Object>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = iterator.next();
            String key = (String) entry.getKey();

        }

    }
}
