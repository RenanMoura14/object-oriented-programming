package QuestionTwo;

public class FuncionarioComissionado extends Funcionario {
	double comissaoVenda;

	public FuncionarioComissionado(String primeiroNome, String segundoNome, double salario, double comissaoVenda) {
		super(primeiroNome, segundoNome, salario);
		this.comissaoVenda = comissaoVenda;
		// TODO Auto-generated constructor stub
	}
	
	 double calcularSalario(){
		 return comissaoVenda + getSalario();
	 } 
		
}
