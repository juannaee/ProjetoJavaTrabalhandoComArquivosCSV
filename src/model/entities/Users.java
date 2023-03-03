package model.entities;

public class Users implements Comparable<Users> {

	private String login;
	private String password;
	private Double salary;

	public Users(String login, String password, Double salary) {
		super();
		this.login = login;
		this.password = password;
		this.salary = salary;

	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public int compareTo(Users o) {
		return getSalary().compareTo(o.getSalary());
	}
	
	public String toString() {
		StringBuilder stb = new StringBuilder();

		stb.append("-----------------------------------------------------" + "\n");
		stb.append("Login: " + login + "\n");
		stb.append("password: " + password + "\n");
		stb.append("Salary: " + String.format("%.2f", salary) + "\n");

		stb.append("-----------------------------------------------------" + "\n");

		return stb.toString();
	}

}
