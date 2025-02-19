package com.egg.persistencia;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.List;

import com.egg.entidades.Editorial;

public class EditorialDAO {

    private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;

    public EditorialDAO() {
        this.entityManagerFactory = Persistence.createEntityManagerFactory("LibreriaUP");
        this.entityManager = entityManagerFactory.createEntityManager();
    }

    public void guardar(Editorial editorial) {
        entityManager.getTransaction().begin();
        entityManager.persist(editorial);
        entityManager.getTransaction().commit();
    }

    public Editorial buscarPorId(Integer id) {
        return entityManager.find(Editorial.class, id);
    }

    public List<Editorial> listarTodos() {
        return entityManager.createQuery("SELECT e FROM Editorial e", Editorial.class).getResultList();
    }

    public void actualizar(Editorial editorial) {
        entityManager.getTransaction().begin();
        entityManager.merge(editorial);
        entityManager.getTransaction().commit();
    }

    public void eliminar(Integer id) {
        Editorial editorial = buscarPorId(id);
        if (editorial != null) {
            entityManager.getTransaction().begin();
            entityManager.remove(editorial);
            entityManager.getTransaction().commit();
        }
    }

    public void cerrar() {
        if (entityManager != null) {
            entityManager.close();
        }
        if (entityManagerFactory != null) {
            entityManagerFactory.close();
        }
    }
}