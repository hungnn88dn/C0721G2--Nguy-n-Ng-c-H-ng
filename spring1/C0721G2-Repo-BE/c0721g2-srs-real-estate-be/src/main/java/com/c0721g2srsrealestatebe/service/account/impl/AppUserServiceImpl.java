package com.c0721g2srsrealestatebe.service.account.impl;

import com.c0721g2srsrealestatebe.Exception.AppUserException;
import com.c0721g2srsrealestatebe.dto.AppUserDTO;
import com.c0721g2srsrealestatebe.model.account.AppUser;
import com.c0721g2srsrealestatebe.model.account.Role;
import com.c0721g2srsrealestatebe.model.customer.Customer;
import com.c0721g2srsrealestatebe.model.image.Image;
import com.c0721g2srsrealestatebe.payload.request.CustomerSocial;
import com.c0721g2srsrealestatebe.repository.account.IAppUserRepository;
import com.c0721g2srsrealestatebe.service.account.IAppUserService;
import com.c0721g2srsrealestatebe.service.customer.impl.CustomerServiceImpl;
import net.bytebuddy.utility.RandomString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.mail.javamail.JavaMailSender;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.UnsupportedEncodingException;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

@Service
@Transactional
public class AppUserServiceImpl implements IAppUserService {

    @Autowired
    private IAppUserRepository appUserRepository;

    @Autowired
    private JavaMailSender javaMailSender;

    @Autowired
    private RoleServiceImpl roleService;

    @Autowired
    private CustomerServiceImpl customerService;


    @Override
    public AppUser getAppUserByEmail(String email) {
        return appUserRepository.getAppUserByEmailCustomer(email);
    }

    @Override
    public boolean existsUserByEmail(String email) {
        return appUserRepository.existsUserByEmail(email) != null;
    }

    @Override
    public void addVerificationCode(String email) throws MessagingException, UnsupportedEncodingException {
        String username = appUserRepository.existsUserByEmail(email);
        String code = RandomString.make(64);
        appUserRepository.addVerificationCode(code, username);
        this.sendVerificationEmailForResetPassWord(username, code, email);
        CompletableFuture.runAsync(() -> {
            try {
                TimeUnit.MINUTES.sleep(10);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
            appUserRepository.deleteVerificationCode(username);
        });
    }

    @Override
    public void saveNewPassword(String passwordEncode, String code) {
        appUserRepository.saveNewPassword(passwordEncode, code);
        appUserRepository.deleteVerificationCode(code);
    }

    @Override
    public Boolean findUserByVerificationCode(String code) {
        return appUserRepository.findUserByVerificationCode(code) != null;
    }

    @Override
    public AppUser createCustomerSocial(CustomerSocial customerSocial) {
        Customer customer = new Customer();
        customer.setName(customerSocial.getName());
        customer.setEmail(customerSocial.getEmail());

        Image image = new Image();
        image.setUrl(customerSocial.getUrlImg());
        customer.setImage(image);

        AppUser appUser = new AppUser();
        appUser.setUsername(customerSocial.getEmail());
        appUser.setPassword(customerSocial.getPassword());
        appUser.setEnabled(true);
        Set<Role> roles = new HashSet<>();
        Role role = roleService.findRoleByName("ROLE_CUSTOMER");
        roles.add(role);

        appUser.setRoles(roles);

        customer.setAppUser(appUser);
        this.customerService.saveCustomerSocial(customer);
        return appUser;
    }


    public void sendVerificationEmailForResetPassWord(String userName, String randomCode, String email) throws MessagingException, UnsupportedEncodingException {
        String subject = "Email x??c th???c!";
        String mailContent = "";
        String confirmUrl = "http://localhost:4200/security/verify-reset-password?code=" + randomCode;


        MimeMessage message = javaMailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message, "UTF-8");
        helper.setFrom("plthienbkdn@gmail.com", "B???t ?????ng s???n H??ng Th???nh Group");
        helper.setTo(email);
        helper.setSubject(subject);
        mailContent = "<p sytle='color:red;'>Xin ch??o " + userName + " ,<p>" + "<p> Nh???n v??o link sau ????? thay ?????i m???t kh???u c???a b???n:</p>" +
                "<h3><a href='" + confirmUrl + "'>Link X??c th???c( nh???n v??o ????y)!</a></h3>" +
                "<p>-----------------------------------------------------------</p>" +
                "<p>B???t ?????ng s???n H??ng Th???nh Group</p>" +
                "<p>?????a ch???: T??a nh?? H??ng Th???nh Group, s??? 99 ???????ng L?? Du???n</p>" +
                "<p>Email: plthienbkdn@gmail.com</p>" +
                "<p>S??? ??i???n tho???i: 0905686868</p>";
        helper.setText(mailContent, true);
        javaMailSender.send(message);

    }

    // T??ng ki???m tra username
    public boolean existsByUserName(String username) {
        return appUserRepository.existsByUsername(username);
    }


    @Override
    public String findPasswordByUsername(String username) {
        return appUserRepository.findPasswordByUsername(username);
    }


    @Override
    public void updatePassword(AppUserDTO appUserDTO) {
        appUserRepository.saveNewPassword(appUserDTO.getPassword(), appUserDTO.getUsername());
    }

    @Override
    public AppUser findAppUserByUserName(String id) {
        return appUserRepository.findAppUserByUsername(id).orElseThrow(() -> new AppUserException(
                "kh??ng th??? t??m th???y id " + id + ""));
    }
}