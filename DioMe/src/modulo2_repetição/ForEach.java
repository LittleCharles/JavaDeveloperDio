package modulo2_repetição;

public class ForEach {
	public static void main(String[] args) {
		String alunos[] = {"FELIPE", "JONAS","JULIA", "MARCOS"};
		
		//Forma abreviada
		for(String aluno : alunos) {
			System.out.println("Nome do aluno: " + aluno);
		}
	}

}
