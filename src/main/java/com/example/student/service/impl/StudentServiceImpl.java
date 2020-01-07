package com.example.student.service.impl;

import com.example.student.mapper.StudentMapper;
import com.example.student.model.Student;
import com.example.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.Caching;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 * 学生业务逻辑层实现类
 * 
 * @author 知领互联
 * @version 1.0 2019-12-04
 */
@Service("studentService")
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentMapper studentMapper;
	@Cacheable(value = "student",key = "'studentMapper.getStudent'+#id")
	public Student searchById(int id) {
		return studentMapper.getStudentById(id);
	}

	@Override
	@Transactional
	@Caching(evict={@CacheEvict(value = "student", key="'studentMapper.getStudent'+#id")})
	public int removeStudent(int id) {
		int flag= studentMapper.deleteStudent(id);

        //验证事务的正确性
        String error=null;
        error.concat("hi");

        return flag;
	}


}
