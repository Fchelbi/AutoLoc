package tn.esprit.autoloc.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.domain.Agence;
import tn.esprit.autoloc.repository.AgenceRepository;

import java.util.List;


@Service
@AllArgsConstructor

public class IAgenceServiceImp implements IAgenceService{
    private final AgenceRepository agenceRepository ;

    @Override
    public Agence ajouterAgence(Agence agence) {
        return agenceRepository.save(agence);
    }

    @Override
    public Agence modifierAgence(Agence agence) {
        return agenceRepository.save(agence);
    }

    @Override
    public Agence afficherAgenceById(Long id) {
        return agenceRepository.findById(id).orElse(null);
    }

    @Override
    public List<Agence> afficherAllAgence() {
        return agenceRepository.findAll();
    }

    @Override
    public void supprimerAgence(Long id) {
        agenceRepository.deleteById(id);

    }
}
