package learn.gabrielruiu.discovery.tutorial.patient.repository.model;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

/**
 * @author Gabriel Mihai Ruiu (gabriel.ruiu@mail.com)
 */
@Entity
public class Operation extends BaseEntity {

    @Column(name = "date_performed")
    private Date datePerformed;

    @Column(name = "patient")
    @ManyToOne()
    private Patient patient;

    public Date getDatePerformed() {
        return datePerformed;
    }

    public void setDatePerformed(Date datePerformed) {
        this.datePerformed = datePerformed;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Operation)) return false;
        if (!super.equals(o)) return false;
        Operation operation = (Operation) o;
        return Objects.equals(datePerformed, operation.datePerformed) &&
                Objects.equals(patient, operation.patient);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), datePerformed, patient);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Operation{");
        sb.append("datePerformed=").append(datePerformed);
        sb.append(", patient=").append(patient);
        sb.append('}');
        return sb.toString();
    }
}
