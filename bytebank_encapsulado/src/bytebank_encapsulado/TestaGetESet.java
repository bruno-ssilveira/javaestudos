package bytebank_encapsulado;

public class TestaGetESet {
	
	public static void main(String[] args) {
		
		Conta conta = new Conta(2277, 35665);
		conta.setNumero(1337);
		
		Cliente paulo = new Cliente();
		paulo.setNome("paulo silveira");
		
		conta.setTitular(paulo);
		
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("programador");
		
	}
	
}