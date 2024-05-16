class Laptop{
    private String model;
    private double price;
    
    //setter for model and price
    public void setModel(String model){
        this.model=model;
    }
    public void setprice(double price){
        this.price=price;
    }
    @Override
    public String toString(){
        return "model: "+ model +" price: "+price;
    }
}
public class Q4Main {
    public static void main(String[] args) {
        //create an instance of laptop
        Laptop l1 =new Laptop();
        //set model using setter method
        l1.setModel("hp");
        //print
        System.out.println(l1.toString());
    }
}
