package com.locare.entidades;

/**
 *
 * @author gabrielmartins
 */
public class Paciente extends Usuario{
    private String numeroCartao;

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }
}
