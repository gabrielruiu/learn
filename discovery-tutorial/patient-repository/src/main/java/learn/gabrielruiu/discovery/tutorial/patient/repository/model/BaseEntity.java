package learn.gabrielruiu.discovery.tutorial.patient.repository.model;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

/**
 * @author Gabriel Mihai Ruiu (gabriel.ruiu@mail.com)
 */
@MappedSuperclass
public class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "created_date", insertable = false, updatable = false)
    private Date createdDate;

    @Column(name = "created_date")
    private Date lastChangedDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getLastChangedDate() {
        return lastChangedDate;
    }

    public void setLastChangedDate(Date lastChangedDate) {
        this.lastChangedDate = lastChangedDate;
    }

    @PrePersist
    public void prePersist() {
        this.setCreatedDate(new Date());
        this.setLastChangedDate(new Date());
    }

    @PreUpdate
    public void preUpdate() {
        this.setLastChangedDate(new Date());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BaseEntity)) return false;
        BaseEntity that = (BaseEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(createdDate, that.createdDate) &&
                Objects.equals(lastChangedDate, that.lastChangedDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, createdDate, lastChangedDate);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BaseEntity{");
        sb.append("id=").append(id);
        sb.append(", createdDate=").append(createdDate);
        sb.append(", lastChangedDate=").append(lastChangedDate);
        sb.append('}');
        return sb.toString();
    }
}
