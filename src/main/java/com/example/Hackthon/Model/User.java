package com.example.Hackthon.Model;

import javax.persistence.*;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
  private   Long id ;
    @Column
   private String name ;

    @Column
    String prenom ;
    @Column
    String email ;
    @Column
    String password ;

}
