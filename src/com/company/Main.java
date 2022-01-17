import java.util.Scanner;
//class ke andar method hota h sabse pehle class hoti
//method ko static/public void name(){} karke start karte
class employee{
    int id;
    String name;
}
public class Main {
    public static void main(String[] args) {
        employee kanha=new employee();
        kanha.id=44;
        System.out.println(kanha.id);
    }
}