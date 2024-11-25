package br.edu.ifsul.cc.lpoo.estacionamentoifsul.lpoo_sistemaestacionamentoifsul.dao;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import model.Pessoa;
import model.VinculoPessoa;

public class PersistenciaJPA implements InterfaceBD {

    EntityManager entity;
    EntityManagerFactory factory;

    public PersistenciaJPA() {
        factory = Persistence.createEntityManagerFactory("pu_lpoo_estacionamento");
        entity = factory.createEntityManager();
    }

    @Override
    public Boolean conexaoAberta() {

        return entity.isOpen();
    }

    @Override
    public void fecharConexao() {
        entity.close();
    }

    @Override
    public Object find(Class c, Object id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void persist(Object o) throws Exception {
        entity = getEntityManager();
        try {
            entity.getTransaction().begin();
            if (!entity.contains(o)) {
                o = entity.merge(o);
            }
            entity.persist(o);
            entity.getTransaction().commit();
        } catch (Exception e) {
            if (entity.getTransaction().isActive()) {
                entity.getTransaction().rollback();
            }
        }
    }

    @Override
    public void remover(Object o) throws Exception {
        entity = getEntityManager();
        try {
            entity.getTransaction().begin();
            if (!entity.contains(o)) {
                o = entity.merge(o);
            }
            entity.remove(o);
            entity.getTransaction().commit();
        } catch (Exception e) {
            System.err.println("Erro ao remover item: " + e);
            if (entity.getTransaction().isActive()) {
                entity.getTransaction().rollback();
            }
        }
    }

    public EntityManager getEntityManager() {
        if (entity == null || !entity.isOpen()) {
            entity = factory.createEntityManager();
        }
        return entity;
    }

    public List<Pessoa> getPessoas() {
        entity = getEntityManager();

        try {
            TypedQuery<Pessoa> query = entity.createQuery("Select p from Pessoa p", Pessoa.class);
            return query.getResultList();
        } catch (Exception e) {
            System.err.println("Erro ao buscar Pessoas: " + e);
            return null;
        }

    }

    public List<Pessoa> getPessoas(VinculoPessoa vinculoSelecionado) {
        entity = getEntityManager();

        try {
            TypedQuery<Pessoa> query
                    = entity.createQuery("Select p from Pessoa p where p.vinculoPessoa = '"
                            + vinculoSelecionado + "'",
                            Pessoa.class);
            return query.getResultList();
        } catch (Exception e) {
            System.err.println("Erro ao buscar Pessoas: " + e);
            return null;
        }

    }

    public List<Pessoa> getPessoas(String nome) {
        entity = getEntityManager();

        try {
            TypedQuery<Pessoa> query = entity.createQuery("Select p from Pessoa p where lower(p.nome) LIKE :n", Pessoa.class);
            query.setParameter("n", "%" + nome.toLowerCase() + "%");
            return query.getResultList();
        } catch (Exception e) {
            System.err.println("Erro ao buscar Pessoas: " + e);
            return null;
        }

    }
}
