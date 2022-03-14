package br.com.system.wero.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import br.com.system.wero.security.GpUserDetailsService;

@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	

	@Autowired
	private GpUserDetailsService userDetailsService;

	

	@Override
	protected void configure(HttpSecurity http) throws Exception {
				
		http.authorizeRequests()
				.antMatchers("/assets/**", "/css/**", "/js/**", "/images/**,").permitAll() // autoriza pastas css, js, images e seus respectivos arquivos				
				.antMatchers("/usercadastro").hasAnyRole("PG_CADASTRO")
				.antMatchers("/projetos").hasAnyRole("PG_PROJETOS")
				.antMatchers("/relatorio-equipe").hasAnyRole("PG_REL_EQUIPE")
				.antMatchers("/relatorio-custos").hasAnyRole("PG_REL_CUSTOS")
				.anyRequest().authenticated()
			.and()
				.formLogin().loginPage("/login").permitAll()
			.and()
				.logout().logoutSuccessUrl("/login?logout").permitAll()
			.and()
				.rememberMe().userDetailsService(userDetailsService)		
			.and()
				.authorizeRequests().antMatchers("/").permitAll()
			.and()
				.authorizeRequests().antMatchers("/h2/**").permitAll();			
				 										
	}

	
	@Override
	public void configure(WebSecurity web) throws Exception {
		web.ignoring().antMatchers("/bootstrap/**");
		web.ignoring().antMatchers("/h2/**");//Ignorar a página do banco H2
	}
	
	
	


}
