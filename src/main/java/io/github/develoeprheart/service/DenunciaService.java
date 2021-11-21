package io.github.develoeprheart.service;

import com.querydsl.jpa.impl.JPAQuery;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.UUID;

@Service
public class DenunciaService {

    public Boolean culpado(UUID uuid){
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("REBELDINHO");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        return null;


    }
}
