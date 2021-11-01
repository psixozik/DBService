package org.example.db.server.service.dblayer;

import lombok.extern.slf4j.Slf4j;
import org.example.db.server.model.RegModelDTO;
import org.example.db.server.model.UserModel;
import org.example.db.server.repository.RegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class RegistrationServiceImpl implements RegistrationService {

    private final RegistrationRepository registrationRepository;

    @Autowired
    public RegistrationServiceImpl(RegistrationRepository registrationRepository) {
        this.registrationRepository = registrationRepository;
    }

    @Override
    public void registerUser(RegModelDTO clientModel) {
        UserModel userModel = new UserModel();
        userModel.setFullName(clientModel.getFullName());
        userModel.setBirthDate(clientModel.getBirthDate());
        userModel.setFirstName(clientModel.getFirstName());
        userModel.setSecondName(clientModel.getSecondName());
        userModel.setLastName(clientModel.getLastName());
        UserModel userModelSaved = registrationRepository.save(userModel);
        log.error(userModel.getId());
    }
}
