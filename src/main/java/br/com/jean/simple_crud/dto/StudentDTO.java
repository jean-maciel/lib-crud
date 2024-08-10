package br.com.jean.simple_crud.dto;

import br.com.jean.simple_crud.entity.BookEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class StudentDTO {

    private Long id;
    private String firstName;
    private String lastName;

    private List<BookEntity> booksTaken;
}
