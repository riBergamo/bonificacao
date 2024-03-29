package br.com.alura.bonificacao.service;

import java.math.BigDecimal;
import java.math.RoundingMode;

import br.com.alura.bonificacao.modelo.Funcionario;

public class BonusService {

	public BigDecimal calcularBonus(Funcionario funcionario) {
		BigDecimal valor = funcionario.getSalario().multiply(new BigDecimal("0.1"));

		if (valor.compareTo(new BigDecimal("1000")) > 0) {
			throw new IllegalArgumentException("Fuuncionário com salário maior que R$10.000 não recebe bônus");
		}

		return valor.setScale(2, RoundingMode.HALF_UP); //.setScale(numeroDeCasasDecimais, regra de arredondamento) // .HALF_UP : arredonda pra cima
	}

}
