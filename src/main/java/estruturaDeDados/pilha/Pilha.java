package estruturaDeDados.pilha;

import java.util.LinkedList;

public class Pilha {

	LinkedList<String> nomes = new LinkedList<>();
	
	public void push(String nome) {
		nomes.add(nome);
	}
	
	public void pop() {
		nomes.remove(nomes.size() - 1);
	}
	
	public boolean vazia() {
		return nomes.isEmpty();
	}
	
	@Override
	public String toString() {
		return nomes.toString();
	}
	
}
