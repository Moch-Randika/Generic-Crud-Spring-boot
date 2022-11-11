package com.example.serverside.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.example.serverside.models.baseEntity.BaseEntity;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "location")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Location extends BaseEntity{

    @Column(nullable = true)
    private String street_adress;

    @Column(nullable = true)
    private String postal_code;

    @Column(nullable = false)
    private String city;

    @Column(nullable = true)
    private String state_province;

    @ManyToOne
    private Country country;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @OneToMany(mappedBy = "location", cascade = CascadeType.ALL )
    private List<Departement> departement;

}
