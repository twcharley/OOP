public class Second extends First{
    String s="2";
    public static void f2(){
        System.out.println("Static in Second is running");
    }
    public Second(){
        System.out.println("我是Second 的建構式");
    }
    public void t2(){
        System.out.println("我在Second 己經被new 出來了"+s);
    }


}
