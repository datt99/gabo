/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hudsons.daos;

import java.sql.*;

/**
 *
 * @author aldairmh
 */
public class MyConnection {

    private static Connection CONNECTION_INSTANCE = null;

    public static Connection getInstance() {
        if (CONNECTION_INSTANCE == null) {
            try {
                CONNECTION_INSTANCE = DriverManager.getConnection("jdbc:postgresql://localhost:5432/hudsons", "daniel", "12345");
            } catch (SQLException ex) {
                assert false : "Conexión a base de datos fallida";
            }
        }
        return CONNECTION_INSTANCE;
    }

}
