package me.fliqq.SiteLea.model;

import java.util.Date;

import jakarta.annotation.Nullable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class Appointment {
    private enum Status {
        PENDING,
        CONFIRMED,
        CANCELLED
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Date dateTime;
    private Status status;

    @Nullable
    private User user;
    
    @Email
    private String guestEmail;
    private String guestPhone;
    private Service service;
    private Date createdAt;
    private Date updatedAt;


}
