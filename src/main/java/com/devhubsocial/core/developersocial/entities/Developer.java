package com.devhubsocial.core.developersocial.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Developer {
    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String typeOfDeveloper;
}
