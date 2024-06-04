package com.org.inventario.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.org.inventario.entity.USUARIOS_ENTITY;

public interface USUARIOS_DAO extends CrudRepository<USUARIOS_ENTITY, Integer> {

	@Query("SELECT U FROM USUARIOS_ENTITY U WHERE U.username=?1")
	public USUARIOS_ENTITY findByUsername(String username);
	
	@Query("SELECT U FROM USUARIOS_ENTITY U WHERE U.username=?1")
	public Optional<USUARIOS_ENTITY> findByUsernameOptional(String username);
}
