package com.mg.entity;

import javax.persistence.*;
import java.util.Date;

/**
 *
 * @author MustafaGungor
 * @since 10.06.2017
 * @version 1.0.0
 *
 */

@MappedSuperclass
public abstract class BaseEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID",unique=true)
	private int id;

	@Column(updatable=false)
	private Date addDate;
	
	private Date updateDate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getAddDate() {
		return addDate;
	}

	public void setAddDate(Date addDate) {
		this.addDate = addDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	@PrePersist
	public void onCreate(){
		addDate = new Date();
	}

	@PreUpdate
	public void onUpdate(){
		updateDate = new Date();
	}
}
