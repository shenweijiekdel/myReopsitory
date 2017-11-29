package cn.tedu.examsystem.service;

import cn.tedu.examsystem.pojo.Admin;

public interface AdminService {

	/**
	 * 注册管理员,将admin保存到数据库中
	 * @param admin
	 */
	void regist(Admin admin);

	/**
	 * 通过管理员id得到该id的管理员对象
	 * @param username 管理员用户名
	 * @return  返回对应的管理员Admin对象
	 */
	Admin findOneByUsername(String username);

}
