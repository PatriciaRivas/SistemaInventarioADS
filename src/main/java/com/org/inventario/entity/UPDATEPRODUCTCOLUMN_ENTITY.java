package com.org.inventario.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedStoredProcedureQuery;
import jakarta.persistence.ParameterMode;
import jakarta.persistence.StoredProcedureParameter;
import jakarta.persistence.Table;

@Entity
@Table(name="UpdateProductColumn")
@NamedStoredProcedureQuery(name="UpdateProductColumn", procedureName = "UpdateProductColumn", parameters = {
		@StoredProcedureParameter(name="id", type = String.class, mode = ParameterMode.IN),
		@StoredProcedureParameter(name="columnName", type = String.class, mode = ParameterMode.IN),
		@StoredProcedureParameter(name="valor", type = String.class, mode = ParameterMode.IN)
}, resultClasses = UPDATEPRODUCTCOLUMN_ENTITY.class)
public class UPDATEPRODUCTCOLUMN_ENTITY {

	@Id
	@Column(name="EXITO")
	private Integer exito;

	public Integer getExito() {
		return exito;
	}

	public void setExito(Integer exito) {
		this.exito = exito;
	}
	
}
