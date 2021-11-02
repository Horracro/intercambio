package com.jms.intercambio.repositorios;

import com.jms.intercambio.entidades.Usuarios;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuariosDAO extends CrudRepository <Usuarios,Integer> {


}
