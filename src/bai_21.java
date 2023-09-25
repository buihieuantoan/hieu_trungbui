import java.util.Scanner;

public class bai_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String chuoi = sc.nextLine();

        int dem = 0;
         for(int i = 0 ; i < chuoi.length() ; i++){
             char key = chuoi.charAt(i);
             if(key >= '0' && key <= '9'){
                 dem++;
             }
         }
        System.out.println(dem);
    }
}
