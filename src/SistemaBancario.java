import java.util.Scanner;

public class SistemaBancario {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        String nomeDoCliente = "Andrey Victor de Carvalho";
        String tipoDeConta = "Corrente";
        double saldo = 3500.00;

        String dadosIiniciaisDoCliente = """
                ******************************************
                Dados inicais do cliente:
                
                Nome:            %s
                Tipo de conta:   %s
                Saldo atual:   R$ %.2f
                ******************************************
                """.formatted(nomeDoCliente, tipoDeConta, saldo);
        System.out.println(dadosIiniciaisDoCliente);

        boolean continuar = true;
        while (continuar) {
            String operacoes = """
                *** Digite sua opção ***
                
                1- Consultar saldo
                2- Receber valor
                3- Transferir valor
                4- Sair
                
                Digite a opção desejada:
                """;
            System.out.println(operacoes);
            int tipoDeOperacao = leitura.nextInt();

            switch (tipoDeOperacao) {
                case 1:
                    System.out.println("Saldo autalizado R$ " + saldo);
                    break;
                case 2:
                    System.out.println("Digite o valor á receber: ");
                    double valorAReceber = leitura.nextDouble();
                    saldo += valorAReceber;
                    System.out.println("Saldo atualizado R$ " + saldo);
                    break;
                case 3:
                    System.out.println("Digite o valor á transferir: ");
                    double valorATransferir = leitura.nextDouble();
                    if (valorATransferir > saldo) {
                        System.out.println("Saldo insuficiente");
                    } else {
                        saldo -= valorATransferir;
                        System.out.println("Saldo atualizado R$ " + saldo);
                    }
                    break;
                case 4:
                    continuar = false;
                    System.out.println("Operação encerrada!");
                    break;
                default:
                    System.out.println("Opção escolhida é invalida.");
            }//fim switch
        }// fim while
    }// fim void main da class Banco
}// fim class Banco