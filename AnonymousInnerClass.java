package innerclass;

public class AnonymousInnerClass {

    public static void main(String[] args) {
        PopCorn popCorn=new PopCorn(){
            //here we are overriding pop method anonymosly
            //But we can not define any method that is not in Super class ie. PopCorn class
            public void pop(){
                System.out.println("Popped from Anonymous Inner class");
            }

        };

        popCorn.pop();
    }
}
