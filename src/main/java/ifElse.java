import java.util.Scanner;

public class ifElse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("INSIRA OS HORARIOS?");
        int horaInicial = sc.nextInt();
        int horaFinal = sc.nextInt();

        int duracao;
        if (horaInicial < horaFinal) {
                duracao = horaFinal - horaInicial;
        }
        else {
            duracao = 24 - horaInicial + horaFinal;
        }

        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
    }
}
