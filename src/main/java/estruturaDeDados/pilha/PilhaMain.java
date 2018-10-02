package estruturaDeDados.pilha;

public class PilhaMain {

	public static void main(String[] args) {

		Pilha pilha = new Pilha();
		System.out.println(pilha);
		System.out.println(pilha.vazia());
		
		pilha.push("Bruna");
		System.out.println(pilha);
		
		pilha.push("Cruz");
		System.out.println(pilha);
		
		pilha.push("Daniela");
		System.out.println(pilha);
		
		pilha.pop();
		System.out.println(pilha);
		
		pilha.push("Eduarda");
		System.out.println(pilha);
		
		pilha.pop();
		pilha.pop();
		System.out.println(pilha);
		
		System.out.println(pilha.vazia());

	}

}
