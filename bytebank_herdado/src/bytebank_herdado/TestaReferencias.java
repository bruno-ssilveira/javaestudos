package bytebank_herdado;

public class TestaReferencias {

	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
		g1.setNome("marcos");
		g1.setSalario(5000.0);
		
		EditorVideo ev = new EditorVideo();
	    ev.setSalario(2500.0);
	    
	    Designer d1 = new Designer();
	    d1.setSalario(2000.0);
	    
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		controle.registra(ev);
		controle.registra(d1);
		
		System.out.println(g1.getBonificacao());
		System.out.println(ev.getBonificacao());
		System.out.println(d1.getBonificacao());
		
	}

}