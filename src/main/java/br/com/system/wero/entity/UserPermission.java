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
import javax.persistence.Table;

/**
 * @author Wellington
 *
 */

@Entity
@Table
public class UserPermission implements Serializable{	
	
	private static final long serialVersionUID = 1L;

	@Id	
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "C1_id", unique = true, nullable = false, precision = 10)
	private Long id;
	
	@Column(name = "C2_user", nullable = false, length = 40)
	private User user;
	
	@Column(name = "C3_permission", nullable = false, length = 40)
	private Permission permission;

	public UserPermission() {
		
	}

	public UserPermission(Long id, User user, Permission permission) {
		super();
		this.id = id;
		this.user = user;
		this.permission = permission;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Permission getPermission() {
		return permission;
	}

	public void setPermission(Permission permission) {
		this.permission = permission;
	}
	
	
}
