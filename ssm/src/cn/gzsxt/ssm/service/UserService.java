package cn.gzsxt.ssm.service;

import java.util.List;

import cn.gzsxt.ssm.pojo.User;

public interface UserService {
	//����һ��user
		int insert(User user);
		//���в�ѯ
		User selectByPrimaryKey(Integer id);
		//���в�ѯ
		List<User> selectList();
		//�޸�
		int updateByPrimaryKey(User user);
		//ɾ��
		int deleteByPrimaryKey(Integer id);
}
