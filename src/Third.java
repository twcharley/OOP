public class Third extends Second {
    String s="3";
    public static void f3(){
        System.out.println("Static third is running");
    }
    public Third(){
        System.out.println("我是Third 的建構式");
    }
    public void t3(){
        System.out.println("我在third己經被new 出來了"+s);
    }

}
