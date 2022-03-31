/**
 * 
 */
package br.com.system.wero.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.security.core.GrantedAuthority;

/**
 * @author Wellington
 *
 */

@Entity
@Table
public class Permission implements GrantedAuthority{
	
	private static final long serialVersionUID = 1L;

	@Id	
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(unique = true)	
	private Long id;	
	
	
	private String permissionName;
	
	@Override
	public String getAuthority() {		
		return this.permissionName;
	}

	
	public Permission() {
		
	}

	public Permission(Long id, String permissionName) {
		super();
		this.id = id;
		this.permissionName = permissionName;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPermissionName() {
		return permissionName;
	}

	public void setPermissionName(String permissionName) {
		this.permissionName = permissionName;
	}

	
	
	
	

}
