package ca.opb.oktautils.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
//@Embeddable
public class Geo {
    @Id
    @GeneratedValue( strategy = GenerationType.AUTO )
    private Long id;
    private String lat;
    private String lng;

    public Geo() {}
}