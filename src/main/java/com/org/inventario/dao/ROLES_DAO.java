package com.org.inventario.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.org.inventario.entity.ROLES_ENTITY;

public interface ROLES_DAO extends CrudRepository<ROLES_ENTITY, Integer> {
	
	@Query("SELECT R FROM ROLES_ENTITY R WHERE R.id=?1")
	public ROLES_ENTITY findByIdRole(Integer id);

}
