public class Hello{
     String name;
     
     public void sayHi(){
       System.out.println("hello "+name);
     }
public Hello(String name){
     this.name = name;
}
     public static void main(String []aa){
           Hello h = new Hello("tom");
           h.name = "lily";
           h.sayHi();
     }
}

//static final native abstract synchronized