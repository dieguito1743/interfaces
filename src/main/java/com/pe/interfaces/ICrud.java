/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pe.interfaces;

import com.pe.util.BussinessException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

/**
 *
 * @author dbermudez
 */
public interface ICrud<Clase> {

    /**
     * Este metodo inserta un <b>Objeto Nuevo</b> en la base de datos.
     * @param objetoNuevo indica el objeto nuevo que se va Insertar en la tabla
     * @return <b>entero</b> retorna la ultima llave primaria, si menor igual
     * que 0, no se inserto nada.
     */
    String insertar(Clase objetoNuevo) throws BussinessException;

    /**
     * Este metodo actualiza un <b>Objeto Antiguo</b> en la base de datos.
     * @param objetoAntiguo indica el objeto antiguo que se va Actualizar en la
     * tabla
     * @param objetoActualizar posee los nuevos datos que se actualizaran en
     * ObjetoAntiguo
     * @return <b>true</b> si el objeto fue actualizado sin problemas.
     * <br>
     * <b>false</b> si el objeto no se actualizo.
     */
    boolean actualizar(Clase objetoAntiguo, Clase objetoActualizar) throws BussinessException;

    /**
     * Este metodo borra un <b>Objeto</b> en la base de datos.
     * @param objetoBorrar indica el objeto que se borrara de la base de datos
     * @return <b>true</b> si el objeto fue borrado satisfactoriamente.
     * <br>
     * <b>false</b> si el objeto fue borrado.
     */
    boolean eliminar(Clase objetoBorrar) throws BussinessException;

    /**
     * Este metodo realiza una consulta sin filtros
     * @return <b>Lista</b>  de Objetos de la consulta
     */
    List<Clase> consultarTodo() throws BussinessException;

    /**
     * Este metodo realiza una consulta con filtros
     * @param listaParametros (nombre del campo, valor, tipo de dato)
     * @return <b>Lista</b>  de Objetos de la consulta
     */
    List<Clase> consultarTodo(List<Clase> listaParametros) throws BussinessException;

    Clase consultarUnoByPK(Object primaryKey) throws BussinessException;

    void closes(PreparedStatement pst, ResultSet rs);
    
    public void verificarConexion();
}
