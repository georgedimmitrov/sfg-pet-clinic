package guru.springframework.sfgpetclinic.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "vets")
public class Vet extends Person {

   @ManyToMany(fetch = FetchType.EAGER)
   @JoinTable(name = "vet_specialties", joinColumns = @JoinColumn(name = "vet_id"),
           inverseJoinColumns = @JoinColumn(name = "speciality_id"))
   private Set<Speciality> specialities = new HashSet<>();
}
