package org.example.db.server.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@EqualsAndHashCode(callSuper = true)
@Data
@Document(collection = "usermodel")
public class UserModel extends RegModelDTO {

    @Id
    private String id;
}
