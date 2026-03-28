package assignment6;

import java.util.*;

class item{
    String name;
    int priority;
    item(String name,int priority){
        this.name=name;
        this.priority=priority;
    }
}

public class Prb5{
    public static void main(String[] args){
        Comparator<item> comp=(a,b)->a.priority-b.priority;
        PriorityQueue<item> pq=new PriorityQueue<>(comp);
        pq.add(new item("umair task",3));
        pq.add(new item("umair urgent",1));
        pq.add(new item("umair normal",5));
        pq.add(new item("umair high",2));
        System.out.println("processing by priority ");
        while(!pq.isEmpty()){
            item i=pq.poll();
            System.out.println(i.name+" priority "+i.priority);
        }
    }
}
