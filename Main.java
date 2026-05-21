import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        PetShop maquina = new PetShop();

        int opcao;

        do {
            System.out.println("\n=== PETSHOP ===");
            System.out.println("1 - Colocar pet");
            System.out.println("2 - Retirar pet");
            System.out.println("3 - Dar banho");
            System.out.println("4 - Abastecer água");
            System.out.println("5 - Abastecer shampoo");
            System.out.println("6 - Ver nível de água");
            System.out.println("7 - Ver nível de shampoo");
            System.out.println("8 - Verificar pet");
            System.out.println("9 - Limpar máquina");
            System.out.println("0 - Sair");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1: System.out.print("Digite o nome do pet: ");
                        String nome = scanner.next();
                        maquina.colocarPet(nome);
                        break;
                case 2: maquina.retirarPet(); break;
                case 3: maquina.darBanho(); break;
                case 4: maquina.abastecerAgua(); break;
                case 5: maquina.abastecerShampoo(); break;
                case 6: maquina.verificarAgua(); break;
                case 7: maquina.verificarShampoo(); break;
                case 8: maquina.verificarPet(); break;
                case 9: maquina.limparMaquina(); break;
                case 0: System.out.println("Saindo..."); break;
                default: System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        scanner.close();
    }
}