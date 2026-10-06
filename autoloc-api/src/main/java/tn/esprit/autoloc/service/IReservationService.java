package tn.esprit.autoloc.service;

import tn.esprit.autoloc.domain.Reservation;

import java.util.List;

public interface IReservationService {
    Reservation ajouterReservation(Reservation reservation);
    Reservation modifierReservation(Reservation reservation);
    Reservation afficherReservationById(Long id);
    List<Reservation> afficherAllReservation();
    void supprimerReservation(Long id);
}
