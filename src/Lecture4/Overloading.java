package Lecture4;

class B {
    public int area(int x){
        return x*x;
    }
}
 public class Overloading extends B{
    public int perimeter(int x, int y){
        return x+y;
    }
     public static void main(String[] args) {
         Overloading o = new Overloading();
       System.out.println(o.area(4));
     }
 }
