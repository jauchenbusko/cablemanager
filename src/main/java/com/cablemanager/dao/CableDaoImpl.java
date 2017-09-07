package com.cablemanager.dao;

import com.cablemanager.model.Cable;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CableDaoImpl implements CableDao {

    private static final Logger logger = LoggerFactory.getLogger(CableDaoImpl.class);

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void addCable(Cable cable) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(cable);
        logger.info("Cable successfully saved. Cable details: " + cable);
    }

    @Override
    public void updateCable(Cable cable) {
        Session session = this.sessionFactory.getCurrentSession();
        session.update(cable);
        logger.info("Cable successfully updated. Cable details: " + cable);
    }

    @Override
    public void deleteCable(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        Cable cable = (Cable) session.load(Cable.class, new Integer(id));

        if (cable!=null){
            session.delete(cable);
        }
        logger.info("Cable successfully deleted. Cable details: " + cable);
    }

    @Override
    public Cable getCableById(int id) {
        Session session = this.sessionFactory.getCurrentSession();

        Cable cable = (Cable) session.load(Cable.class, new Integer(id));
        logger.info("Cable successfully deleted. Cable details: " + cable);

        return cable;
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Cable> listCables() {
        Session session = this.sessionFactory.getCurrentSession();
        List<Cable> cableList = session.createQuery("from Cable").list();

        for (Cable cable:
                cableList) {
            logger.info("Cable list: " + cable);
        }

        return cableList;
    }
}
