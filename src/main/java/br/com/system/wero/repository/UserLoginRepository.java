
package br.com.system.wero.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.system.wero.entity.UserLogin;

/**
 * @author Wellington
 *
 */

@Repository
public interface UserLoginRepository extends JpaRepository<UserLogin, Long> {

	/*Query(value = "select * from user_login", nativeQuery = true )
	List<UserLogin> listaUsuarios();
*/
}
