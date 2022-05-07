package com.allrecipes.spring5webapp.Entity;

import javax.persistence.*;
import java.io.Serializable;

@MappedSuperclass
public class BaseEntity implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(
			name = "id",
			updatable = false
	)
	private Integer id;

	public Integer getId() { return id; }

	public void setId(Integer id) { this.id = id; }

}
