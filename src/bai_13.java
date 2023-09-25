import java.util.Scanner;

public class bai_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int dem = 0;
        for(int i = 0 ; i < n ; i++){
            dem += i;
        }
        System.out.println(dem);
    }
}
