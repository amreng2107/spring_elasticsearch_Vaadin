package de.springnodnet.repository;

import de.springnodnet.model.applicationUser.AppUser;
import org.springframework.stereotype.Repository;


@Repository
public interface AppUserRepository extends BaseRepository<AppUser>{

    //Query by username not case sensitive
    AppUser findByUsernameIgnoreCase(String username);
    
}
