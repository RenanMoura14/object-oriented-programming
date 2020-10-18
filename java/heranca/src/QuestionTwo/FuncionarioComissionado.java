package QuestionTwo;

public class FuncionarioComissionado extends Funcionario {

	double comissaoVenda;
	 int controleDeVendas;

	public FuncionarioComissionado(String primeiroNome, String segundoNome, double salario, double comissaoVenda) {

		super(primeiroNome, segundoNome, salario);
		
		this.comissaoVenda = comissaoVenda;
		controleDeVendas = 0;
	}
	
	double calcularSalario(){
		 return controleDeVendas * comissaoVenda + getSalario();
	} 
	
}
