package de.springnodnet.business.login;

import com.vaadin.spring.annotation.SpringComponent;

import de.springnodnet.repository.AppUserRepository;
import de.springnodnet.model.applicationUser.AppUser;
import org.springframework.beans.factory.annotation.Autowired;

@SpringComponent
public class Login {

    @Autowired
    private AppUserRepository appUserRepo;

    public boolean loginValidation(String userName, String password) {
        AppUser user;
        if ((userName == null) || password == null) {
            System.out.println("UserName or Password is not correct");
        } else {
            if (exists(userName) && isValidPassword(userName, password)) {
                return true;

            }
        }
        return false;
    }

    private boolean exists(String userName) {
        return appUserRepo.exists(appUserRepo.findByUsernameIgnoreCase(userName).getId());
    }

    private boolean isValidPassword(String username, String password) {
        String pass = this.appUserRepo.findByUsernameIgnoreCase(username).getUserPassword();
        return pass.equals(password);
    }

}
