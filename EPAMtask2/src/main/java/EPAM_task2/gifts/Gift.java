package EPAM_task2.gifts;
import java.util.*;
import EPAM_task2.sweets.Sweet;
public class Gift{
    ArrayList<Sweet> gifts=new ArrayList<Sweet>();

    public Gift(){

    }

    public int getWeight(){
        sortGifts();
        int totalWeight=0;

        for(int i=0;i<gifts.size();i++)
            totalWeight+=gifts.get(i).getSWeight();

        return totalWeight;
    }

    public void add(Sweet s){
        gifts.add(s);
    }

    public void sortGifts(){
        Collections.sort(gifts);
    }

    public String toString(){
        StringBuilder sb=new StringBuilder();


        for(int i=0;i<gifts.size();i++) {
            sb.append(gifts.get(i).getName());
            sb.append(" ");
        }
        String result=sb.toString();

        return result;
    }

}