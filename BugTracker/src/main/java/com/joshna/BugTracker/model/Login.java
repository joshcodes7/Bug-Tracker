package com.joshna.BugTracker.model;

import jakarta.persistence.*;
import lombok.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "LOGIN_TABLE")
public class Login {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "USERID")
    private String userid;

    @Column(name = "password")
    private String pwd;

}
