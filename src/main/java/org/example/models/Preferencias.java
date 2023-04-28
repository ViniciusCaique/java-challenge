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
@Table(name = "T_FINDIT_PREFERECIAS")
public class Preferencias {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID_PREFERENCIA;

    private String NM_PREFERENCIA;

    private String TP_PREFERENCIA;

    // foreign key de id_usuario
}
