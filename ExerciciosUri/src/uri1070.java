import java.util.Locale;
import java.util.Scanner;

public class uri1070{
    public static void main(String[] args) {
        
        int n1;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        n1 = sc.nextInt();
        int i = n1;
        
        while(i < n1+12){
            if(i % 2 != 0){
                System.out.printf("%d\n",i);
            }
            i++;
        }

        sc.close();
    }
}