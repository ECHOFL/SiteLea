package me.fliqq.SiteLea.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import me.fliqq.SiteLea.model.Appointment;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
    List<Appointment> findByDateTime(LocalDateTime dateTime);

    List<Appointment> findByUserId(Long userId);

    @Query("SELECT a FROM Appointment a WHERE a.dateTime BETWEEN :startDate AND :endDate")
    List<Appointment> findAppointmentsInRange(
        @Param("startDate") LocalDateTime startDate,
        @Param("endDate") LocalDateTime endDate
    );
}