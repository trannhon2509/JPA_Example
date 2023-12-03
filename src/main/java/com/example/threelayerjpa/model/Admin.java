package com.example.threelayerjpa.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
@Entity
@Table(name = "admins")
public class Admin {
    @Id
    @Column(name = "admin_id")
    private Long id;
    @Column(name = "admin_name")
    private String name;

}
