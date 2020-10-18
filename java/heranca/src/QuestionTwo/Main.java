package QuestionTwo;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		FuncionarioManagment funcionarioManagment = new FuncionarioManagment();
		Scanner entrada = new Scanner(System.in);
		boolean ativado = true;
		
		while(ativado) {
			System.out.println("1-Cadastrar funcionário");
			System.out.println("2-pesquisar funcionário:");
			System.out.println("3-sair");
			int escolha = entrada.nextInt();
			switch(escolha){
			case 1:
				funcionarioManagment.cadastrar();
				break;
			case 2:
				funcionarioManagment.buscar();
				break;
			case 3:
				ativado = false;
				break;
				
			}
			
		}
		
	}

}
