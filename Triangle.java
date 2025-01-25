public class Triangle {
    double a,b,c;
    Triangle (double a, double b, double c) {
        this.a=a;
        this.b=b;
        this.c=c;
    }
    double getPerimetr(){
        return  a+b+c;

    }

    double gerArea (){
        double d = getPerimetr()/2;
        return Math.sqrt(d * (d-a) * (d-b)* (d-c));
    }
    public static class Main {
        public static void main (String[]args){
            Triangle triangle = new Triangle(3,4,5);
            System.out.println(triangle.getPerimetr());
            System.out.println(triangle.gerArea());
        }
    }
}
