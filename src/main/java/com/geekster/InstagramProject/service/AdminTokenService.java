package com.geekster.InstagramProject.service;

import com.geekster.InstagramProject.model.Admin;
import com.geekster.InstagramProject.model.AdminAuthenticationToken;
import com.geekster.InstagramProject.repo.IAdminTokenRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminTokenService {

    @Autowired
    IAdminTokenRepo tokenRepo;

    @Autowired
    UserService userService;


    public void saveToken(AdminAuthenticationToken token) {
        tokenRepo.save(token);
    }

    public AdminAuthenticationToken getToken(Admin admin){
       return tokenRepo.findByAdmin(admin);
    }

    public boolean authenticate(String email, String token) {

        if(token==null && email==null){
            return false;
        }

        AdminAuthenticationToken authToken = tokenRepo.findFirstByToken(token);

        if(authToken==null){
            return false;
        }

        String expectedEmail = authToken.getAdmin().getEmail();

        return expectedEmail.equals(email);
    }


    public Admin findUserByToken(String token)
    {
        return tokenRepo.findFirstByToken(token).getAdmin();
    }

    public void deleteToken(String token) {
        AdminAuthenticationToken token1 = tokenRepo.findFirstByToken(token);

        tokenRepo.deleteById(token1.getTokenId());
    }

    public void deleteUser(Long userId) {
        userService.deleteUser(userId);
    }
}
