interface polygon {
    void area (int length ,int breadth);
    void perimeter (int length, int breadth);

}

class Rectangle implements polygon{
    public void area(int length , int breadth) {
        System.out.println("The area of Rectangle is : "+(length * breadth));
    }

    public void perimeter(int length, int breadth){
        System.out.println("The perimeter of Rectangle is : "+((length + breadth)*2));
    }

}
public class task1{
    public static void main (String args[]){
        Rectangle r1= new Rectangle();
        r1.area (7,5);
        r1.perimeter(7,5);
    }
}