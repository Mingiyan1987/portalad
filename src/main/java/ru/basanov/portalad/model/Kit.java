package ru.basanov.portalad.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@NoArgsConstructor
@Setter
@Getter
public class Set {

    @Id
    private Long id;

    @OneToMany(mappedBy = "set")
    private List<Item> items;

    @ManyToOne
    @JoinColumn(name = "owner_id")
    private User owner;
}
