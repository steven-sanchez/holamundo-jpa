/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans.dominio;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author macbook
 */
@Entity
public class Persona implements Serializable {
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_persona")
    private Integer idPersona;
    
    
    @Column(nullable = false, length = 45)
    private String nombre;
    
    @Column(name = "apellido_paterno", nullable = false, length = 45)
     private String apePaterno;
     
    @Column(name = "apellido_materno", length = 45)
      private String apeMaterno;
    
    @Column(nullable = false, length = 45)
    private String email;
   
    @Column(length = 45)
    private String telefono;
            
    
    public Persona(){
        
    }
            
    public Persona(int idPersona){
        this.idPersona = idPersona;
    }        
    
    
     public Persona(String nombre, String apePaterno, String apeMaterno, String email, String telefono){
        this.nombre = nombre;
        this.apePaterno = apePaterno;
        this.apeMaterno = apeMaterno;
        this.email = email;
        this.telefono = telefono;
        
    } 

    /**
     * @return the idPersona
     */
    public Integer getIdPersona() {
        return idPersona;
    }

    /**
     * @param idPersona the idPersona to set
     */
    public void setIdPersona(Integer idPersona) {
        this.idPersona = idPersona;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apePaterno
     */
    public String getApePaterno() {
        return apePaterno;
    }

    /**
     * @param apePaterno the apePaterno to set
     */
    public void setApePaterno(String apePaterno) {
        this.apePaterno = apePaterno;
    }

    /**
     * @return the apeMaterno
     */
    public String getApeMaterno() {
        return apeMaterno;
    }

    /**
     * @param apeMaterno the apeMaterno to set
     */
    public void setApeMaterno(String apeMaterno) {
        this.apeMaterno = apeMaterno;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
     
    /* 
    @Override
    public String toString(){
    
    return "Persona []";
    
    
    }
    
    */
    
    
    
    
}
