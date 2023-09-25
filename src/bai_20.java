import java.util.Scanner;

public class bai_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String chuoi = sc.nextLine();
         int dem = 0;
        for(int i = 0 ; i < chuoi.length() ; i++){
            if(chuoi.charAt(i) == 'a'){
                dem++;
            }
        }
        System.out.print(dem);
    }
}
