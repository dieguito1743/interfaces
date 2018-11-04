/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pe.interfaces;

/**
 *
 * @author dbermudez
 */
public interface IJWT {

    /**
     * Crea un token, para obtener ejecutar getJWT, insertar claim utilizar setClaims
     * @param id identificador del token
     * @param issuer autor o creador del toker
     * @param subject para quién se creo el token
     * @param ttlMillis tiempo de vida del token
     */
    void createJWT(String id, String issuer, String subject, long ttlMillis);

    /**
     * Valida un token que fue creado.
     * @param jwt es la cadena del token que será transformada a un objeto para su respectiva validación
     * @return true - si el token aún esta vivo ( dentro del tiempo devida).<br>
     * false - si el token ya expiro.
     */
    boolean validateJWT(String jwt);

    /**
     * Obtiene la llave privada con la que se encripto el token
     * @return string of private key.
     */
    String getApiKey();

    /**
     * Cambia la llave privada con la que se creará o codificará el token
     * si se cambio la llave por defecto de codificar el token asegurese de volver a poner la nueva llave al momento de decodificar
     * @param apiKey 
     */
    void setApiKey(String apiKey);

    /**
     * Funcion que retorna un string del token que fue creado
     * @return string of token
     */
    String getJWT();

    /**
     * Funcion que setea un token
     * @param builder 
     */
    void setJWT(Object builder);

    /**
     * Funcion que agrega custom claims al token creado o seteado.
     * @param atri
     * @param value 
     */
    void setClaims(String atri, Object value);

    /**
     * Funcion que recupera el claims del token creado, validado o seteado.
     * @param atri
     * @return 
     */
    Object getClaims(Object atri);
}
