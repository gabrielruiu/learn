package learn.gabrielruiu.discovery.tutorial.patient.repository.repository;

import learn.gabrielruiu.discovery.tutorial.patient.repository.model.Patient;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

/**
 * @author Gabriel Mihai Ruiu (gabriel.ruiu@mail.com)
 */
public interface PatientRepository extends PagingAndSortingRepository<Patient, Long> {

    Patient findByFirstNameAndLastName(@Param("firstName") String firstName, @Param("lastName") String lastName);
}
