package netmehdi.userms2.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import netmehdi.userms2.enums.Gender;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(length = 50,nullable = false)
    private String nom;
    private String prenom;
    @Column(nullable = false) @Enumerated(EnumType.STRING)
    private Gender gender;
}
