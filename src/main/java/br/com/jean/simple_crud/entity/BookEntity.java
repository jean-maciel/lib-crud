package br.com.jean.simple_crud.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookEntity {

    @Id
    private Long id;
    private String bookName;
    private String author;

    @ManyToOne
    private StudentEntity student;
}
