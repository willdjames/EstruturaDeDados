package estruturaDeDados.listaLigada;

public class ListaLigada {

	private Celula primeira = null;
	private Celula ultima = null;
	private int totalElementos = 0;
	
	
	public void adicionaNoComeco(Object elemento) {
		if(this.totalElementos == 0) {
			Celula nova = new Celula(elemento);
			this.primeira = nova;
			this.ultima = nova;
		}else {
			Celula nova = new Celula(elemento, this.primeira);
			this.primeira.setAnterior(nova);
			this.primeira = nova;
		}
		
		this.totalElementos ++;
	}
	
	public void adicionaNoFim(Object elemento) {
		if(this.totalElementos == 0) {
			this.adicionaNoComeco(elemento);
		}else {
			Celula celula = new Celula(elemento, null);
			
			this.ultima.setProximo(celula);
			this.ultima = celula;
			
			this.totalElementos++;
		}
	}
	
	private boolean posicaoOcupada(int posicao) {
		return posicao >= 0 && posicao < this.totalElementos;
	}
	
	private Celula pegaCelula(int posicao) {
		if(!posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posicao invalida");
		}
		
		Celula atual = this.primeira;
		
		for(int i=0; i<posicao; i++) {
			atual = atual.getProximo();
		}
		
		return atual;
	}
	
	
	public void adicionaElementoNaPosicao(Object elemento, int posicao) {
		
		if(this.totalElementos == 0) {
			this.adicionaNoComeco(elemento);
		}else if(posicao == this.totalElementos) {
			this.adicionaNoFim(elemento);
		}else {
			Celula anterior = this.pegaCelula(posicao - 1);
			
			Celula nova = new Celula(elemento, anterior.getProximo());
			
			anterior.setProximo(nova);
			
			this.totalElementos++;
		}
	}
	
	
	public Object pegaNaPosicao(int posicao) {
		if(!posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posicao invalida");
		}
		
		return this.pegaCelula(posicao).getElemento();
	}
	
	public int tamanho() {
		return this.totalElementos;
	}
	
	public void removeDoComeco() {
		this.primeira = this.primeira.getProximo();
		this.totalElementos--;
		
		if(this.totalElementos == 0) {
			this.ultima = null;
		}
	}
	
	
	
	
	@Override
	public String toString() {
		if(totalElementos == 0) {
			return "[]";
		}
	
		Celula atual = primeira;
		
		StringBuilder builder = new StringBuilder("[");
		
		for(int i=0; i < totalElementos; i++) {
			if(i != 0)builder.append(", ");
			builder.append(atual.getElemento());
			atual = atual.getProximo();
		}
		
		builder.append("]");
		
		return builder.toString();		
	}
}
