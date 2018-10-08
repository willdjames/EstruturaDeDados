package estruturaDeDados.conjunto;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoMain {

	public static void main(String[] args) {

		Conjunto conjunto = new Conjunto();
		System.out.println(conjunto);
		
		conjunto.adiciona("Bruna");
		System.out.println(conjunto);
		
		conjunto.adiciona("William");
		System.out.println(conjunto);
		
		conjunto.adiciona("William"); // Nao podera adicionar igual
		System.out.println(conjunto);
		
		conjunto.adiciona("Zema");
		System.out.println(conjunto);
		
		conjunto.adiciona("Barbara");
		System.out.println(conjunto);
		
		conjunto.remove("William");
		System.out.println(conjunto);
		
		// Implementacao java
		Set<String> hashSet = new HashSet<String>();
		hashSet.add("William");
		hashSet.add("Barbara");
		System.out.println(hashSet);
		
		System.out.println("William".hashCode());
		
	}

}
