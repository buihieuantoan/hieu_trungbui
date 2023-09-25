public class bai_10 {
    public static void main(String[] args) {
        int dem = 0;
        int dem1 = 0;
        for(int i = 0 ; i < 10 ; i++){
            dem1 += 2;
            dem += dem1;
        }
        System.out.println(dem);
    }
}
