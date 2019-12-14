package com.hcmiuiot.MicroSec.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(generator = "uuid", strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private String id;
    @Column(name = "user_name")
    private String username;
    @Column(name = "password")
    private String password;
}
