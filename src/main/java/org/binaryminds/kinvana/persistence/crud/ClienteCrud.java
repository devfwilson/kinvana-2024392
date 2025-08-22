package org.binaryminds.kinvana.persistence.crud;

import org.binaryminds.kinvana.persistence.entity.Cliente;
//import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ClienteCrud extends JpaRepository<Cliente, Integer> {
    // puede sustituir al DAO
    // Esta interfaz tiene todo
}