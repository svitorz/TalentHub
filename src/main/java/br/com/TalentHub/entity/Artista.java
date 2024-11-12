package br.com.TalentHub.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Artista {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    Long id;

    @Column(
        unique=true,
        nullable=false
    )
    String email;

    String estilo;
    String ano_inicio; //para calcular os anos de experiência.
}
