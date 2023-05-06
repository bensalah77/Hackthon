package com.example.Hackthon.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Data
@Getter
@Setter
public class Roles {
    public Roles(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
  private   Long id ;
    @Column
   private String name ;

    public Roles() {

    }
}
