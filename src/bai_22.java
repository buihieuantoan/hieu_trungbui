import java.util.Locale;
import java.util.Scanner;
import java.util.StringTokenizer;

public class bai_22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String chuoi = sc.nextLine();

        StringTokenizer tokenizer = new StringTokenizer(chuoi," ");

        while(tokenizer.hasMoreElements()){
            String chuoicon = tokenizer.nextToken();
            System.out.println(chuoicon);
        }
    }
}
