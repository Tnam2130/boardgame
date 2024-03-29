package com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class comments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer commentid;
    @ManyToOne
    @JoinColumn(name = "boardgameid")
    boardgameproduct boardgameproduct;
    @ManyToOne
    @JoinColumn(name = "username")
    accounts accounts;
    String commentdes;
}
