/**
 * 
 */
package br.com.system.wero.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author Wellington
 *
 */

@Entity
@Table
public class UserPermission implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(unique = true, precision = 10)
	private int id;

	@JoinColumn(name = "user_id", referencedColumnName = "id" )
	@ManyToOne
	private UserLogin userLogin;

	@ManyToOne
	@JoinColumn(name = "permission_id", referencedColumnName = "id")
	private Permission permission;

	public UserPermission() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public UserLogin getUserLogin() {
		return userLogin;
	}

	public void setUserLogin(UserLogin userLogin) {
		this.userLogin = userLogin;
	}

	public Permission getPermission() {
		return permission;
	}

	public void setPermission(Permission permission) {
		this.permission = permission;
	}

	

	
	
	

	
}
