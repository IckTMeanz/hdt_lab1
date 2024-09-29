import java.util.Scanner;

public class b226 {
    public static void LinearEquation(){
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Input a: ");
        double a = sc.nextDouble();
        System.out.print("Input b: ");
        double b = sc.nextDouble();

        
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phuong trinh vo so nghiem.");
            } else {
                System.out.println("Phuong trinh vo nghiem.");
            }
        } else {
            
            double x = -b / a;
            System.out.println("Nghiệm của phương trình là: x = " + x);
        }
    }


    public static void SystemLinearEquation(){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a1: ");
        double a1 = sc.nextDouble();
        System.out.print("Input b1: ");
        double b1 = sc.nextDouble();
        System.out.print("Input c1: ");
        double c1 = sc.nextDouble();
        System.out.print("Input a2: ");
        double a2 = sc.nextDouble();
        System.out.print("Input b2: ");
        double b2 = sc.nextDouble();
        System.out.print("Input c2: ");
        double c2 = sc.nextDouble();

       
        double det = a1 * b2 - a2 * b1;

        
        if (det == 0) {
            if (c1/c2 == a1/a2) {
                System.out.println("He phuong trinh co vo so nghiem.");
            } else {
                System.out.println("He phuong trinh vo nghiem.");
            }
        } else {
            
            double x = (c1 * b2 - c2 * b1) / det;
            double y = (a1 * c2 - a2 * c1) / det;

            System.out.println("Nghiem cua he phuong trinh la:");
            System.out.println("x = " + x);
            System.out.println("y = " + y);
        }
    }
    public static void main(String[] args){
        LinearEquation();
        SystemLinearEquation();
    }
}