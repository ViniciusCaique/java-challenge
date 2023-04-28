package org.example.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "T_FINDIT_DESTINO ")
public class Destino {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID_DESTINO; 

    private String NM_DESTINO;

    private String DS_PONTOS_TURISTICOS;

    private String SG_PAIS;
}
