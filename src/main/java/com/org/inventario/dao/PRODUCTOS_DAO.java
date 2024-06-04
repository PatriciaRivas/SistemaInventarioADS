package com.org.inventario.dao;

import org.springframework.data.repository.CrudRepository;

import com.org.inventario.entity.PRODUCTOS_ENTITY;

public interface PRODUCTOS_DAO extends CrudRepository<PRODUCTOS_ENTITY, Integer> {

}
