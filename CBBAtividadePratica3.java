/**
 * Atividade prática do Livro Chagas, Baruque & Baruque (2010): Questão 3, página 95.
 */
public class CBBAtividadePratica3
{
    public static void main(String[] args){
        int num;
        int[] array =  new int[100];
        for(num=0;num<array.length;num++){
            array[num] = num;
            System.out.print("->"+array[num]);
        }
    }
}
