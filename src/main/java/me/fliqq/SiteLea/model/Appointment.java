package me.fliqq.SiteLea.model;

import java.time.LocalDateTime;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private Date dateTime;
    
    @NotBlank
    @Pattern(regexp = "PENDING|CONFIRMED|CANCELLED", message = "Statut invalide")
    private String status;

    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;
    
    @Email
    private String guestEmail;
    @Pattern(regexp = "^(\\+\\d{1,3}[- ]?)?\\d{10}$", message = "Numéro de téléphone invalide")
    private String guestPhone;

    @ManyToOne
    @JoinColumn(name="service_id")
    private Service service;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;


}
