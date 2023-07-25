package bytebank;

public class TesteReferencias {
	
	public static void main(String[] args) {
		
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		System.out.println("saldo da primeira: " + primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;
		System.out.println("saldo da segunda conta: " + segundaConta.saldo);
		
		segundaConta.saldo += 100;
		System.out.println("saldo segunda conta atualizado: " + segundaConta.saldo);
		
		if (primeiraConta == segundaConta) {
			System.out.println("sao a mesma conta!");
		}
		
		Conta terceiraConta = new Conta();
		terceiraConta.saldo = 200;
		System.out.println("saldo terceira conta: " + terceiraConta.saldo);
		
		if (primeiraConta == terceiraConta) {
			System.out.println("sao a mesma conta!");
		} else {
			System.out.println("sao contas diferentes!");
		}
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
		System.out.println(terceiraConta);
		
	}
}