import java.io.*;

/**
 * 简历类
 */
public class ResumePrototype implements Cloneable, Serializable {

    private static final long serialVersionUID = 1379751831093081421L;

    //姓名
    private String name;

    //年龄
    private String sex;

    //上份工作
    private Work lastWorkPlace;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Work getLastWorkPlace() {
        return lastWorkPlace;
    }

    public void setLastWorkPlace(Work lastWorkPlace) {
        this.lastWorkPlace = lastWorkPlace;
    }

    public ResumePrototype(){}

    @Override
    public Object clone() throws CloneNotSupportedException {
        try {
            return this.deepClone();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public Object deepClone() throws Exception {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        ObjectOutputStream objOut = new ObjectOutputStream(out);
        objOut.writeObject(this);
        ByteArrayInputStream input = new ByteArrayInputStream(out.toByteArray());
        ObjectInputStream objInput = new ObjectInputStream(input);
        return objInput.readObject();
    }

    @Override
    public String toString() {
        return "ResumePrototype{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", lastWorkPlace=" + lastWorkPlace +
                '}';
    }
}
