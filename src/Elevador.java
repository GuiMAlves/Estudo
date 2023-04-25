import java.util.Scanner;

public class Elevador {

    public static void abrirPorta() throws InterruptedException{
        System.out.println("Porta abrindo...");
        Thread.sleep(1000);
    }
    public static void fecharPorta() throws InterruptedException{
        System.out.println("Porta fechando...");
        Thread.sleep(1000);
    }

    public static void main (String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pressione o botão para chamar o elevador! ");
        sc.nextLine();
        Integer andarNumbr;
        System.out.println("Bem vindo ao inferno!!!");
        abrirPorta();
        while (true) {
            System.out.println("Escolha qual andar ir:");
            // se usa para receber uma informação do usuario entrada e saida de dados
            // se cria um objeto usando o new

            andarNumbr = sc.nextInt();
            //iremos usar o scanner para obter informação
            if (andarNumbr > 30 || andarNumbr <= 0) {
                System.out.println("Andar não existente.");
            } else {
                fecharPorta();
                System.out.println("O andar escolhido é: " + andarNumbr);
                System.out.println("Aguarde. ");
                Thread.sleep(1000 * andarNumbr);
                System.out.println("Chegamos no andar escolhido. ");
                abrirPorta();
                fecharPorta();
                return;
            }
            System.out.println("Escolha outro andar: ");
        }
    }
}
