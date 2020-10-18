package QuestionTwo;

import java.util.ArrayList;
import java.util.Scanner;

public class FuncionarioManagment {
	static ArrayList<Funcionario> funcionario = new ArrayList();
	static ArrayList<FuncionarioComissionado> funcionarioComissionado = new ArrayList();

	void cadastrar() {
		String nomeController;
		String segundoNomeController;
		double salarioController;
		double comissao;
		int numeroVendas;
		Scanner entrada = new Scanner(System.in);

		System.out.print("primeiro nome: ");
		nomeController = entrada.next();
		System.out.print("segundo nome: ");
		segundoNomeController = entrada.next();
		System.out.print("salario fixo: ");
		salarioController = entrada.nextDouble();

		System.out.println("Funcionário é comissionado");
		System.out.println("s-sim\tn-não");
		char escolha = entrada.next().charAt(0);

		if (escolha == 's') {

			System.out.print("valor da comissão: ");
			comissao = entrada.nextDouble();

			System.out.print("numero de vendas do funcionário: ");
			numeroVendas = entrada.nextInt();

			FuncionarioComissionado dados = new FuncionarioComissionado(nomeController, segundoNomeController,
					salarioController, comissao, numeroVendas);
			funcionarioComissionado.add(dados);
		} else {
			Funcionario dados = new Funcionario(nomeController, segundoNomeController, salarioController);
			funcionario.add(dados);
		}

	}

	void buscar() {

		Scanner entrada = new Scanner(System.in);
	

		if (funcionario.isEmpty() && funcionarioComissionado.isEmpty()) {
			System.out.println("Lista vazia");

		} else {
			System.out.print("Insira o nome do funcionário: ");
			String pesquisa = entrada.next();
			for (Funcionario e : funcionario) {
				
				if (e.getPrimeiroNome().equals(pesquisa)) {
					System.out.println(e.toString());
					break;

				}
			}

			for (FuncionarioComissionado e : funcionarioComissionado) {
				if (e.getPrimeiroNome().equals(pesquisa)) {
					System.out.println(e.toString());
					break;

				}
			}

		}

	}

}
