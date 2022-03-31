/**
 * 
 */
package br.com.system.wero.controller;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.system.wero.entity.Permission;
import br.com.system.wero.entity.UserLogin;
import br.com.system.wero.repository.PermissionRepository;
import br.com.system.wero.repository.UserLoginRepository;

/**
 * @author Wellington
 *
 */

@Controller
@RequestMapping(value = "/users")
public class UsersController {
	
	@Autowired
	UserLoginRepository userLoginRepository;
	
	@Autowired
	PermissionRepository permissionRepository;
	
	@GetMapping(value = "/listarTodosUsuarios")
	@ResponseBody
	public ResponseEntity<List<UserLogin>> listarTodosUsuarios() throws SQLException, ParseException{			
		
		List<UserLogin> lista = userLoginRepository.findAll();	
		
		return new ResponseEntity<List<UserLogin>>(lista, HttpStatus.OK);
		
	}
	
	@PostMapping(value = "/saveUsers")		
	public ResponseEntity<UserLogin> salvarUsuarios(UserLogin userLogin){
		
		Date dateToday = new Date();
		
		String senha= userLogin.getSenha();
		
		String psw = new BCryptPasswordEncoder().encode(senha);
		
		userLogin.setSenha(psw);
		
		userLogin.setDataCadastro(dateToday);
		
		UserLogin user = userLoginRepository.save(userLogin);
		
		return new ResponseEntity<UserLogin>(user, HttpStatus.CREATED);
	}

	@GetMapping(value = "/listaPermissao")
	@ResponseBody
	public ResponseEntity<List<Permission>> listarPermissoes() throws SQLException, ParseException{
		
		List<Permission> lista = permissionRepository.findAll();
		
		return new ResponseEntity<List<Permission>>(lista, HttpStatus.OK);		
	}

}
