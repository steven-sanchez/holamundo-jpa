/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans.cliente;


import beans.dominio.Persona;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


/**
 *
 * @author macbook
 */
public class ClienteEntidadPersona {
    
    static Logger log = LogManager.getRootLogger();
    
    
    public static void main(String[] args){
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PersonaPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        //inicia la trx
        tx.begin();
        
        //no se debe especidificar el ID ya que se genera automatico
        Persona persona1 = new Persona("Maria", "Sanchez", "Luna", "mmm@hot.com", "11113333");
        log.debug("Objeto a persistir: "+persona1);
        
        //persistimos el objeto
        em.persist(persona1);
        
        //terminamos la trx
        tx.commit();
        log.debug("Objeto persistido: "+persona1);
        
        em.close();
        
       
    } 
    
    
    
    
}
