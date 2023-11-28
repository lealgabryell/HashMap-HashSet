package GerenciadorDeAgenda;

import java.util.HashMap;
import java.util.HashSet;

public class Agenda {

	HashMap<Integer, String> contatos = new HashMap<Integer, String>();

	public void adicionarContato(String nome, int numero) {
		contatos.put(numero, nome);
	}

	public void removerContato(int numero) {
		contatos.remove(numero);
	}

	public HashSet<Integer> apresentarNumeros(String nome) {

		HashSet<Integer> contatosIguais = new HashSet<Integer>();

		for (Integer s : contatos.keySet()) {
			if (contatos.get(s).equalsIgnoreCase(nome)) {
				contatosIguais.add(s);
			}
		}
		return contatosIguais;
	}

	public String listarContatos() {
		String contato = "";
		for (Integer s : contatos.keySet()) {
			contato += "Nome: " + contatos.get(s) + " Numero: " + s + "\n";
			}
		
		return contato;
	}
	
	public void limparAgenda() {
		contatos.clear();
	}

}
