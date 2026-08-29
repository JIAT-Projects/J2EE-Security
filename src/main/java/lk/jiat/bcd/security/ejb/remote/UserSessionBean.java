package lk.jiat.bcd.security.ejb.remote;

import jakarta.annotation.security.DeclareRoles;
import jakarta.annotation.security.DenyAll;
import jakarta.annotation.security.PermitAll;
import jakarta.annotation.security.RolesAllowed;
import jakarta.ejb.EJB;
import jakarta.ejb.Stateless;

import java.util.logging.Logger;

@Stateless
@DeclareRoles("MANAGER")
//@RolesAllowed("USER")
@PermitAll
public class UserSessionBean {

    private static final Logger LOGGER = Logger.getLogger(UserSessionBean.class.getName());

    @EJB
    private AdminSessionBean adminSessionBean;

    public void method1(){
        LOGGER.info("UserSessionBean : method1");
       adminSessionBean.doAction();

    }

    @RolesAllowed({"ADMIN","MANAGER"})
    public void method2(){
        LOGGER.info("UserSessionBean : method2");

    }

    @DenyAll
    public void method3(){
        LOGGER.info("UserSessionBean : method3");

    }
}
