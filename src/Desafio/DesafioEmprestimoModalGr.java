package Desafio;

import java.util.Scanner;
/*A ModalGR criará um programa de empréstimo para os colaboradores que possuem tempo
de casa superior a 5 anos. O colaborador poderá simular um empréstimo de até 2 vezes o valor
de seu respectivo salário, desde que esse valor seja múltiplo de 2. Esse programa dará a
possibilidade de retirada em dinheiro vivo, de acordo com as seguintes opções:
➢ Notas de maior valor: considerando primeiramente as notas de 100 e 50 reais, e em
seguida, as inferiores;
➢ Notas de menor valor: considerando as notas de 20, 10, 5 e 2 reais.
➢ Notas meio a meio: metade do valor em notas maiores e a outra metade em notas
menores.
Essas opções deverão ser exibidas ao colaborador, para assim, realizar a escolha de acordo com
sua necessidade.
Visando atender esse quesito, você foi escolhido para nos ajudar nessa solução!
A ideia é ter os seguintes campos para inserção: do nome do colaborador, data de admissão,
salário atual, valor de empréstimo, e em seguida, exibir as opções de retirada*/


public class DesafioEmprestimoModalGr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);

        System.out.print("Nome do colaborador: ");
        String nome = scan.nextLine();

        System.out.print("Data de admissão (anos): ");
        int anosAdmissao = scan.nextInt();

        System.out.print("Salário atual: ");
        double salario = scan.nextDouble();

        if (anosAdmissao > 5) {
            System.out.print("Valor de empréstimo desejado: ");
            double vlrEmprestimo = scan.nextDouble();
           
            scan.close();
            
            if (vlrEmprestimo % 2 == 0) {
                System.out.println("Valor empréstimo: " + vlrEmprestimo + " reais");

                // maior valor
                int notas100 = (int) (vlrEmprestimo / 100);
                int notas50 = (int) ((vlrEmprestimo % 100) / 50);

                //  menor valor
                int notas20 = (int) ((vlrEmprestimo % 50) / 20);
                int notas10 = (int) ((vlrEmprestimo % 20) / 10);
                int notas5 = (int) ((vlrEmprestimo % 10) / 5);

                System.out.println("Notas de maior valor:");
                System.out.println(notas100 + " x 100 reais");
                System.out.println(notas50 + " x 50 reais");

                System.out.println("Notas de menor valor:");
                System.out.println(notas20 + " x 20 reais");
                System.out.println(notas10 + " x 10 reais");
                System.out.println(notas5 + " x 5 reais");

                System.out.println("Notas meio a meio:");
                double metadeMaiorVlr = (notas100 * 100 + notas50 * 50) / 2;
                double metadeMenorVlr = (notas20 * 20 + notas10 * 10 + notas5 * 5) / 2;

                System.out.println(metadeMaiorVlr + " reais em notas de maior valor:");
                int notas100Metade = (int) (metadeMaiorVlr / 100);
                int notas50Metade = (int) ((metadeMaiorVlr % 100) / 50);
                int notas20Metade = (int) ((metadeMaiorVlr % 50) / 20);
                int notas5Metade = (int) ((metadeMaiorVlr % 20) / 5);

                System.out.println(notas100Metade + " x 100 reais");
                System.out.println(notas50Metade + " x 50 reais");
                System.out.println(notas20Metade + " x 20 reais");
                System.out.println(notas5Metade + " x 5 reais");

                System.out.println(metadeMenorVlr + " reais em notas de menor valor:");
                int notas20MetadeMenor = (int) (metadeMenorVlr / 20);
                int notas10Metade = (int) ((metadeMenorVlr % 20) / 10);
                int notas5MetadeMenor = (int) ((metadeMenorVlr % 10) / 5);

                System.out.println(notas20MetadeMenor + " x 20 reais");
                System.out.println(notas10Metade + " x 10 reais");
                System.out.println(notas5MetadeMenor + " x 5 reais");
            } else {
                System.out.println("Insira um valor válido!");
            }
        } else {
            System.out.println("Agradecemos seu interesse, mas você não atende os requisitos mínimos do programa.");
        }
    
    }
	

}
