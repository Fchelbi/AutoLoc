package tn.esprit.autoloc.service;

import tn.esprit.autoloc.domain.Vehicule;

import java.util.List;

public interface IVehiculeService {
    Vehicule ajouterVehicule(Vehicule vehicule);
    Vehicule modifierVehicule(Vehicule vehicule);
    Vehicule afficherVehiculeById(Long id);
    List<Vehicule> modifierAllVehicule();
    void supprimerVehicule(Long id);
}
