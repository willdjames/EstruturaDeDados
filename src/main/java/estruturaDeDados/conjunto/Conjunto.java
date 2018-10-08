package estruturaDeDados.conjunto;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Conjunto {

	
	private ArrayList<LinkedList<String>> tabela = new ArrayList<>();
	
	public Conjunto() {
		for(int i=0; i<26; i++) {
			tabela.add(new LinkedList<String>());
		}
	}
	
	
	public void adiciona(String palavra) {
		if(!contem(palavra)) {
			int indice = espalhamento(palavra);		
			List<String> list = tabela.get(indice);
			list.add(palavra);
		}
	}
	
	public void remove(String palavra) {
		if(contem(palavra)) {
			int indice = espalhamento(palavra);
			List<String> list = tabela.get(indice);
			list.remove(palavra);
		}
	}
	
	private boolean contem(String palavra) {
		int indice = espalhamento(palavra);
		return tabela.get(indice).contains(palavra);
	}


	private int espalhamento(String palavra) {
		return palavra.toLowerCase().charAt(0) % 26;
	}


	@Override
	public String toString() {
		return tabela.toString();
	}
	
}
