/**
 * 
 */
package br.com.system.wero.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.system.wero.entity.Permission;

/**
 * @author Wellington
 *
 */

@Repository
public interface PermissionRepository extends JpaRepository<Permission, Long> {

}
