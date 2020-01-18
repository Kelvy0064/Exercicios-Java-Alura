package br.com.caelum.modelo;

public class Data {
	private int dia;
	private int mes;
	private int ano;

	String formatarData() {
		String dataFormatada = this.dia + "/" + this.mes + "/" + this.ano;
		return dataFormatada;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	
}
