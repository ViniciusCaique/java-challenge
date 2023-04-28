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
@Table(name = "T_FINDIT_PACOTES")
public class Pacotes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID_PACOTES; 

    private String NM_PACOTE;

    private String TP_PACOTE;

    private String DS_PACOTE;


    // foreign key de id agencia 
    // foreign key de id_destino 

}
