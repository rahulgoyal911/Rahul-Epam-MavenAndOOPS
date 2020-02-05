package EPAM_task2;

import EPAM_task2.gifts.*;
import EPAM_task2.sweets.*;

public class App{
    public static void main(String args[]){
        Sweet a=new Chocolate("A",100,80,"DM");
        Sweet b=new Chocolate("B",200,10,"KK");
        Sweet c=new Candy("C",10,80,"Pulse");
        Sweet d=new Candy("D",15,98,"Center frt");

        Gift gifts=new Gift();
        gifts.add(a);
        gifts.add(b);
        gifts.add(c);
        gifts.add(d);

        System.out.println(gifts.getWeight());
        System.out.println(gifts.toString());
    }
}
