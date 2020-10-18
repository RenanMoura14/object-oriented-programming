package QuestionTwo;

public class FuncionarioComissionado extends Funcionario {

	
	double comissaoVenda;
	 int controleDeVendas;

	public FuncionarioComissionado(String primeiroNome, String segundoNome, double salario, double comissaoVenda, int controleDeVendas) {
	
		super(primeiroNome, segundoNome,  salario);
		
		this.comissaoVenda = comissaoVenda;
		controleDeVendas = 0;
	}
	
	double calcularSalario(){
		 return controleDeVendas * comissaoVenda + getSalario();
	} 
	
	@Override
	public String toString() {
		return super.toString() + " Salário Comisionado " + calcularSalario()
				+ "]";
	}

	
}
