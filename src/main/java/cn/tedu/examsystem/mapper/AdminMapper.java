package cn.tedu.examsystem.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import cn.tedu.examsystem.pojo.Admin;

public interface AdminMapper {

	/**
	 * 将admin中所有属性保存进数据库
	 * @param admin
	 */
	@Insert("insert into admin (u_id,username,password) values(#{uId},#{username},#{password})")
	public void regist(Admin admin);

	/**
	 * 通过uId获取 该uId对应的管理员的所有信息并将其封装进Admin中返回
	 * @param uId 管理员id
	 * @return 返回从数据库中获取的admin对象
	 */
	@Select("select * from admin where u_id=#{uId}")
	public Admin findOneByUid(String uId);

}
