import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nome = "Emerson Arruda";
        String tipoConta = "Corrente";
        String menuOpcao = """
                
                Operações disponiveis
                
                1- Consultar saldo.
                2- Depositar valor.
                3- Transferir valor.
                4- Sair.
                
                Digite a opção desejada:
                """;
        double saldo = 2500;
        double depositarSaldo = 0;
        double transferirSaldo = 0;
        int opcao = 0;
        Scanner leitura = new Scanner(System.in);

        System.out.println("-**************************-");
        System.out.println("\nDados do cliete");
        System.out.println("Nome: " + nome);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("Saldo: " + saldo);
        System.out.println("\n-**************************-");

        while (opcao != 4) {
            System.out.println(menuOpcao);
            opcao = leitura.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("-**************************-");
                    System.out.println("   Seu saldo atual é: " + saldo);
                    System.out.println("-**************************-");
                    break;
                case 2:
                    System.out.print("Quanto deseja depositar: ");
                    depositarSaldo = leitura.nextDouble();
                    saldo += depositarSaldo;
                    System.out.println("-**************************-");
                    System.out.println("   Seu saldo atual é: " + saldo);
                    System.out.println("-**************************-");
                    break;
                case 3:
                    System.out.print("Quanto deseja transferir: ");
                    transferirSaldo = leitura.nextDouble();

                    if (saldo > transferirSaldo){
                        saldo -= transferirSaldo;
                        System.out.println("-**************************-");
                        System.out.println("   Seu saldo atual é: " + saldo);
                        System.out.println("-**************************-");
                    } else {
                        System.out.println("Não há saldo suficiente para realizar essa transferencia!");
                    }

                    break;
                case 4:
                    System.out.println("Fechando...");
                    break;
                default:
                    System.out.println("Opção errada. Escolha novamente!");

            }
        }
    }
}