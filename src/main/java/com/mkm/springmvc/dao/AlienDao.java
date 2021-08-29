package com.mkm.springmvc.dao;
import com.mkm.springmvc.model.Alien;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.List;

@Component
public class AlienDao {

    @Autowired
    private SessionFactory sessionFactory;
    @Transactional
    public List<Alien> getAliens(){
        Session session = sessionFactory.getCurrentSession();
        List<Alien> aliens = session.createQuery("from Alien", Alien.class).list();
        return aliens;
    }

}
