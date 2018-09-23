package br.com.ramonchiara.testinjection;

import java.util.List;
import javax.enterprise.context.Dependent;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Dependent // https://stackoverflow.com/questions/27706091/unsatisfied-dependencies-for-type-x-with-qualifiers-default
public class ChamadoDaoJpa implements ChamadoDao {

    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Chamado> findAll() {
        return em.createQuery("select c from Chamado c order by c.processo", Chamado.class).getResultList();
    }

}
