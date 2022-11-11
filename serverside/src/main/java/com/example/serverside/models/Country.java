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
@Table(name = "county")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Country extends BaseEntity {
    
    @Column( nullable = false)
    private String name;

    @Column( nullable = false)
    private String code;

    @ManyToOne
    private Region region;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @OneToMany(mappedBy = "country", cascade = CascadeType.ALL )
    private List<Location> locations;
}
