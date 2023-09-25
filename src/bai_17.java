import java.util.Scanner;

public class bai_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();


        if(a == 0){
            if(b == 0){
                System.out.print("phuong trinh vo so nghiem");
            }else{
                System.out.print("phuong trinh vo nghiem");
            }
        }else{
            double x = -b/a;
            System.out.print(x);
        }
    }
}
