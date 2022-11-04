/**
 * Atividade prática do Livro Chagas, Baruque & Baruque (2010): Questão 1, página 93.
 */
public class CBBAtividadePratica1
{
   public static void main(String[] args){
       int num;
       int[] array = new int[100];
       for(num=0; num<100; num++){
           array[num] = num;
           System.out.print("->"+ array[num]);
       }
   }
}
