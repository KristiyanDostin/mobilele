package javaWebSoftUni.mobilele.service;

import javaWebSoftUni.mobilele.model.dto.UserLoginDTO;
import javaWebSoftUni.mobilele.model.dto.UserRegistrationDTO;

public interface UserService {

    void registerUser(UserRegistrationDTO userRegistrationDTO);

    boolean loginUser(UserLoginDTO userLoginDTO);

    void logoutUser();
}
