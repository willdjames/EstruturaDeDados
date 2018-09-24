package estruturaDeDados;

import java.util.Arrays;

public class Vetor {

	private Aluno[] alunos = new Aluno[10];
	private int totalAlunos = 0;
	
	
	private void garanteEspaco() {
		if(totalAlunos == alunos.length) {
			Aluno[] novoVetor = new Aluno[alunos.length*2];
			for(int i=0; i<alunos.length; i++) {
				novoVetor[i] = alunos[i];
			}
			this.alunos = novoVetor;
		}
	}
	
	public void adiciona(Aluno aluno) {
		this.garanteEspaco();
		alunos[totalAlunos] = aluno;
		this.totalAlunos++;
	}
	
	private boolean posicaoValida(int posicao) {
		return posicao >=0 && posicao <= totalAlunos;
	}
	public void adicionaNaPosicao(int posicao, Aluno aluno) {
		this.garanteEspaco();
		if(!posicaoValida(posicao)) {
			throw new IllegalArgumentException("POSICAO INVALIDA");
		}
		for(int i = totalAlunos-1; i >= posicao; i-=1) {
			alunos[i+1] = alunos[i];
		}
		alunos[posicao] = aluno;
		totalAlunos++;
	}
	
	
	
	private boolean posicaoOcupada(int posicao) {
		return posicao >=0 && posicao < totalAlunos;
	}
	public Aluno pega(int posicao) {
		if(!posicaoOcupada(posicao)) throw new IllegalArgumentException("POSICAO OCUPADA");
		
		return alunos[posicao];
	}
	
	
	
	public void remove(int posicao) {
		for(int i = posicao; i < totalAlunos; i++) {
			alunos[i] = alunos[i + 1];
		}
		totalAlunos--;
	}
	
	
	
	public boolean contem(Aluno aluno){
		for(int i=0; i < totalAlunos; i++) {
			if(aluno.equals(alunos[i])) return true;
		}
		
		return false;
	}
	
	
	
	public int tamanho() {
		return this.totalAlunos;
	}
	
	
	
	public String toString() {
		return Arrays.toString(alunos);
	}
	
	
}
