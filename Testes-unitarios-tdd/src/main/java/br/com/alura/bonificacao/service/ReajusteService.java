package br.com.alura.bonificacao.service;

import br.com.alura.bonificacao.modelo.Desempenho;
import br.com.alura.bonificacao.modelo.Funcionario;

import java.math.BigDecimal;

public class ReajusteService {

    public void reajuste(Funcionario funcionario, Desempenho desempenho) {
            BigDecimal percentual = desempenho.percentualReajuste();
            BigDecimal reajuste = funcionario.getSalario().multiply(percentual);
            funcionario.reajustaSalario(reajuste);

    }
}
