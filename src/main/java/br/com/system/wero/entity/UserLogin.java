package br.com.system.wero.entity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

/**
 * @author Wellington
 *
 */

@Entity
@Table
public class UserLogin implements UserDetails {
	
	private static final long serialVersionUID = 1L;
	
	
	@Id	
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(unique = true, nullable = false)	
	private Long id;
	
	private String nome;
	
	@Column(unique = true, nullable = false)
	private String login;
	
	private String senha;
	
	private boolean ativo;
	
	
	@Temporal(value = TemporalType.TIMESTAMP)
	private Date dataCadastro;
	
	
	public UserLogin() {
		
	}
	
	

	public UserLogin(Long id, String nome, String login, boolean ativo, Date dataCadastro) {
		super();
		this.id = id;
		this.nome = nome;
		this.login = login;
		this.ativo = ativo;
		this.dataCadastro = dataCadastro;
	}



	public UserLogin(String nome, String login, String senha, boolean ativo) {
		super();
		this.nome = nome;
		this.login = login;
		this.senha = senha;
		this.ativo = ativo;
	}




	public UserLogin(Long id, String nome, String login, String senha, boolean ativo, Date dataCadastro) {
		super();
		this.id = id;
		this.nome = nome;
		this.login = login;
		this.senha = senha;
		this.ativo = ativo;
		this.dataCadastro = dataCadastro;
	}




	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getLogin() {
		return login;
	}



	public void setLogin(String login) {
		this.login = login;
	}



	public String getSenha() {
		return senha;
	}



	public boolean isAtivo() {
		return ativo;
	}



	public String getNome() {
		return nome;
	}
	

	public void setNome(String nome) {
		this.nome = nome;
	}


	@Override
	public String getPassword() {
		return senha;
	}		

	public void setSenha(String senha) {
		this.senha = senha;
	}


	@Override
	public String getUsername() {
		return login;
	}	

	public void setUsername(String login) {
		this.login = login;
	}


	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}


	
	@Override
	public Collection<GrantedAuthority> getAuthorities() {
		Collection<GrantedAuthority> permissoes = new ArrayList<>();
		return permissoes;
	}
	
	
}