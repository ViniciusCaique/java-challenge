package org.example.models;

import java.time.LocalDate;

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
@Table(name = "T_FINDIT_VIAGEM")
public class Viagem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)   
    private int ID_VIAGEM;

    private String DS_VIAGEM;

    private LocalDate DT_PARTIDA;

    private LocalDate DT_FIM;


    // foreign key de id_usuario

    // foreign key de id_destino


    
}
