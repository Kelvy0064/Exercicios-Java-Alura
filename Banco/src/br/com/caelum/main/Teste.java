package br.com.caelum.main;

import br.com.caelum.modelo.Conta;
import br.com.caelum.modelo.Data;

public class Teste {

	public static void main(String[] args) {
		Conta c1 = new Conta();
		Conta c2 = new Conta();
		c1.setTitular("Kelvy");
		c1.setAgencia("0772");
		c1.setNumeroConta(10049202);
		c1.deposita(1000);
		Data data = new Data();
		data.setDia(05);
		data.setMes(10);
		data.setAno(2016);
		c1.setData(data);
		c1.deposita(200);
		System.out.println("Conta numero: " + c2.getTotalDeContas());
		System.out.println("Valor atual:" + c1.getSaldo());
		System.out.println("Rendimento mensal: " + c1.calculaRendimento());
		c1.saca(300.25);
		System.out.println("Valor atual:" + c1.getSaldo());
		System.out.println("Rendimento mensal: " + c1.calculaRendimento());
		System.out.println(c1.recuperaDadosParaImpressao());
	}

}
