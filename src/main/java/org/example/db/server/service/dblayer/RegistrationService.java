package org.example.db.server.service.dblayer;

import org.example.db.server.model.RegModelDTO;

public interface RegistrationService {

    void registerUser(RegModelDTO clientModel);
}
