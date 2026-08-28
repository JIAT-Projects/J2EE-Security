package lk.jiat.bcd.security.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.security.Principal;
import java.util.Enumeration;
import java.util.logging.Logger;

@WebServlet("/logout")
public class Logout extends HttpServlet {


    private static final Logger LOGGER =Logger.getLogger(Logout.class.getName());
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        Enumeration<String> names = req.getSession().getAttributeNames();
//
//        while (names.hasMoreElements()){
//            LOGGER.info("Session Attributes:"+names.nextElement());
//
//
//        }

        Principal principal = req.getUserPrincipal();
        LOGGER.info(principal.getName());

        LOGGER.info(req.getRemoteUser());

        LOGGER.info(String.valueOf(req.isUserInRole("USER")));


        req.logout(); //clear container authentication
        req.getSession().invalidate(); //destory sesson with all attributes

        resp.sendRedirect(req.getContextPath() + "/user");
    }
}
