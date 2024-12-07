package com.gamestop.server.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "eod_results")
public class EODPoll {
    @Id
    private LocalDate date;
    private double total;
}
