package lk.jiat.bcd.security.ejb.remote;


import jakarta.annotation.security.DenyAll;
import jakarta.annotation.security.RolesAllowed;
import jakarta.ejb.Stateless;

import java.util.logging.Logger;

@Stateless
//@RolesAllowed("ADMIN")
public class AdminSessionBean {

    private static final Logger LOGGER = Logger.getLogger(UserSessionBean.class.getName());

    @DenyAll
    public void doAction(){
        LOGGER.info("AdminSessionBean : doAction");

    }
}
