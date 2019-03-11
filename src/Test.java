public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {

        ResumePrototype rp = new ResumePrototype();
        rp.setName("张三");
        rp.setSex("男");
        rp.setLastWorkPlace(new Work("测试公司","xxx"));

        //换工作
        ResumePrototype rp2 = (ResumePrototype)rp.clone();
        rp2.setLastWorkPlace(new Work("下一家公司","yyy"));

        //这样就提高了效率，不关心基本信息的设置，简化了代码的过程
        System.out.println(rp2);
    }
}
