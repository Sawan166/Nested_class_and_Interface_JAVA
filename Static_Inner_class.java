class C{
    static int a=60;
    static class D{
        static int b=90;
        static void d(){
            System.out.println("D method in static class B "+b);
        }
    }
    public static void main(String ar[]){
        C.D ob=new D();
        ob.d();
    }
}

//Static class must be inner because outer class never be static
//Static class cant call non static properties of outer class
//Static class can have non static properties
//Nested class-->2 Types-->1.Static Nested class,, 2. Non Static Nested class