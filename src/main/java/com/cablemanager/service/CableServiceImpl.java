package com.cablemanager.service;

import com.cablemanager.dao.CableDao;
import com.cablemanager.model.Cable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@Service
public class CableServiceImpl implements CableService {

    private CableDao cableDao;

    public void setCableDao(CableDao cableDao) {
        this.cableDao = cableDao;
    }

    @Override
    @Transactional
    public void addCable(Cable cable) {
        this.cableDao.addCable(cable);

    }

    @Override
    @Transactional
    public void updateCable(Cable cable) {
        this.cableDao.updateCable(cable);
    }

    @Override
    @Transactional
    public void deleteCable(int id) {
        this.cableDao.deleteCable(id);
    }

    @Override
    @Transactional
    public Cable getCableById(int id) {
        return this.cableDao.getCableById(id);
    }

    @Override
    @Transactional
    public List<Cable> listCables() {
        return this.cableDao.listCables();
    }

}