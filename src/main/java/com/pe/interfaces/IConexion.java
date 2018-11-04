/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pe.interfaces;

import java.sql.Connection;

/**
 *
 * @author dbermudez
 */
public interface IConexion {
    //public IConexion crearConexion(String url, String user, String pass);
    //public IConexion crearConexion();
    public Connection getCnn();
    public void cerrarConexion();
    public void cerrarConexion(Connection cnn);
    public String getUser();
    public String getPass();
    public String getUrl();
    public void setUser(String user);
    public void setPass(String pass);
    public void setUrl(String url);
}
