import java.io.Serializable;

/**
 * 工作类
 */
public class Work implements Serializable {

    private static final long serialVersionUID = -7192888641686004801L;
    //工作的公司名称
    private String name;

    //工作地点
    private String address;

    public Work() {}

    public Work(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
