class Car{
    private String make;
    private String model;

    //parameterized constructor
    public Car(String make, String model){
        this.make=make;
        this.model=model;
    }
    //getter and setter for make
    public String getMake(){
        return make;
    }
    public void setMake(String make){
        this.make=make;
    }
    //getter and setter for model
    public String getModel(){
        return model;
    }
    public void setModel(String model){
        this.model=model;
    }
}
public class CarTester{
    public static void main(String[]args){
        //instantiate myCar1 with specified make and model
        Car myCar1=new Car("toyota","corolla");
        //instantiate myCar2 with null values
        Car myCar2=new Car(null,null);
        //print initial make and model of both cars
        System.out.println(myCar1.getMake()+" "+myCar1.getModel());
        System.out.println(myCar2.getMake()+" "+myCar2.getModel());

        //set new values of myCar2 using setter methods
        myCar2.setMake("honda");
        myCar2.setModel("accord");
        
        //print the updated make and model of myCar2
        System.out.println(myCar2.getMake()+" "+myCar2.getModel());
    }
}