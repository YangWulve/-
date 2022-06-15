package Client;

import java.awt.*;
import javax.swing.*;

public class User {
	private String Username;
	private String Password;
	
	/**
	 * @return username
	 */
	public String getUsername() {
		return Username;
	}
	
	/**
	 * @param username 要设置的 username
	 */
	public void setUsername(String username) {
		Username = username;
	}
	
	/**
	 * @return password
	 */
	public String getPassword() {
		return Password;
	}
	
	/**
	 * @param password 要设置的 password
	 */
	public void setPassword(String password) {
		Password = password;
	}
	
}
