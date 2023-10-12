package com.ibtihadj.paygate.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "payements")
@Entity
public class Payement implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private String nom;

    private String prenom;

    private String telephone;

    private Double montant;

    private int etat; // 0 : Paiement réussi avec succès 2 : En cours 4 : Expiré 6: Annulé



}
