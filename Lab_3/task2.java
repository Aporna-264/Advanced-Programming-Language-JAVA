import java.lang.Math;
interface poly{
    void area(int a,int b,int c);
}
class triangle implements poly {
    public void area(int a, int b, int c) {
        float s = (a+b+c)/2;
        System.out.println("The area of the Triangle: "+ Math.sqrt(s*(s-a)*(s-b)*(s-c)));
    }
}



public class task2 {
    public static void main (String args[]){
        triangle t1= new triangle();
        t1.area (4,8,9);
    }
}
