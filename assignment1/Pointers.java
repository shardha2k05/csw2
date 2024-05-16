class Point{
    private double x;
    private double y; 
    //constructor
    public Point(double x, double y){
        this.x=x;
        this.y=y;
    }
    //copy constructor
    public Point(Point other){
        this.x=other.getX();
        this.y=other.getY();
    }
     //getter and setter for x
    public double getX(){
        return x;
    }
    public void setX(double x){
        this.x=x;
    }
    //getter and setter for y
    public double getY(){
        return y;
    }
    public void setY(double y){
        this.y=y;
    }

}
    public class Pointers {
    public static void main(String[] args) {
        //create a point using parameterized constructor
        Point p1=new Point(2.0,3.0); 
         //create a point using parameterized copy constructor
        Point p2=new Point(p1);
        //display the points
        System.out.println("point 1: "+ p1.getX()+" "+p1.getY());
        System.out.println("point 2: "+ p1.getX()+" "+p1.getY());
    }
}
