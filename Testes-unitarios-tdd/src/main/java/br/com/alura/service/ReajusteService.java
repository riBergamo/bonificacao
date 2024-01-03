package br.com.alura.service;

import br.com.alura.modelo.Desempenho;
import br.com.alura.modelo.Funcionario;

import java.math.BigDecimal;

public class ReajusteService {

    public void reajuste(Funcionario funcionario, Desempenho desempenho) {
            BigDecimal percentual = desempenho.percentualReajuste();
            BigDecimal reajuste = funcionario.getSalario().multiply(percentual);
            funcionario.reajustaSalario(reajuste);

    }
}
