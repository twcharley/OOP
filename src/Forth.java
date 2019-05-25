public class Forth extends Third {
    String s="4";
    public static void f4(){
        System.out.println("Static in Forth is running");
    }
    public Forth(){
        System.out.println("我是Forth 的建構式");
    }
    public void t4(){
        System.out.println("我在Forth 己經被new 出來了"+s);

    }

    public static void main(String[] args) {
        First.f1();
        Second.f2();
        Forth fo=new Forth();

        fo.t2();
        fo.t1();

    }

}
