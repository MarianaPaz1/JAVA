package poo;

public class TestaCliente {

	public static void main(String[] args) {
		//instanciando um objeto da classe Cliente
		
		Cliente c1 = new Cliente ("Mariana", "rom�ntica", "canceriana", 26, false);
		Cliente c2 = new Cliente ("Lucas", "cl�ssico", "�ries", 29, true);
		
		c1.visualizar();
		c2.visualizar();
	}

}
