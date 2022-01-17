package com.company;

//it is used to shorten process of setter and getters
// instead of employee harry=new employee();
// harry setname("kanha")
//we can use public employee(){
//    name="your name";
//        }

class employee{
    private int id;
    private String name;

public employee(int myid,String myname){
    id=myid;
    name=myname;
}
public employee(){
    id=45;
    name="kanha gupta";
}
public void setname(String myname1){
    name=myname1;
}
public void setid(int myid1){
    id=myid1;
}
public int getid(){
return id;}
    public String getname(){
    return name;
    }
}


public class constructor {
    public static void main(String[] args) {
        employee kanha=new employee(69000,"codewithkanha");
    //    employee kanha1=new employee(); method overloading way
        // we skipped kanha.setname & kanha.setid with this
        System.out.println(kanha.getname());
        System.out.println(kanha.getid());
      //  System.out.println(kanha1.getid());  method overloading way
    }
} //we can also overload by making employee() method along with employee(int,String)
//it would be regarded as different