package estruturaDeDados.pilha;

import java.util.Stack;

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
		System.out.println(pilha.peek());
		
		pilha.push("Eduarda");
		System.out.println(pilha);
		
		pilha.pop();
		pilha.pop();
		System.out.println(pilha);
		
		System.out.println(pilha.vazia());
		
		
		Stack<String> stack = new Stack<>();
		
		stack.add("Zuma");
		System.out.println(stack);
		
		stack.add("Xadrez");
		System.out.println(stack);
		
		stack.pop();
		System.out.println(stack);
		
		stack.add("0001");
		System.out.println(stack);
		
		System.out.println(stack.peek());
		
		System.out.println(stack.size());
		
		
		
		
		
		
		
		
		

	}

}
