package br.com.jean.simple_crud.dto;

import br.com.jean.simple_crud.entity.StudentEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class BookDTO {

    private Long id;
    private String bookName;
    private String author;

    private StudentEntity student;
}
