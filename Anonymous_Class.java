//Name of class doesn't give by user 

abstract class F{   //It can be interface
     void d();
}

class E{
    public static void main(String ar[]){
        F ob = new F(){
            public void d(){
                System.out.println("D method");
            }
        };
        ob.d();
    }
}

//Name decided by compiler at run-time
//If object doesn't terminated then it is called anonymous class.
//By the time of implementation public must be specified.
//Used to provide the implementation for interface or abstract class because we can't create the object of interface or abstract class.