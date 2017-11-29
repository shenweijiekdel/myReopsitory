package cn.tedu.examsystem.service.impl;

import cn.tedu.examsystem.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.tedu.examsystem.mapper.AdminMapper;
import cn.tedu.examsystem.pojo.Admin;
import cn.tedu.examsystem.tool.Md5Utils;
@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	private AdminMapper adminMapper;

	public void regist(Admin admin) {
		admin.setPassword(Md5Utils.getMd5(admin.getPassword(), admin.getUsername()));
		adminMapper.regist(admin);
	}

	public Admin findOneByUsername(String username) {
		 
		return adminMapper.findOneByUsername(username);
		
	}

}
