package cn.gzsxt.ssm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import cn.gzsxt.ssm.pojo.User;

public interface UserMapper {  
	//����һ��user
    @Select("insert into user(name,age,password) values(#{name},#{age},#{password})")
	int insert(User user);
	//���в�ѯ
	@Select("select * from user where id = #{id}")
	User selectByPrimaryKey(Integer id);
	//���в�ѯ
	@Select("select * from user")
	List<User> selectList();
	//�޸�
	@Update("update user set name=#{name},age=#{age},password=#{password} where id = #{id}") 
	int updateByPrimaryKey(User user);
	//ɾ��
	@Delete("delete from user where id = #{id}")
	int deleteByPrimaryKey(Integer id);
}
