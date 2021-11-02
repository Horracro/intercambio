package com.jms.intercambio.entidades;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Entity
@Table(name = "usuarios")
public class Usuarios implements Serializable {
        @Id
        @Column(name = "idusuarios")
    private  int id;
       @Column(name="email")
        private String email;

    @Column(name="password")
    private String password;

}
