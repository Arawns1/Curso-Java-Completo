
import java.util.Scanner;


public class Ex02 {
    public static void main(String args[]) {
        
        String produtos[] = {"cachorro-quente", "X-salada", "X-bacon","torrada simples", "refigerante"};
        int cod, qnt;
        float total = 0;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println(" Lista de produtos "); 
        System.out.println("===================="); 
            for(int i = 0; i < produtos.length; i++){
                System.out.println( i+1 + " - " + produtos[i]);
             }
       System.out.println("====================");
       
        System.out.println("Digite um produto:");
        cod = sc.nextInt();
        System.out.println("Digite a quantidade:");
        qnt = sc.nextInt();
        
        
        
        switch (cod){
            case 1:
                System.out.println("Você escolheu " + produtos[0]);
                total += qnt * 4.00f; 
            break;
             case 2:
                System.out.println("Você escolheu" + produtos[1]);
                total += qnt * 4.50f; 
            break;
             case 3:
                System.out.println("Você escolheu" + produtos[2]);
                total += qnt * 5.00f;
            break;
             case 4:
                System.out.println("Você escolheu" + produtos[3]);
                total += qnt * 2.00f;
            break;
             case 5:
                System.out.println("Você escolheu" + produtos[4]);
                total += qnt * 1.50f;
            break;
           
        }
        System.out.printf("O valor total e: %.2f", total);
    }
}
