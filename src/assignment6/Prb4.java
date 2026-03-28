package assignment6;

import java.util.*;
class item{
    String name;
    double price;
    int qty;
    item(String name,double price,int qty){
        this.name=name;
        this.price=price;
        this.qty=qty;
    }
}
public class Prb4{
    public static void main(String[] args){
        Scanner io=new Scanner(System.in);
        ArrayList<item> cart=new ArrayList<>();
        int ch;
        do{
            System.out.println("1 add 2 remove 3 view 4 total 0 exit");
            ch=io.nextInt();
            io.nextLine();
            if(ch==1){
                System.out.println("name ");
                String n=io.nextLine();
                System.out.println("price ");
                double p=io.nextDouble();
                System.out.println("qty ");
                int q=io.nextInt();
                cart.add(new item(n,p,q));
            }
            else if(ch==2){
                System.out.println("name to remove ");
                String n=io.nextLine();
                cart.removeIf(i->i.name.equals(n));
            }
            else if(ch==3){
                for(item i:cart)
                    System.out.println(i.name+" price "+i.price+" qty "+i.qty);
            }
            else if(ch==4){
                double total=0;
                for(item i:cart)
                    total+=i.price*i.qty;
                System.out.println("total "+total);
            }
        }while(ch!=0);
    }
}

