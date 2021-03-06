import java.util.Locale; 
import java.util.Scanner;
/*Leia os quatro valores correspondentes aos eixos x e y de dois pontos quaisquer no plano, p1(x1,y1) e p2(x2,y2) e calcule a distância entre eles, 
mostrando 4 casas decimais após a vírgula, segundo a fórmula:*/
public class uri1015 {
    public static void main(String[] args){
        
        double dist,x1,y1,x2,y2;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        x1 = sc.nextDouble();
        y1 = sc.nextDouble();
        x2 = sc.nextDouble();
        y2 = sc.nextDouble();
        
        dist = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));

        System.out.printf("%.4f\n",dist);

        sc.close();
        
    }
}
