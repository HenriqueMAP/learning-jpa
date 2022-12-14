package model.manytomany;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Uncle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToMany
    private List<Nephew> nephewsList = new ArrayList<>();

    public Uncle() { }

    public Uncle(final String name) {
        super();
        this.name = name;
    }

    public String getName() { return name; }

    public void setName(final String name) { this.name = name; }

    public List<Nephew> getNephewsList() { return nephewsList; }

    public void setNephewsList(final List<Nephew> nephewsList) { this.nephewsList = nephewsList; }
}
