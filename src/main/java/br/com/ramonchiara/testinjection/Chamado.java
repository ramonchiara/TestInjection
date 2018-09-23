package br.com.ramonchiara.testinjection;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "chamados")
public class Chamado implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private String processo;

    @Column
    private String jira;

    @Column
    private String chamadoInterno;

    @Column
    private String descricao;

    public Chamado() {
    }

    public Chamado(String processo, String jira, String chamadoInterno, String descricao) {
        this.processo = processo;
        this.jira = jira;
        this.chamadoInterno = chamadoInterno;
        this.descricao = descricao;
    }

    public String getProcesso() {
        return processo;
    }

    public String getJira() {
        return jira;
    }

    public String getChamadoInterno() {
        return chamadoInterno;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.processo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Chamado other = (Chamado) obj;
        if (!Objects.equals(this.processo, other.processo)) {
            return false;
        }
        return true;
    }

}
