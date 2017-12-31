
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here
        User user = new User();
        user.setName("小高");
        user.setAge(13);
        user.setBirthday(new Date(20l * 366 * 24 * 3600 * 1000));

        Car car = new Car();
        car.setColor("黄色");
        car.setCarname("保时捷");
        user.setCar(car);

        Map map = new HashMap();
        map.put("aa", "this is aa");
        map.put("bb", "this is bb");
        map.put("cc", "this is cc");
        user.setMap(map);

        List list = new ArrayList() {
        };
        list.add("普洱");
        list.add("大红袍");
        user.setList(list);

        Set set = new HashSet();
        set.add("篮球");
        set.add("足球");
        set.add("乒乓球");
        user.setSet(set);

        ObjectMapper mapper=new ObjectMapper();

        String json=mapper.writeValueAsString(user);
        System.out.println(json);

        Map m=mapper.readValue(json,Map.class);

        System.out.println("name:"+m.get("name").getClass().getName());
        System.out.println("age:"+m.get("age").getClass().getName());
        System.out.println("birthday:"+m.get("birthday").getClass().getName());
        System.out.println("cat:"+m.get("car").getClass().getName());
        System.out.println("map:"+m.get("map").getClass().getName());
        System.out.println("list:"+m.get("list").getClass().getName());
        System.out.println("set:"+m.get("set").getClass().getName());


        json=mapper.writeValueAsString(m);

        System.out.println(json);


        User u=mapper.readValue(json,User.class);

        System.out.println(u);


        byte[] data=mapper.writeValueAsBytes(u);
        System.out.println(data);
    }
}
