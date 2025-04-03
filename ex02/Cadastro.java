import java.util.Scanner;

public class Cadastro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Moradores[] moradores = new Moradores[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Cadastro do morador " + (i + 1) + ":");
            System.out.println("Nome do morador : ");
            String nome = sc.nextLine();

            System.out.println("CPF do morador : ");
            String cpf = sc.nextLine();

            System.out.println("Telefone para contato do morador : ");
            String contato = sc.nextLine();


            System.out.println("Data de nascimento do morador(DD/MM/YYYY): ");
            String data_nasc = sc.nextLine();

            System.out.println("Sexo do morador(M ou F): ");
            String sexo = sc.nextLine();

            System.out.println("Bloco do morador : ");
            String bloco = sc.nextLine();

            System.out.println("Apartamento do morador : ");
            int apartamento = sc.nextInt();

            System.out.println("Código de acesso do morador : ");
            int cod_acesso = sc.nextInt();
            sc.nextLine();

            moradores[i] = new Moradores(nome, cpf, contato, data_nasc, sexo, bloco, apartamento, cod_acesso);

        }

        System.out.println("\n===== Lista de Moradores =====");
        for (Moradores m : moradores) {
            System.out.println(m);
        }


    }
}
