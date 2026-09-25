package tn.esprit.autoloc.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import tn.esprit.autoloc.domain.CategorieVehicule;
import tn.esprit.autoloc.domain.StatutVehicule;
import tn.esprit.autoloc.domain.Vehicule;
import tn.esprit.autoloc.repository.VehiculeRepository;

import java.math.BigDecimal;
import java.util.List;

@Component
public class DemoDataLoader implements CommandLineRunner {

    private final VehiculeRepository vehiculeRepository;

    public DemoDataLoader(VehiculeRepository vehiculeRepository) {
        this.vehiculeRepository = vehiculeRepository;
    }

    @Override
    public void run(String... args) {
        if (vehiculeRepository.count() > 0) {
            return;
        }
        vehiculeRepository.saveAll(List.of(
                new Vehicule(null, "123 TU 4567", "Peugeot", "208", CategorieVehicule.CITADINE,
                        new BigDecimal("90.00"), StatutVehicule.DISPONIBLE),
                new Vehicule(null, "234 TU 5678", "Volkswagen", "Passat", CategorieVehicule.BERLINE,
                        new BigDecimal("150.00"), StatutVehicule.DISPONIBLE),
                new Vehicule(null, "345 TU 6789", "Kia", "Sportage", CategorieVehicule.SUV,
                        new BigDecimal("180.00"), StatutVehicule.MAINTENANCE)
        ));
    }
}