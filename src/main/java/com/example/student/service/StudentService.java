package com.example.student.service;

import com.example.student.model.Student;

public interface StudentService {
	/**
	 * 查询学生信息
	 * @param id 学号
	 * @return 返回实体对象学生
	 */
	Student searchById(int id);

	/**
	 * 删除学生信息
	 * @param id 学号
	 * @return
	 */
	int removeStudent(int id);
}
