package model.inheritance.typeone;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {

    @Id
    private Long registrationNumber;

    private String name;
}
