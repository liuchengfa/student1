package com.example.student.model;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 学生实体类
 * @author 知领互联
 * @version 1.0 2019-12-23
 */
public class Student implements Serializable {
	private Integer id;
	private String name;
	private Integer sex;
	private BigDecimal score;
	private String photo;
	
	public Student(Integer id, String name, Integer sex, BigDecimal score, String photo) {
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.score = score;
		this.photo = photo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public BigDecimal getScore() {
		return score;
	}

	public void setScore(BigDecimal score) {
		this.score = score;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}
	
}
