class Rectangle{
    private double length;
    private double width;

    //constructor
    public Rectangle(double length,double width){
        this.length=length;
        this.width=width;
    }
    //getter and setter for length
    public double getLength(){
        return length;
    }
    public void setLength(double length){
        this.length=length;
    }
      //getter and setter for width
    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width=width;
    }
    public double calculateArea(){
        return length*width;
    }
    public double calculatePerimeter(){
        return 2*(length + width);
    }

}

public class CalRectangle {
    public static void main(String[] args) {
        Rectangle r1=new Rectangle(2.0, 4.0);
        
        //display initial length and width using getter methods
        System.out.println(r1.getLength() +" "+ r1.getWidth());

        //set new values of length and width using setter methods
        r1.setLength(3.0);
        r1.setWidth(5.0);

        //display the updated length and width
        System.out.println(r1.getLength() +" "+ r1.getWidth());

        //display area and perimeter
        System.out.println("area: "+r1.calculateArea()+" "+ "perimeter: "+r1.calculatePerimeter());
    }
}
