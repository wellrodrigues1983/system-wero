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
public class Permission implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id	
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "C1_id", unique = true, nullable = false, precision = 10)
	private Long id;	
	
	@Column(name = "C2_PermissionName", nullable = false, length = 40)
	private String permissionName;

	
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
