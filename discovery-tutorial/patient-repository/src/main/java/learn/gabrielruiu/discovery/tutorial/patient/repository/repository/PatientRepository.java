package learn.gabrielruiu.discovery.tutorial.patient.repository.repository;

import learn.gabrielruiu.discovery.tutorial.patient.repository.model.Patient;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * @author Gabriel Mihai Ruiu (gabriel.ruiu@mail.com)
 */
public interface PatientRepository extends PagingAndSortingRepository<Patient, Long> {

    Patient findByFirstNameAndLastName(String firstName, String lastName);
}
