public class Son extends  Father {
    public int age=22;
    public Son(String name){super(name);}
    public void work(){
        System.out.println("Son "+name+" is working My age is "+age);
    }
    public void study(){
        System.out.println("son is Study My age is "+age);
    }


    public static void main(String[] args) {
        Father.building();
        Son son =new Son("Eric");
        son.work();
        son.study();

        Father father=new Father("Charles");

        father.work();

    }
}
