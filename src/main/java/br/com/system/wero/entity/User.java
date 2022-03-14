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
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * @author Wellington
 *
 */

@Entity
@Table
public class User implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "USER_ID_GENERATOR", sequenceName = "USER_C1_ID_SEQ", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "USER_ID_GENERATOR")
	@Column(name = "C1_id", unique = true, nullable = false, precision = 10)
	private Long id;
	
	@Column(name = "C2_name", nullable = false, length = 40)
	private String name;
	
	@Column(name = "C3_email", nullable = false, length = 40)
	private String email;
	
	@Column(name = "C4_password", nullable = false, length = 40)
	private String password;
	
	@Column(name = "C5_phone", nullable = true, length = 40)
	private String phone;
	
	@Column(name = "C6_active", nullable = false, length = 40)
	private Boolean active;
	
	@Column(name = "C7_cep", nullable = true, length = 40)
	private String cep;
	
	@Column(name = "C8_rua", nullable = true, length = 40)
	private String rua;
	
	@Column(name = "C9_numero", nullable = true, length = 40)
	private String numero;
	
	@Column(name = "C10_complemento", nullable = true, length = 40)
	private String complemento;
	
	@Column(name = "C11_bairro", nullable = true, length = 40)
	private String bairro;
	
	@Column(name = "C12_municipio", nullable = true, length = 40)
	private String municipio;
	
	@Column(name = "C13_uf", nullable = true, length = 40)
	private String uf;
	
	@Column(name = "C14_pais", nullable = true, length = 40)
	private String pais;
	
	@Column(name = "C15_photo", nullable = true, length = 40)
	private String photo;
	

	public User() {
		
	}


	public User(Long id, String name, String email, String password, String phone, Boolean active, String cep, String rua, String numero,
			String complemento, String bairro, String municipio, String uf, String pais, String photo) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.phone = phone;
		this.active = active;
		this.cep = cep;
		this.rua = rua;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.municipio = municipio;
		this.uf = uf;
		this.pais = pais;
		this.photo = photo;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}
	
	
	

}
