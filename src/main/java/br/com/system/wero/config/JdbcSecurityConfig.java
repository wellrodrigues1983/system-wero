package br.com.system.wero.config;

import static br.com.system.wero.utils.JdbcUtils.PERMISSOES_POR_GRUPO;
import static br.com.system.wero.utils.JdbcUtils.PERMISSOES_POR_USUARIO;
import static br.com.system.wero.utils.JdbcUtils.USUARIO_POR_LOGIN;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.crypto.password.PasswordEncoder;

//@Configuration
public class JdbcSecurityConfig {
	
	/*
	 * @Autowired public void configureGlobal(AuthenticationManagerBuilder builder,
	 * PasswordEncoder passwordEncoder, DataSource dataSource) throws Exception {
	 * builder .jdbcAuthentication() .dataSource(dataSource)
	 * .passwordEncoder(passwordEncoder) .usersByUsernameQuery(USUARIO_POR_LOGIN)
	 * .authoritiesByUsernameQuery(PERMISSOES_POR_USUARIO)
	 * .groupAuthoritiesByUsername(PERMISSOES_POR_GRUPO); }
	 */
}
