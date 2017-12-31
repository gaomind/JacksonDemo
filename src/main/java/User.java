import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by ${MIND-ZR} on 2017/12/31.
 */
public class User {
    private String name;
    private Integer age;
    private Date birthday;


    private Car car;

    //测试用
    private Set set;
    private Map map;
    private List list;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Set getSet() {
        return set;
    }

    public void setSet(Set set) {
        this.set = set;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                ", car=" + car +
                ", set=" + set +
                ", map=" + map +
                ", list=" + list +
                '}';
    }
}
