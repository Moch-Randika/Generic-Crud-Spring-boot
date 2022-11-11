package com.example.serverside.models;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.example.serverside.models.baseEntity.BaseEntity;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "employee")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Employee extends BaseEntity {
    
    @Column( nullable = false)
    private String first_name;

    @Column( nullable = false)
    private String last_name;

    @Column(unique=true, nullable = false)
    private String email;

    @Column(nullable = true)
    private String phone_number;

    @Column(nullable = false)
    private LocalDateTime hire_date;

    @Column(nullable = true)
    private String salary;

    @Column(nullable = true)
    private String comission_pct;

    // self join
    
    @ManyToOne(cascade={CascadeType.MERGE})
	@JoinColumn(name="manager_id")
    private Employee manager;
    
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @OneToMany(mappedBy="manager", fetch = FetchType.LAZY)
	private Set<Employee> subordinates = new HashSet<Employee>();

    @ManyToOne
    private Job job;

    @ManyToOne
    private Departement departement;
   
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @OneToMany(mappedBy = "manager", cascade = CascadeType.ALL)
    private List<Departement> departements;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL )
    private List<History> histories;


}
