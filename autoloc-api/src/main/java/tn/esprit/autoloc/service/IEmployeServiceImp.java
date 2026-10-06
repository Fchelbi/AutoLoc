package tn.esprit.autoloc.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.domain.Employe;
import tn.esprit.autoloc.repository.EmployeRepository;

import java.util.List;

@Service
@AllArgsConstructor

public class IEmployeServiceImp implements IEmployeService{
private final EmployeRepository employeRepository;

    @Override

    public Employe ajouterEmploye(Employe employe) {
        return employeRepository.save(employe);
    }

    @Override
    public Employe modifierEmploye(Employe employe) {
        return employeRepository.save(employe);
    }

    @Override
    public Employe afficherEmployeById(Long id) {
        return employeRepository.findById(id).orElse(null);
    }

    @Override
    public List<Employe> afficherAllEmploye() {
        return employeRepository.findAll();
    }

    @Override
    public void supprimerEmploye(Long id) {
        employeRepository.deleteById(id);

    }
}
