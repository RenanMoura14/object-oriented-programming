package QuestionTwo;

public class FuncionarioComissionado extends Funcionario {
	//exetends palavra reservada para herdar os métodos e atributos de determinada classe
	double comissaoVenda;

	public FuncionarioComissionado(String primeiroNome, String segundoNome, double salario, double comissaoVenda) {
		//super palavra reservada para passar os dados para super classe
		super(primeiroNome, segundoNome, salario);
		
		this.comissaoVenda = comissaoVenda;
	}
	
	 double calcularSalario(){
		 return comissaoVenda + getSalario();
	 } 
		
}
