package EPAM_task2.sweets;

public class Chocolate extends Sweet{
    String brand;

    public Chocolate(String name,int price,int weight,String brand){
        super(name,price,weight);
        this.brand=brand;
    }

}