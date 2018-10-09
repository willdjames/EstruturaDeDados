package estruturaDeDados.fila;

import java.util.LinkedList;
import java.util.Queue;

public class filaMain {

	public static void main(String[] args) {

		Fila fila = new Fila();
		
		fila.push("Abril");
		System.out.println(fila);
		
		fila.push("Maio");
		System.out.println(fila);
		
		fila.pop();
		System.out.println(fila);
		
		fila.push("Junho");
		System.out.println(fila);
		
		System.out.println(fila.peek());
		
		System.out.println(fila.size());
		
		
		
		Queue<String> queue = new LinkedList<>();
		queue.add("Dezembro");
		System.out.println(queue);
		

		queue.add("Novembro");
		System.out.println(queue);

		queue.remove();
		System.out.println(queue);
	}

}
