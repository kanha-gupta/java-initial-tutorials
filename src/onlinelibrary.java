import javax.swing.plaf.synth.SynthOptionPaneUI;
//need improvments
import java.util.Scanner;
class library{
    String[] books;
    int no_of_books;
    library(){
        this.no_of_books=0;
        this.books=new String[100];
    }
    void addbooks(String book){
        System.out.println("add the books");
        this.books[no_of_books]= book;
        no_of_books++;
        System.out.println(book+": has been added");
    }
    void showavailablebooks(){
        System.out.println("available books are:");
        for (String book : this.books){
            System.out.println(book);
            if (book==null){
                break;
            }
        }
    }
    void issuebook(String book){
       for (int i=0;i<books.length;i++){
           if (this.books[i]==book){
               System.out.println("the book has been issues");
               this.books[i]=null;
               return;
           }
           else{
               System.out.println("this book does not exist");
           }

       }
    }
    void returnbook(String book){
        addbooks(book);
    }
}
public class onlinelibrary {
    public static void main(String[] args) {
        //class library
        //method  addbooks,issue book,returnbook,showavaialabe books
        //array to store available books
        //array to store the issue books
        library central=new library();
        Scanner textbook=new Scanner(System.in);
        Scanner choice_no=new Scanner(System.in);
        System.out.println("enter 1 to add book,2 to see books,3 to issue book,4 to return book");
        if (choice_no.nextInt()==1){
            central.addbooks(textbook.nextLine());
        }
        if (choice_no.nextInt()==2){
            central.showavailablebooks();
        }
        if (choice_no.nextInt()==3){
            central.issuebook(textbook.nextLine());
        }
        if (choice_no.nextInt()==4){
            central.returnbook(textbook.nextLine());
        }


    }
}