

/* Question: Create a Shape class with a method calculateArea(). Inherit two classes, Circle and Rectangle,
 from Shape and override the calculateArea()
  method to calculate the area of each shape.*/
class Shape
{
    double area;
     public double calculateArea(double area)
     {
        return area;
     }
}
class Circle extends  Shape
{
  int redius;
  public void  setRedius(int redius)
  {
    this.redius = redius;
  }

  public int getRedius()
  {
    return redius;
  }

  public double  calculateArea()
  {
      return Math.PI*redius*redius;
  }
}
class Rectangle extends  Shape
{
    int length;
    int breadth;

    public  void setLength(int length)
    {
        this.length=length;
    }

    public int getLength()
    {
        return length;

    }
    public  void setBreadth(int breadth)
    {
        this.breadth=breadth;
    }

    public int getBreadth()
    {
        return breadth;
        
    }
    public double calculateArea()
    {
         return  length*breadth;
    }
}
public class Q2 {
    public static void main(String[] args) {
        Circle ob = new Circle();
        ob.setRedius(2);
        System.out.println(ob.calculateArea());
        
        Rectangle ob1 = new Rectangle();
        ob1.setBreadth(20);
        ob1.setLength(10);
        System.out.println(ob1.calculateArea());

    }
    
    
}
