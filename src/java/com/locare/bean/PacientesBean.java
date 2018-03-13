package com.locare.bean;

import com.locare.entidades.Paciente;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author gabrielmartins
 */
@ManagedBean
@SessionScoped
public class PacientesBean {
    private Paciente paciente = new Paciente();
    private List<Paciente> pacientes = new ArrayList<>();
    
    public void adicionarPaciente(){
        pacientes.add(paciente);
        paciente = new Paciente();
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public List<Paciente> getPacientes() {
        return pacientes;
    }

    public void setPacientes(List<Paciente> pacientes) {
        this.pacientes = pacientes;
    }
}
