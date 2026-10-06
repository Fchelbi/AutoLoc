package tn.esprit.autoloc.service;

import tn.esprit.autoloc.domain.Employe;

import java.util.List;

public interface IEmployeService {

    Employe ajouterEmploye(Employe employe);
    Employe modifierEmploye(Employe employe);
    Employe afficherEmployeById(Long id);
    List<Employe> afficherAllEmploye();
    void supprimerEmploye(Long id);


}
