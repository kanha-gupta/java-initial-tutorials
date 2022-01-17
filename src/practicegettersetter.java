import javax.swing.*;
import java.util.Scanner;

class sphere{
    private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    public int volume(int radius){
        return 4*3*radius*radius;
    }

}

public class practicegettersetter {
    public static void main(String[] args) {
        sphere mysphere=new sphere();
        mysphere.volume(10);
        System.out.println(mysphere.volume(10));

    }
}
