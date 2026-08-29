package lk.jiat.bcd.security.servlet;

import jakarta.annotation.security.DeclareRoles;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.HttpConstraint;
import jakarta.servlet.annotation.HttpMethodConstraint;
import jakarta.servlet.annotation.ServletSecurity;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/admin/profile")
//@DeclareRoles({"ADMIN","USER"}) //Define Roles equalent with web xml security-role configurations
@ServletSecurity(value = @HttpConstraint(rolesAllowed = {"ADMIN", "USER"},
                                transportGuarantee = ServletSecurity.TransportGuarantee.CONFIDENTIAL),
        httpMethodConstraints = {
        @HttpMethodConstraint(value = "GET", rolesAllowed = {"ADMIN","USER"}),
                @HttpMethodConstraint(value = "POST" , rolesAllowed = "ADMIN"),
                @HttpMethodConstraint(value = "DELETE" , emptyRoleSemantic = ServletSecurity.EmptyRoleSemantic.DENY)
        }

)
public class AdminServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().write("Admin Profile Servlet");
    }
}
