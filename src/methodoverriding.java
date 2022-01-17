//it is used when we want to use inheritance but change a previous class method contents
class sett1{
    public void name(){
        System.out.println("the name is sett1");
    }
    public void  name2(){
        System.out.println("the name is sett2");
    }}
    class sett2 extends sett1{
        //now we want to change print statement of name method

        @Override
        public void name() {
            System.out.println("the name is kanha");
        }
    public void sett3(){

            System.out.println("the name is sett3");
        }
    }



public class methodoverriding {
    public static void main(String[] args) {
   sett2 a=new sett2();
   a.name();
    }
}
//this is how method overloading works
