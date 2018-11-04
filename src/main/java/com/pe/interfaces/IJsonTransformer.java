/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pe.interfaces;

import java.util.List;

/**
 *
 * @author dbermudez
 */
public interface  IJsonTransformer {
    /**
     * Transforma un objeto a un String json.
     * @param objeto que se transformara json.
     * @return String del objeto en json.
     */
    String toJson(Object objeto);

    /**
     * Transforma un String json a un objeto.
     * @param json string que sera transformado a un objeto.
     * @param clase clase a la cual va ser transformada el json.
     * @return devuelve un objeto del tipo clase.
     */
    <Clase> Clase fromJSON(String json, Class<Clase> clase);

    /**
     * Transforma un String json a una lista de objetos
     * @param json string que sera transformado a una lista de objetos.
     * @param clase que se utiliza para instanciar el tipo de lista.
     * @return devuelve una lista del tipo clase del arreglo de objetos json.
     */
    <Clase> List<Clase> fromListJSON(String json, Class<Clase> clase);
}
