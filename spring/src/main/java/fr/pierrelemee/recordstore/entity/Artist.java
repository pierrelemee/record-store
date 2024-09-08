package fr.pierrelemee.recordstore.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "\"Artist\"")
public class Artist {

    @Id
    @GeneratedValue
    @Column(name="\"ArtistId\"")
    protected Long id;


    @Column(name="\"Name\"")
    protected String name;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
