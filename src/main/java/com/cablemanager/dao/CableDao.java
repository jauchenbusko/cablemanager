package com.cablemanager.dao;

import com.cablemanager.model.Cable;

import java.util.List;


public interface CableDao {

    public void addCable(Cable cable);

    public void updateCable(Cable cable);

    public void deleteCable(int id);

    public Cable getCableById(int id);

    public List<Cable> listCables();

}
