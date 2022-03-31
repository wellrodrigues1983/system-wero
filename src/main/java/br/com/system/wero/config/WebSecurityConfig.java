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
				.antMatchers("/relatorio-equipe").hasAnyRole("PG_REL_EQUIPE")
				.antMatchers("/relatorio-custos").hasAnyRole("PG_REL_CUSTOS")
				.antMatchers("/resources/**").permitAll()
				.anyRequest().authenticated()
			.and()
				.formLogin().loginPage("/login").permitAll()
			.and()
				.logout().logoutSuccessUrl("/login?logout").permitAll()
			.and()
				.rememberMe().userDetailsService(userDetailsService);
		
		
				 										
	}

	
	@Override
	public void configure(WebSecurity web) throws Exception {
		web.ignoring().antMatchers("/bootstrap/**");
		web.ignoring().antMatchers("/users/**");
		web.ignoring().antMatchers("/templates/**");
		web.ignoring().antMatchers("/assets/**");
		web.ignoring().antMatchers("/h2/**");//Ignorar a página do banco H2
		web.ignoring().antMatchers("/listarTodosUsuarios");//Ignorar a página do banco H2
		web.ignoring().antMatchers("/saveUsers");
	}
	
	
	


}
