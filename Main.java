package GerenciadorDeAgenda;

public class Main {
	public static void main(String[] args) {
		Agenda agenda = new Agenda();
		
		agenda.adicionarContato("Pablo Vittar", 988005544);
		agenda.adicionarContato("Talles" , 999885533);
		agenda.adicionarContato("Francinaldo" , 977885544);
		agenda.adicionarContato("Armando" , 998526677);
		agenda.adicionarContato("Gabryell" , 988809497);
		agenda.adicionarContato("Armando professor" , 988809498);
		
		
		agenda.removerContato(988005544);
		agenda.removerContato(999885533);
		
		System.out.println(agenda.apresentarNumeros("Armando"));
		
		System.out.println(agenda.listarContatos());
		
		agenda.limparAgenda();
		
		System.out.println(agenda.listarContatos());
	}
}
