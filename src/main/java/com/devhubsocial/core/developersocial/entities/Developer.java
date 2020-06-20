package com.devhubsocial.core.developersocial.entities;

import lombok.*;
import org.springframework.data.annotation.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Developer {
    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String typeOfDeveloper;
}
