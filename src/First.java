public class First {
    String s="1";
    public static void f1(){
        System.out.println("Static in First running");

    }
    public First(){
        System.out.println("我是First 的建構式");
    }
    public void t1(){
        System.out.println("我在First 己經被new 出來了"+s);
    }


}
