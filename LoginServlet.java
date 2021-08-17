package com.login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private LoginDao loginDao;
 
   @Override
public void init() throws ServletException {
	   loginDao=new LoginDao();
	super.init();
}
   @Override
protected void doPost(HttpServletRequest request, HttpServletResponse responce) throws ServletException, IOException {
	   
       String username = request.getParameter("username");
       String password = request.getParameter("password");
       LoginBean loginBean = new LoginBean();
       loginBean.setUsername(username);
       loginBean.setPassword(password);

       try {
           if (loginDao.validate(loginBean)) {
               //HttpSession session = request.getSession();
                //session.setAttribute("username",username);
               responce.sendRedirect("loginsuccess.jsp");
           } else {
               HttpSession session = request.getSession();
             // session.setAttribute("user", username);
             //  responce.sendRedirect("login.jsp");
           }
       } catch (ClassNotFoundException e) {
           e.printStackTrace();
       }

	
}
   
   }


