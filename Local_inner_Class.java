class A{
    int a=80;
    void d(){
        class B{
            int b=70;
            void n(){
                System.out.println("B class in d method "+a);
            }
        }
        B ob = new B();
        ob.n();
    }
    public static void main(String ar[]){
        A ob = new A();
        ob.d();
    }
}

//Local inner class can't be public, private or protected
//Only one class can be public which consists main method
//Inner class can acces all the property of outer class
//Outer class cant access the property of inner class