package com.hcmiuiot.MicroSec.models;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@RequiredArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(generator = "uuid", strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private String id;

    @NonNull
    @Column(name = "user_name")
    private String username;

    @NonNull
    @Column(name = "password")
    private String password;
}
