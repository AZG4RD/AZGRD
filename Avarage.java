public class Avarage {
    static double calculateAvarage (double a, double b, double c){
        return (a+b+c)/3;
    }
    public static class Main {
        public static void main (String[]args){
            double avg = Avarage.calculateAvarage(10,20,30);
            System.out.println(avg);
        }
    }
}
