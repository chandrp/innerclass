package innerclass;

public class OuterClass {

    private int x=100;

    public static void main(String[] args) {
        //Calling Inner class from Outer class
        OuterClass ot=new OuterClass();
        InnerClass in= ot.new InnerClass();
        in.display();


        OuterClass.InnerClass innerClass=new OuterClass().new InnerClass();
        innerClass.display();

    }

    class InnerClass{
        public void display(){
            System.out.println(x);
            System.out.println("Reference to inner class"+this);
            System.out.println("Reference to outer class"+OuterClass.this);
        }
    }
}
