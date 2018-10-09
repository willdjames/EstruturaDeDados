package estruturaDeDados.fila;

import java.util.LinkedList;

public class Fila {

	LinkedList<String> lista = new LinkedList<>();

	public void push(String string) {
		lista.add(string);
	}

	public void pop() {

		lista.remove(0);
	}

	public String peek() {
		return lista.getLast().toString();
	}

	public int size() {
		return lista.size();
	}
	
	
	@Override
	public String toString() {
		return lista.toString();
	}

	
	
}
