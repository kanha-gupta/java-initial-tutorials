package com.company;
//setters and getters

//set method will return void
//get will give according to data int/string etc
/*
class naukar{
    private int id;
    private String name;
    public void setname(String n){
        name=n;
    }
    public int getid(){
        return id;
    }
    public  String getname(){
        return name;
    }
    public void setid(int i){
        id=i;
    }
}

public class settersgetters {
    public static void main(String[] args) {
      //  harry.name="name" //will throw error due to private access modifier
        naukar harry= new naukar();
        harry.setname("codewithkanha");
        harry.setid(10);
        System.out.println(harry.getname());
        System.out.println(harry.getid());

    }
}
*/
//circle radius,area,perimeter

class circle{
    private int r;
    private int  area;
    private int perimeter;
    //now we declare methods
        public void setarea(int radius){
        r=radius;
        area=3*r*r;
        }
        public void setperimeter(int radius){
    r=radius;
    perimeter=2*3*r;
        ;
}
public int getarea(){
    return area;
        }
        public int getperimeter(){
    return perimeter;
        }
        }

        public class settersgetters {
            public static void main(String[] args) {
                circle circle1=new circle();
                circle1.setarea(4);
                System.out.println(circle1.getarea());
                circle1.setperimeter(5);
                System.out.println(circle1.getperimeter());
            }
}
