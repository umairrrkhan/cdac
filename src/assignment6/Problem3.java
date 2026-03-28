package assignment6;

import java.util.*;
class book{
    String title;
    String author;
    String isbn;
    book(String title,String author,String isbn){
        this.title=title;
        this.author=author;
        this.isbn=isbn;
    }
}
public class Problem3{
    public static void main(String[] args){
        Scanner io=new Scanner(System.in);
        ArrayList<book> catalog=new ArrayList<>();
        int ch;
        do{
            System.out.println("1 add 2 remove 3 search 4 list 0 exit");
            ch=io.nextInt();
            io.nextLine();
            if(ch==1){
                System.out.println("title ");
                String t=io.nextLine();
                System.out.println("author ");
                String a=io.nextLine();
                System.out.println("isbn ");
                String i=io.nextLine();
                catalog.add(new book(t,a,i));
            }
            else if(ch==2){
                System.out.println("enter isbn ");
                String i=io.nextLine();
                catalog.removeIf(b->b.isbn.equals(i));
            }
            else if(ch==3){
                System.out.println("enter title ");
                String t=io.nextLine();
                for(book b:catalog)
                    if(b.title.equals(t))
                        System.out.println(b.title+" "+b.author+" "+b.isbn);
            }
            else if(ch==4){
                for(book b:catalog)
                    System.out.println(b.title+" "+b.author+" "+b.isbn);
            }
        }while(ch!=0);
    }
}

