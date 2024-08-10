package br.com.jean.simple_crud.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentEntity {

    @Id
    private Long id;
    private String firstName;
    private String lastName;

    @OneToMany(mappedBy = "student")
    private List<BookEntity> booksTaken;

}
