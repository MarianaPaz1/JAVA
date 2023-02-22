package poo;

public class Cliente {
	// declaração dos atributos da classe
	private String nomeCliente;
	private String estilo;
	private String signo;
	private int idade;
	private boolean clienteAtivo=true;

	public Cliente(String nomeCliente, String estilo, String signo, int idade, boolean clienteAtivo) {
		super();
		this.nomeCliente = nomeCliente;
		this.estilo = estilo;
		this.signo = signo;
		this.idade = idade;
		this.clienteAtivo = clienteAtivo;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getEstilo() {
		return estilo;
	}

	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}

	public String getSigno() {
		return signo;
	}

	public void setSigno(String signo) {
		this.signo = signo;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public boolean isClienteAtivo() {
		return clienteAtivo;
	}

	public void setClienteAtivo(boolean clienteAtivo) {
		this.clienteAtivo = clienteAtivo;
	}

	public void visualizar() {
		System.out.println("O(a) cliente " + nomeCliente + " com estilo " + estilo + " relativo(a) ao signo " + signo
				+ " comandado(a) pela idade " + idade + " frequenta a nossa loja: " + clienteAtivo);
	}
}
