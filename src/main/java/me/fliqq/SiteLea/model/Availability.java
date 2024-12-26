package me.fliqq.SiteLea.model;

import java.sql.Date;
import java.sql.Time;
import java.time.DayOfWeek;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class Availability {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private DayOfWeek dayOfWeek;
    private Time startTime;
    private Time endTime;
    private Date createdAt;
    private Date updatedAt;
}
