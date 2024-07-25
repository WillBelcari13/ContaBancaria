package conta;

import java.util.Scanner;
import conta.model.Conta;
import conta.util.Cores;

public class Menu {

	public static void main(String[] args) {
		
		// Teste da classe conta
		Conta c1 = new Conta(1, 123, 1, "Adriana", 10000.0f);
		c1.visualizar();
		c1.sacar(12000.0f);
		c1.visualizar();
		c1.depositar(5000.0f);
		c1.visualizar();
		
		Scanner leia = new Scanner(System.in);
		
		int opcao;
		
		while (true) {
			
			System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND
					       + "*****************************************************");
			System.out.println("                                                   ");
			System.out.println("            BANCO DO WILL                          ");
			System.out.println("                                                   ");
			System.out.println("***************************************************");
			System.out.println("                                                   ");
			System.out.println("        1 - Criar conta                            ");
			System.out.println("        2 - Listar todas as contas                 ");
			System.out.println("        3 - Buscar conta por numero                ");
			System.out.println("        4 - Atualizar dados da conta               ");
			System.out.println("        5 - Apagar conta                           ");
			System.out.println("        6 - Sacar                                  ");
			System.out.println("        7 - Depositar                              ");
			System.out.println("        8 - Transferir valores entre Contas        ");
			System.out.println("        9 - Criar conta                            ");
			System.out.println("                                                   ");
			System.out.println("***************************************************");
			System.out.println("Entre com a opção desejada:                        ");
			System.out.println("                                                   " + Cores.TEXT_RESET);
			
		opcao = leia.nextInt();
		if (opcao == 9) {
		 System.out.println(Cores.TEXT_WHITE_BOLD + "\nBanco do Will - Seu dinheiro em boas mãos!");
		 sobre();
		 leia.close();
		 System.exit(0);
		}
		
		switch (opcao) {
		case 1:
			System.out.println(Cores.TEXT_WHITE + "Criar Conta\n\n");
		
            		break;
		case 2:
			System.out.println(Cores.TEXT_WHITE + "Listar todas as Contas\n\n");
			
            		break;
		case 3:
			System.out.println(Cores.TEXT_WHITE + "Consultar dados da Conta - por número\n\n");

            		break;
		case 4:
			System.out.println(Cores.TEXT_WHITE + "Atualizar dados da Conta\n\n");
			
            		break;
		case 5:
			System.out.println(Cores.TEXT_WHITE + "Apagar a Conta\n\n");

           	 	break;
		case 6:
			System.out.println(Cores.TEXT_WHITE + "Saque\n\n");

           	 	break;
		case 7:
			System.out.println(Cores.TEXT_WHITE + "Depósito\n\n");
			
            		break;
		case 8:
			System.out.println(Cores.TEXT_WHITE + "Transferência entre Contas\n\n");
			
            		break;
		default:
			System.out.println(Cores.TEXT_RED_BOLD + "\nOpção Inválida!\n" + Cores.TEXT_RESET);
            		break;
		    }
		}

	}
      private static void sobre() {
		System.out.println("\n***************************************************");
		System.out.println("Projeto desenvolvido por: William Campos Belcari ");
		System.out.println("Will Belcari - willbelcari13@gmail.com " );
		System.out.println("https://github.com/WillBelcari13");
		System.out.println("*****************************************************");
	}

}