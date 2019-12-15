package pl.projekt.springwithgit.Domain;


import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;

@Data
@AllArgsConstructor
@Entity
public class Address {
    private Long id;
    private String city;
    private String street;
    private int flatNumber;
//

}
