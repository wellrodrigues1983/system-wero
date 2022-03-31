insert into permission (id, permission_name) values 
	(1, 'ADMIN')
	, (2, 'ROLE_PG_SUPERVISAO')
	, (3, 'ROLE_PG_USUARIO')
;
	
insert into user_login (id, nome, data_cadastro, login, senha, ativo) values 
	(1, 'Carlos', CURRENT_TIMESTAMP(), 'carlos', '$2a$10$JvyF9q/k/eYwXTVjc4Ay0OT/dCwjW14eT88q3e587jaENTvtt30s2', true)
	, (2, 'Flávio', CURRENT_TIMESTAMP(), 'flavio', '$2a$10$JvyF9q/k/eYwXTVjc4Ay0OT/dCwjW14eT88q3e587jaENTvtt30s2', true)
;
	
insert into user_permission (id, user_id, permission_id) values 
	(1, 1, 1)
	, (4 , 2, 1)
	, (5 , 2, 2)
;










--insert into grupo (id, nome) values 
--	(1, 'DIRETOR') 
--	, (2, 'GERENTE')
--;
	
--insert into usuario_grupo (usuario_id, grupo_id) values 
--	(1, 1)
--	, (2, 2)
--;
	
--insert into grupo_permissao (grupo_id, permissao_id) values 
--	(1, 1)
--	, (1, 2)
--	, (1, 3)
--	, (2, 1)
--	, (2, 2)
--;