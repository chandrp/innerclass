package innerclass;

public class MethodLocalInnerClass {

    public static void main(String[] args) {
        MethodLocalInnerClass methodLocalInnerClass=new MethodLocalInnerClass();
        methodLocalInnerClass.demo();
    }

    public void demo(){

        final String z="local var";

        //MethodLocal Inner class can only be final or abstract
        class InnerClass{

            public void display(){
                System.out.println("Inside Method local inner class");
                //local variable can not be used in local innner class ,
                // local var must be final to be used inside inner class

                System.out.println(z);
            }
        }

        //Method local inner class object can only be created inside method and nowhere else
        InnerClass innerClass=new InnerClass();
        innerClass.display();

    }
}
