package QuestionTwo;

public class Funcionario {
	public String getPrimeiroNome() {
		return primeiroNome;
	}

	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}

	public String getSegundoNome() {
		return segundoNome;
	}

	public void setSegundoNome(String segundoNome) {
		this.segundoNome = segundoNome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	private String primeiroNome;
	private String segundoNome;
	private double salario;

	public Funcionario(String primeiroNome, String segundoNome, double salario) {
		this.primeiroNome = primeiroNome;
		this.segundoNome = segundoNome;
		this.salario = salario;
	}
}
