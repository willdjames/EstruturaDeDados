package estruturaDeDados;

public class estrutudaDadosMain {

	public static void main(String[] args) {

		Aluno a1 = new Aluno("Joao");
		Aluno a2 = new Aluno("Maria");
		Aluno a3 = new Aluno("Luciano");
		Aluno a4 = new Aluno("juliana");
		
		Vetor vetor = new Vetor();
		
		vetor.adiciona(a1);
		vetor.adiciona(a2);
		vetor.adiciona(a3);
		System.out.println(vetor);
		
		vetor.adicionaNaPosicao(2, a4);
		System.out.println(vetor);
		
		vetor.remove(0);
		System.out.println(vetor);
		
		System.out.println("300 Alunos adicionados");
		for(int i=0; i<301; i++) {
			Aluno aluno = new Aluno("Aluno_"+ i);
			vetor.adiciona(aluno);
		}
		System.out.println(vetor);
	}

}
