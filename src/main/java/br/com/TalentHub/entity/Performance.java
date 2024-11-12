package br.com.TalentHub.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Performance {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    Long id;

    // como duração, tipo de performance, cachê,
    int duracao; //em minutos
    String tipo, feedback;
    Double cache; // em reais.

    @ManyToOne
    Artista artista;

    @ManyToOne
    Evento evento;

}
