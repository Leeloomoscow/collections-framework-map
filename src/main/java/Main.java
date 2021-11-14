import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>(); //уникальный ключ:значение
        map.put("key", 2);
        map.put("key1", 3);
        map.put("key2", 4);
        map.put("key3", 5);
        map.put("key4", 6);

        Integer key2 = map.get("key2");
        System.out.println(key2);

        //map.remove("key"); удаление элемента

        Set<String> strings = map.keySet(); //получение всех ключей
        for (String key : strings) {
            System.out.println(key);
//        System.out.println(map);

            for (Integer values : map.values()) { //получение всех значений
                System.out.println(values);

            }
        }
    }
}
