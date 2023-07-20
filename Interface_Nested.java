interface A{
    void r();
    interface B{
        void run();
    }
}

public class Interface_Nested implements A.B {
    public void run(){
        System.out.println("Run Method");
    }
    public void r(){
        System.out.println("R method");
    }
    A.B ob=new Interface_Nested();
    ob.run()
}
