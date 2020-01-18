package br.com.caelum.modelo;

public class Conta {
	private static int totalDeContas;
	private String nomeDoTitular;
	private int numeroDaConta;
	private String agencia;
	private double saldoConta;
	private Data dataAbertura;

	public static int getTotalDeContas() {
		return Conta.totalDeContas;
	}

	public Conta() {
		Conta.totalDeContas = Conta.totalDeContas + 1;
	}

	public Conta(String titular) {
		this.nomeDoTitular = titular;
		Conta.totalDeContas = Conta.totalDeContas + 1;
	}

	public String getTitular() {
		return this.nomeDoTitular;
	}

	public void setTitular(String titular) {
		this.nomeDoTitular = titular;
	}

	public void setNumeroConta(int numero) {
		this.numeroDaConta = numero;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public double getSaldo() {
		return this.saldoConta;
	}

	public void setData(Data data) {
		this.dataAbertura = data;
	}

	public void saca(double valorSacado) {
		if (valorSacado <= this.saldoConta)
			this.saldoConta -= valorSacado;
	}

	public void deposita(double valorDepositado) {
		if (valorDepositado > 0)
			this.saldoConta += valorDepositado;
	}

	public double calculaRendimento() {
		double rendimento = this.saldoConta * 0.01;
		return rendimento;
	}

	public String recuperaDadosParaImpressao() {
		String dados = "Titular: " + this.nomeDoTitular;
		dados += "\nNumero da Conta: " + this.numeroDaConta;
		dados += "\nAgencia: " + this.agencia;
		dados += "\nSaldo: " + this.saldoConta;
		dados += "\nData: " + this.dataAbertura.formatarData();
		return dados;
	}
}
