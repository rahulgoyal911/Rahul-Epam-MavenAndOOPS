package EPAM_task2.sweets;
public class Sweet implements Comparable<Sweet>{

    private String name;
    private int price;
    private int weight;

    public Sweet(){
        price=0;
        weight=0;
    }

    public Sweet(String name,int price,int weight){
        this.name=name;
        this.price=price;
        this.weight=weight;
    }

    public String getName(){
        return name;
    }

    public int getPrice(){
        return price;
    }

    public int getSWeight(){
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String toString(){
        String result="Sweet name : "+name+" weight : "+weight+" price : "+price;
        return result;
    }

    public int compareTo(Sweet s){
        int result= getPrice()-s.getPrice();
        return result;
    }
}