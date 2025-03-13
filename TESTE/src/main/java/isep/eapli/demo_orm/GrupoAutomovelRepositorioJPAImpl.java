/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isep.eapli.demo_orm;

import isep.eapli.demo_orm.Domain.GrupoAutomovel;
import java.util.List;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;


/**
 *
 * @author eapli
 */
public class GrupoAutomovelRepositorioJPAImpl extends JpaRepository<GrupoAutomovel, Long> implements GrupoAutomovelRepositorio {

    private EntityManager getEntityManager() {
        EntityManagerFactory factory = Persistence.
                createEntityManagerFactory("DEMOer_ORMPU");
        EntityManager manager = factory.createEntityManager();
        return manager;
    }

    /**
     * inserts an entity GrupoAutomovel
     *
     * @param grupoAutomovel
     * @return the persisted entity
     */
    @Override
    public GrupoAutomovel add(GrupoAutomovel grupoAutomovel) {
        return super.add(grupoAutomovel);
    }

    
    /**
     * reads an entity GrupoAutomovel given its ID
     *
     * @param id
     * @return
     */
    @Override
    public GrupoAutomovel findById(Long id) {
        return super.findById(id);
    }

    /**
     * Returns the List of all entities in the persistence store
     *
     * @return
     */
    //@SuppressWarnings("unchecked")
    @Override
    public List<GrupoAutomovel> findAll() {
        return super.findAll();
    }

    @Override
    protected String persistenceUnitName() {
        return "";
    }

}
