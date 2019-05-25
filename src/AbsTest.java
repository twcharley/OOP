public  abstract class  AbsTest {
    void f1(){
        System.out.println("f1()");

    }
    abstract void f2();



    public static void main(String[] args) {
        AbsTest a = new AbsTest(){
            @Override
            void f2() {
                System.out.println("f2()");
            }
        };
        a.f2();
    }
}
