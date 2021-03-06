package br.com.system.wero.utils;

public class JdbcUtils {
	
	public static final String USUARIO_POR_LOGIN = "SELECT login, senha, ativo, nome FROM user_login"
			+ " WHERE login = ?";
	
	public static final String PERMISSOES_POR_USUARIO = "SELECT user_id, permission_id as nome_permissao FROM user_permission up"
			+ " JOIN user_login u ON u.id = up.user_id"
			+ " JOIN permission p ON p.id = up.permission_id"
			+ " WHERE u.login = ?";
	
	public static final String PERMISSOES_POR_GRUPO = "SELECT g.id, g.nome, p.nome  as nome_permissao FROM grupo_permissao gp"
			+ " JOIN grupo g ON g.id = gp.grupo_id"
			+ " JOIN permissao p ON p.id = gp.permissao_id"
			+ " JOIN usuario_grupo ug ON ug.grupo_id = g.id"
			+ " JOIN usuario u ON u.id = ug.usuario_id"
			+ " WHERE u.login = ?";

}
