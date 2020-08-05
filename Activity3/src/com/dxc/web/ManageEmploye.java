package com.dxc.web;

import java.io.IOException;

import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dxc.DAO.UserDAO;
import com.dxc.models.User;
@WebServlet("/")
public class ManageEmploye extends HttpServlet {
	private static final long serialVersionUID = 1L;
	UserDAO userDao;

    public ManageEmploye() {
        super();
        userDao= new UserDAO();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getServletPath();
		switch(action) {
		case "/insertUserForm":
			insertUserForm(request, response);
			break;
		case "/insertUser":
			try {
				insertUser(request, response);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case "/deleteUser":
			deleteUser(request,response);
			break;
		case "/updateUserForm":
			updateUserForm(request, response);
			break;
		case "/updateUser":
			updateUser(request, response);
			break;
		default :
			listUsers(request, response);
			break;
		}
	}

	private void listUsers(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<User> users = userDao.selectAllUsers();
		System.out.println(users);
		request.setAttribute("users", users);
		RequestDispatcher dispatcher = request.getRequestDispatcher("user-list.jsp");
		dispatcher.forward(request, response);
		
	}

	private void updateUser(HttpServletRequest request, HttpServletResponse response) throws IOException {
		User user = new User();
		user.setId(Integer.parseInt(request.getParameter("id")));
		user.setEmail(request.getParameter("email"));
		user.setName(request.getParameter("name"));
		user.setJob(request.getParameter("job"));
		user.setProject(request.getParameter("project"));
		user.setCompany_name(request.getParameter("company_name"));
		userDao.updateUser(user);
		response.sendRedirect("ManageEmploye");
		
	}

	private void updateUserForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		User user= userDao.selectUser(id);
		request.setAttribute("userdetail", user);
		RequestDispatcher dispatcher = request.getRequestDispatcher("update-form.jsp");
		dispatcher.forward(request, response);
		
	}

	private void deleteUser(HttpServletRequest request, HttpServletResponse response) throws IOException {
		int id =Integer.parseInt(request.getParameter("id")) ;
		userDao.deleteUser(id);
		response.sendRedirect("ManageEmploye");
		
	}

	private void insertUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		User user = new User();
		user.setName(request.getParameter("name"));
		user.setEmail(request.getParameter("email"));
		user.setJob(request.getParameter("job"));
		user.setProject(request.getParameter("project"));
		user.setCompany_name(request.getParameter("company_name"));
		userDao.insertUser(user);
		response.sendRedirect("ManageEmploye");
	}
	private void insertUserForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("user-form.jsp");
		dispatcher.forward(request, response);
		
	}

}
