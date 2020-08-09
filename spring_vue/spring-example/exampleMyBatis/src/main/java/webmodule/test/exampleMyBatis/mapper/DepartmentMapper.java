package webmodule.test.exampleMyBatis.mapper;

import org.apache.ibatis.annotations.Mapper;

import webmodule.test.exampleMyBatis.model.Department;

@Mapper
public interface DepartmentMapper {
	
	Department getDepartmentById(int deptno);
}
