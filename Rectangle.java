public class Rectangle {
    double length, width;
    Rectangle (double length, double width){
        this.length=length;
        this.width=width;

    }
    double returnArea(){
        return length*width;

    }
    public static class Main{
        public static void main (String[] args){
            Rectangle rect1=new Rectangle(5,9);
            Rectangle rect2 =new Rectangle(10, 14);
            System.out.println(rect1.returnArea());
            System.out.println(rect2.returnArea());
        }
    }
}
