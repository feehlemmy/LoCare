package com.locare.bean;

import com.locare.entidades.Enfermeiro;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author gabriel
 */
@SessionScoped
@ManagedBean
public class EnfermeirosBean {
    private Enfermeiro enfermeiro = new Enfermeiro();
    private List<Enfermeiro> enfermeiros = new ArrayList<>();
    
    public void adicionarEnfermeiro(){
        enfermeiros.add(enfermeiro);
        enfermeiro = new Enfermeiro();
    }

    public Enfermeiro getEnfermeiro() {
        return enfermeiro;
    }

    public void setEnfermeiro(Enfermeiro enfermeiro) {
        this.enfermeiro = enfermeiro;
    }

    public List<Enfermeiro> getEnfermeiros() {
        return enfermeiros;
    }

    public void setEnfermeiros(List<Enfermeiro> enfermeiros) {
        this.enfermeiros = enfermeiros;
    }
}
