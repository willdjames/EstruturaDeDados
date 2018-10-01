package estruturaDeDados.listaLigada;

public class ListaLigadaMain {

	
	public static void main(String[] args) {
		ListaLigada listaLigada = new ListaLigada();
		
		System.out.println(listaLigada);
		listaLigada.adicionaNoFim("Elisio");
		System.out.println(listaLigada);
		listaLigada.adicionaNoComeco("Adriano");
		System.out.println(listaLigada);
		listaLigada.adicionaNoComeco("Bruna");
		System.out.println(listaLigada);
		listaLigada.adicionaNoComeco("Carlos");
		System.out.println(listaLigada);
		listaLigada.adicionaNoComeco("Daniela");
		System.out.println(listaLigada);
		listaLigada.adicionaElementoNaPosicao("Terceiro", 5);
		System.out.println(listaLigada);
		System.out.println(listaLigada.pegaNaPosicao(0));
		System.out.println(listaLigada.tamanho());
		
		listaLigada.removeDoComeco();
		System.out.println(listaLigada);
		System.out.println(listaLigada.tamanho());
	}
}
