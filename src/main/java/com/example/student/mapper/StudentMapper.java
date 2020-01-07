package com.example.student.mapper;

import com.example.student.model.Student;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import com.example.student.model.Student;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface StudentMapper {
	/**
	 * 通过id查找学生信息
	 * @param id 学号
	 * @return 返回学生实体对象
	 */
	Student getStudentById(@Param("id") int id);

	/**
	 * 删除学生信息
	 * @param id 学号
	 * @return
	 */
	int deleteStudent(@Param("id")Integer id);

}
