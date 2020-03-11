/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hudsons.daos;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author daniel
 * @param <T> Typo
 * @param <I> Id de o
 */
public abstract class IDAO <T, I> {
    
    protected Connection connection;
    
    protected IDAO(){
        connection = MyConnection.getInstance();
    }
    
    public abstract void create(T p) throws SQLException;
    public abstract T findById(I id) throws SQLException;
    public abstract void update(T p) throws SQLException;
    public abstract void delete(I p) throws SQLException;
    public abstract ArrayList<T> getAll() throws SQLException;
}
