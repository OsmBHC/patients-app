package ma.enset.patientsapp.web;

import ma.enset.patientsapp.entities.Patient;
import ma.enset.patientsapp.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PatientRestService {
    @Autowired
    private PatientRepository patientRepository;

    @GetMapping("/patients")
    public List<Patient> patients() {
        return patientRepository.findAll();
    }

    @GetMapping("/patients/{id}")
    public Patient findPatient(@PathVariable Long id) {
        return patientRepository.findById(id).get();
    }
}
