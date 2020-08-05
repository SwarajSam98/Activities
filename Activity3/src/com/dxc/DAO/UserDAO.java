package com.dxc.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.dxc.models.User;

public class UserDAO {
	public Connection getConnection() {
		Connection connection = null;
		try {
            Class.forName("com.mysql.cj.jdbc.Driver");
             connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/sam", "root","Sss1998$1707");
  
        } catch (Exception ex) {
            System.out.println("Exception Raised...");
            System.out.println(ex.getMessage());
        }
		return connection;
	}
	public void insertUser(User user) {
		try(Connection connection = getConnection()) {
           
           PreparedStatement statement = connection.prepareStatement("INSERT INTO tasks(email, name, job, project, company_name) values(?, ?, ?, ?, ?) ");
           statement.setString(2, user.getName());
           statement.setString(1, user.getEmail());
           statement.setString(3, user.getJob());
           statement.setString(4, user.getProject());
           statement.setString(5, user.getCompany_name());
           
           int result = statement.executeUpdate();
           System.out.println(result +"User inserted successfully");
            connection.close();
        } catch (Exception ex) {
            System.out.println("Exception Raised...");
            System.out.println(ex.getMessage());
        }
		
	}
	public List<User> selectAllUsers() {
		 List<User> usersList = new ArrayList<User>();
		try(Connection connection = getConnection()) {
           
           PreparedStatement statement = connection.prepareStatement("SELECT * FROM TASKS");
           ResultSet rs = statement.executeQuery();
           while(rs.next()) {
           	User user = new User();
           	user.setId(rs.getInt("id"));
           	user.setName(rs.getString("name"));
           	user.setEmail(rs.getString("email"));
               user.setJob(rs.getString("job"));
               user.setProject(rs.getString("project"));
               user.setCompany_name(rs.getString("company_name"));
               usersList.add(user);
               
           }
           connection.close();
       } catch (Exception ex) {
           System.out.println("Exception Raised...");
           System.out.println(ex.getMessage());
       }
		return usersList;
	}
	public void updateUser(User user) {
		try(Connection connection = getConnection()) {
           
           PreparedStatement statement = connection.prepareStatement("UPDATE tasks set name =?, email= ?, job= ?, project=?, company_name=? where id=?;");
           statement.setString(1, user.getName());
           statement.setString(2, user.getEmail());
           statement.setString(3, user.getJob());
           statement.setString(4, user.getProject());
           statement.setString(5, user.getCompany_name());
           statement.setInt(6, user.getId());
           int result = statement.executeUpdate();
           System.out.println(result +"User updated successfully....");
            connection.close();
        } catch (Exception ex) {
            System.out.println("Exception Raised...");
            System.out.println(ex.getMessage());
        }
	}
	
	public User selectUser(int id) {
		User user = new User();
		try(Connection connection = getConnection()) {
            
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM tasks WHERE id =?;");
            statement.setInt(1, id);
            ResultSet rs = statement.executeQuery();
            if(rs.next()) {
            	
            	user.setId(rs.getInt("id"));
            	user.setEmail(rs.getString("email"));
            	user.setName(rs.getString("name"));
            	user.setJob(rs.getString("job"));
            	user.setProject(rs.getString("project"));
               user.setCompany_name(rs.getString("company_name"));
            }
         
            connection.close();
        } catch (Exception ex) {
            System.out.println("Exception Raised...");
            System.out.println(ex.getMessage());
        }
		return user;
	}
	
	public void deleteUser(int id) {
		try(Connection connection = getConnection()) {
         
           PreparedStatement statement = connection.prepareStatement("DELETE FROM tasks where id =?;");
          statement.setInt(1, id);
          int result = statement.executeUpdate();
           System.out.println(result +" User deleted successfully");
            connection.close();
        } catch (Exception ex) {
            System.out.println("Exception Raised...");
            System.out.println(ex.getMessage());
        }
	}

}
