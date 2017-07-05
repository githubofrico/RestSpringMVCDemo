package cn.edu.tju.rico.model.entity;

import java.io.Serializable;

import org.hibernate.validator.constraints.NotEmpty;

/**        
 * Title: 用户实体类    
 * Description: 用户实体，用于持久化
 * @author rico       
 * @created 2017年4月24日 上午9:27:16    
 */      
public class User implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private int id;
	@NotEmpty    	// Hibernate Validator 注解, User对象的uname属性必填
	private String uname;    
	private String passwd;
	private String gentle;
	private String email;
	private String city;

	public User() {
		super();
	}
	  
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public String getGentle() {
		return gentle;
	}

	public void setGentle(String gentle) {
		this.gentle = gentle;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", uname=" + uname + ", gentle=" + gentle
				+ ", email=" + email + ", city=" + city + "]";
	}
}
