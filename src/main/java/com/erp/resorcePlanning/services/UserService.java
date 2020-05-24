package com.erp.resorcePlanning.services;
import org.springframework.security.core.userdetails.UserDetailsService;

import com.erp.resorcePlanning.model.*;
import com.erp.resorcePlanning.web.dto.*;

public interface UserService extends UserDetailsService {

    User findByEmail(String email);

    User save(UserRegistrationDto registration);
}
