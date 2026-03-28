package assignment6;

import java.util.*;
class student {
    String name;
    int id;
    student(String name,int id){
        this.name=name;
        this.id=id;
    }
}
public class Problem2{
    public static void main(String[] args){
        Scanner io=new Scanner(System.in);
        ArrayList<student> list=new ArrayList<>();
        int ch;
        do{
            System.out.println("1 add 2 remove 3 print 0 exit");
            ch=io.nextInt();
            io.nextLine();
            if(ch==1){
                System.out.println("enter name ");
                String n=io.nextLine();
                System.out.println("enter id ");
                int id=io.nextInt();
                list.add(new student(n,id));
            }
            else if(ch==2){
                System.out.println("enter id to remove ");
                int id=io.nextInt();
                list.removeIf(s->s.id==id);
            }
            else if(ch==3){
                for(student s:list)
                    System.out.println("name "+s.name+" id "+s.id);
            }
        }while(ch!=0);
    }
}
