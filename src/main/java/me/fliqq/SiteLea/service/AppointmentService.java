package me.fliqq.SiteLea.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import me.fliqq.SiteLea.model.Appointment;
import me.fliqq.SiteLea.repository.AppointmentRepository;

@Service
public class AppointmentService {
    private final AppointmentRepository appointmentRepository;
    public AppointmentService(AppointmentRepository appointmentRepository) {
        this.appointmentRepository = appointmentRepository;
    }

    public Appointment createAppointment(Appointment appointment) {
        return appointmentRepository.save(appointment);
    }
    public List<Appointment> getAppointmentsByUser(Long userId) {
        return appointmentRepository.findByUserId(userId);
    }
    public Optional<Appointment> getAppointmentById(Long id) {
        return appointmentRepository.findById(id);
    }
    public List<Appointment> getAppointmentsByDate(LocalDateTime date) {
        return appointmentRepository.findByDateTime(date);
    }
    public Appointment updateAppointment(Appointment appointment) {
        return appointmentRepository.save(appointment);
    }
    public void deleteAppointment(Long id) {
        appointmentRepository.deleteById(id);
    }
    public List<Appointment> getAppointmentsInRange(LocalDateTime startDate, LocalDateTime endDate) {
        return appointmentRepository.findAppointmentsInRange(startDate, endDate);
    }
}
