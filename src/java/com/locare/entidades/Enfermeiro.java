package com.locare.entidades;

/**
 *
 * @author gabrielmartins
 */
public class Enfermeiro extends Usuario{
    private String registro;
    private String dataFormacao;

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public String getDataFormacao() {
        return dataFormacao;
    }

    public void setDataFormacao(String dataFormacao) {
        this.dataFormacao = dataFormacao;
    }
}
