
public class Empregado {

	private String nome;
	private String cargo;
	private Double salario;

	public Empregado() {
		this.nome = nome;
		this.cargo = cargo;
		this.setSalario (salario);

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
		if ("Gerente".equals(this.cargo)) {
			Double valorReajuste = salario * 0.1;
		} else {

		}
		this.salario = salario;

	}

}
