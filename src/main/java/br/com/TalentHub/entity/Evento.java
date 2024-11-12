package br.com.TalentHub.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Evento {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    Long id;

    // incluindo datas, locais, e público-alvo
    String data, local,publico_alvo;

    @OneToMany
    Performance performance;
}
