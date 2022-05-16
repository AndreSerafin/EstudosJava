package application;

import entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Account conta;

        System.out.print("Numero da conta: ");
        int numeroDaConta = sc.nextInt();
        System.out.print("\nTitular da conta: ");
        sc.nextLine();
        String nomeTitular = sc.nextLine();

        System.out.println("\nDeseja fazer um deposito inicial? (s/n)");
        double depositoInicial;
        char op1 = sc.next().charAt(0);

        while(op1 != 's' && op1 != 'n'){
            System.out.println("Opção Inválida!");
            op1 = sc.next().charAt(0);
        }

        if (op1 == 's'){
            System.out.print("\nDigite o valor do deposito inicial: ");
            depositoInicial = sc.nextDouble();
            conta = new Account(numeroDaConta, nomeTitular, depositoInicial);
        } else{
            conta = new Account(numeroDaConta, nomeTitular);
        }

        System.out.printf("\nDados da conta: %s\n", conta.toString());

        System.out.println("\nSelecione a opcao: ");
        System.out.println("0 - Encerrar");
        System.out.println("1 - Deposito");
        System.out.println("2 - Saque");

        int op2 = sc.nextInt();

        while(op2 != 0){

            switch (op2){
                case 1:
                    System.out.print("Digite o valor do deposito: ");
                    double deposito = sc.nextDouble();
                    conta.deposito(deposito);
                    System.out.printf("Dados atualizados: %s\n", conta.toString());
                    break;
                case 2:
                    System.out.print("Digite o valor do saque: ");
                    double saque = sc.nextDouble();
                    conta.saque(saque);
                    System.out.printf("Dados atualizados: %s\n", conta.toString());
                    break;
                default:
                    System.out.println("Opcao Invalida!");
                    break;
            }

            System.out.println("\nSelecione a opcao: ");
            System.out.println("0 - Encerrar");
            System.out.println("1 - Deposito");
            System.out.println("2 - Saque");

            op2 = sc.nextInt();
        }


        sc.close();

    }
}
