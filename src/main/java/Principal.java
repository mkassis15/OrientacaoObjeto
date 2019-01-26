
public class Principal {

	public static void main(String[] args) {
		
		Empregado e = new Empregado();
		e.setNome("Pedro");
		e.setCargo("Gerente");
		e.setSalario(1000.0);
		
		Empregado emp = new Empregado();
		emp.setNome("Altair");
		emp.setCargo("Mestre");
		emp.setSalario(2000.0);
		
		System.out.println("o salario de" + e.getNome()+"é" e.getSalario());
		System.out.println("o salario de" + emp.getNome()+"é" emp.getSalario();
	}
}
