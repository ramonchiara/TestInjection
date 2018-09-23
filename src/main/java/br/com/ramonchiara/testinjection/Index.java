package br.com.ramonchiara.testinjection;

import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@RequestScoped
public class Index {

    @Inject
    private ChamadoDao dao;

    private List<Chamado> chamados = new ArrayList<>();

    public List<Chamado> getChamados() {
        return chamados;
    }

    public void acionaDao() {
        chamados = dao.findAll();
    }

}
