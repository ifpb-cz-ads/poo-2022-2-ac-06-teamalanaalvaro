/**
 * Atividade prática do Livro Chagas, Baruque & Baruque (2010): Questão 6, página 98.
 */
import java.util.Scanner;
public class CBBAtividadePratica6{
   public static void main(String[] args){
       int array[] = new int[10];
       System.out.println("Informe dez numeros inteiros positivos: ");
       for(int i=0;i<array.length;i++){
           Scanner exemplo = new Scanner(System.in);
           array[i] = exemplo.nextInt();
       }
       int maior = 0;
       for(int k=0;k<array.length;k++){
           if(array[k]>maior){
               maior = array[k];
           }
       }
       System.out.print("\nO maior numero é: "+maior);
   }
}
