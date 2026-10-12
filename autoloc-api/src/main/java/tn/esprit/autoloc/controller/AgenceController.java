package tn.esprit.autoloc.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Agence;
import tn.esprit.autoloc.service.IAgenceService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/agences")

public class AgenceController {

    private final IAgenceService agenceService;
    @GetMapping("/afficherAgences")
    public List<Agence> getAllAgence(){
        return agenceService.afficherAllAgence();

    }

    @PostMapping("/ajouterAgence")
    public Agence ajouterAgence(@RequestBody Agence agence){
        return agenceService.ajouterAgence(agence);
    }

    @PutMapping("/modifierAgence")
    public Agence modifierAgence(@RequestBody Agence agence){
        return agenceService.modifierAgence(agence);
    }

    @GetMapping("/afficherAgence/{id}")
    public Agence afficherAgence(@PathVariable Long id){
        return agenceService.afficherAgenceById(id);
    }

    @DeleteMapping("/supprimerAgence/{idA}")
    public void supprimerAgence(@PathVariable Long idA){
        agenceService.supprimerAgence(idA);
    }

}
