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
@Table(name = "departement")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Departement extends BaseEntity {

    @Column( nullable = false)
    private String name;

    @ManyToOne
    private Location location;

    @ManyToOne
    private Employee manager;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @OneToMany(mappedBy = "departement", cascade = CascadeType.ALL )
    private List<Employee> employees;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @OneToMany(mappedBy = "departement", cascade = CascadeType.ALL )
    private List<History> histories;

}
