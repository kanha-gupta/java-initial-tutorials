class cons{
    public  cons(int x){
        int c=x+69;
        System.out.println("hello this is constructor"+c);

    }
}
class cons1 extends cons{
    public  cons1(){
super(10);
        System.out.println("hello this is me");
    }
}
public class inheritance {
    public static void main(String[] args) {

        cons1 a=new cons1();

    }
}