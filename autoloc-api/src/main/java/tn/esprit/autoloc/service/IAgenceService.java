package tn.esprit.autoloc.service;

import tn.esprit.autoloc.domain.Agence;

import java.util.List;

public interface IAgenceService {

    Agence ajouterAgence(Agence agence);
    Agence modifierAgence(Agence agence);
    Agence afficherAgenceById(Long id);
    List<Agence> afficherAllAgence();
    void supprimerAgence(Long id);
}
