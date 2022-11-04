/**
 * Atividade prática do Livro Chagas, Baruque & Baruque (2010): Questão 5, página 98.
 */
public class CBBAtividadePratica5{
    public static void main(String[] args){
        String[] dias = {"Segunda","Terça","Quarta","Quinta","Sexta","Sábado","Domingo"};
        int i = 0;
        while(i<dias.length){
            System.out.print("->"+dias[i]);
            i++;
        } 
        System.out.println("");
        int h = 0;
        do{
           System.out.print("->"+dias[h]); 
           h++;
        } while(h<dias.length);
        System.out.println("");
        for(int k=0;k<dias.length;k++){
            System.out.print("->"+ dias[k]);
        }
    }
}
