class rectangle{
    //area,volume methods ,setters and getters
    int l;
    int b;
    int area;
    rectangle(int l,int b){
        this.b=b;
        this.l=l;

    }
    public int area(){
        area=l*b;
        return area;
    }
}
class cuboid extends rectangle{

    int volume;
    int h;
    cuboid(int l,int b,int h) {
        super(l, b);
        System.out.println("I am cuboid parameter");
        this.h = h;
    }
        public int answer () {
            volume = l * b * h;
            return volume;
        }


    }
public class inheritance_practiceset {
    public static void main(String[] args) {
rectangle rec=new rectangle(10,4);
        System.out.println(rec.area());
        cuboid cub=new cuboid(11,5,1);
        System.out.println(cub.answer());

    }
}
