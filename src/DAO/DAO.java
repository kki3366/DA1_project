/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;

/**
 *
 * @author pc
 */
public abstract class DAO <Entity, PrimaryKeyType>{
    abstract public void insert(Entity enity);
    abstract public void update(Entity enity);
    abstract public void delete(PrimaryKeyType id);
    abstract public List<Entity> selectAll();
    abstract public Entity selectById(PrimaryKeyType id);
    abstract public List<Entity> selectBySql(String sql, Object...args);
}
