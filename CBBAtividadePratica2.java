/**
 * Atividade prática do Livro Chagas, Baruque & Baruque (2010): Questão 2, página 94.
 */
public class CBBAtividadePratica2{
    public static void main(String[] args){
        int num;
        int[] array = new int[100];
        for(num=1;num<=100;num++){
            array[num-1] = num;
            System.out.print("->"+array[num-1]);
        }
    }
}
