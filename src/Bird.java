public class Bird implements Fly{

    @Override
    public void fly() {
        System.out.println("拍打翅膀");
    }
    public static void main(String[] args) {
        AirPlane a=new AirPlane();
        Bird b=new  Bird();
        a.fly();
        b.fly();
    }
}
