package com.example.repository;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
//
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.domain.Form;

@Mapper
public interface OrgMapper {

	@Select("SELECT * FROM Calcu")
	List<Form> findAll();


	@Select("SELECT * FROM Calcu WHERE id = #{id}")
	Form findONE(String id);

	@Insert("INSERT INTO Calcu (id, datename, formula) values (#{id}, #{dateName}, #{formula})")
	 void save(Form domainform) ;


	@Update("UPDATE Calcu SET id = #{id}, datename = #{dateName}, formula = #{formula} WHERE id = #{id}")
    void update(Form domainform);

	@Delete("DELETE FROM Calcu WHERE id = #{id}")
	void delete(String id);

}

