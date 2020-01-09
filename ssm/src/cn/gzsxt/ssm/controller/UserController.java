package cn.gzsxt.ssm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.gzsxt.ssm.pojo.User;
import cn.gzsxt.ssm.service.UserService;

@Controller
@RequestMapping("/userController")
public class UserController {
    
	//ע��service��
	@Autowired
	private UserService userService;
	
	//��ѯ�б�
	@RequestMapping("/list")
	public String list(Model model) {
		List<User> users = userService.selectList();
		//��������
		model.addAttribute("users", users);
		return "UserList";	
	}
	
	//ɾ��user
	@RequestMapping("/deleteUser")
	public String deleteUser(Model model,Integer id) {
        userService.deleteByPrimaryKey(id);
        System.out.println("ɾ���û�");
        
        
		return "redirect:/userController/list.do";	
	}
		
}
