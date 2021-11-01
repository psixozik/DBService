package org.example.db.server.repository;

import org.example.db.server.model.UserModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RegistrationRepository extends MongoRepository<UserModel, String> {

}
