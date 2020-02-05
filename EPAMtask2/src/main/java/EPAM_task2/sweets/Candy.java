package EPAM_task2.sweets;
public class Candy extends Sweet{
    String brand;

    public Candy(String name,int price,int weight,String brand){
        super(name,price,weight);
        this.brand=brand;
    }

}