import java.util.Scanner;

public class CTExercicio03 {

    public static void main(String[] args) {
        double notas[] = new double[10];

        System.out.println("Informe as notas: ");
        for (int i = 0; i < notas.length; i++) {
            Scanner scanner = new Scanner(System.in);
            notas[i] = Double.parseDouble(scanner.nextLine());
        }

        double media = 0;
        for (double aluno : notas) {
            media += aluno;
        }
        media /= notas.length;

        int acima = 0, abaixo = 0;
        for (double aluno : notas) {
            if (aluno >= media) {
                acima++;
            } else {
                abaixo++;
            }
        }

        System.out.println("Media: " + media +
                            "\nTotal acima da média: " + acima +
                            "\nTotal abaixo da média: " + abaixo);
    }
}
