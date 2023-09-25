import java.util.Scanner;

public class bai_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int dem = 0;
        if(n % 2 == 0){
           for(int i = 0; i <= n ; i+=2){
               dem += i;
           }
        }else{
            for(int i = 1 ; i <= n ;i+=2){
                dem +=i;
            }
        }
        System.out.println(dem);
    }
}
