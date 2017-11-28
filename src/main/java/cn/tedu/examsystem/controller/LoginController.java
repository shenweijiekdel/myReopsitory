package cn.tedu.examsystem.controller;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.tedu.examsystem.pojo.Admin;
import cn.tedu.examsystem.pojo.Student;
import cn.tedu.examsystem.service.AdminService;
import cn.tedu.examsystem.service.StudentService;
import cn.tedu.examsystem.shiro.CustomizedToken;
import cn.tedu.examsystem.shiro.LoginType;

@Controller
public class LoginController {

	@Autowired
	private StudentService studentService;
	@Autowired
	private AdminService adminService;

	/*
		學生登陸
	 */
	@RequestMapping("/tologin.html")
	public String toLogin(){
		return "/login/login";
	}
	@RequestMapping("/login.html")
	public String Login(String sId,String sPassword,Model model,HttpSession session){

		Subject currentUser = SecurityUtils.getSubject();
		if (!currentUser.isAuthenticated()) {
			CustomizedToken customizedToken = new CustomizedToken(sId, sPassword, LoginType.Student.toString());
			customizedToken.setRememberMe(false);
			try {
				//登录，进入studentRealm中
				currentUser.login(customizedToken);
				//得到登录成功的Student
				Student student = (Student)currentUser.getPrincipal();

				session.setAttribute("_CURRENT_STUDENT", student);

				return "redirect:/home.html";
			} catch (AuthenticationException e) {
				e.printStackTrace();
				//把错误信息传回页面
				model.addAttribute("errorInfo","学号或密码不正确！");
				return "frontHome";
			}
		}
		return "/login/login";
	}
	/*
		學生註冊
	 */
	@RequestMapping("/toregist.html")
	public String toRegist(){
		return "/login/regist";
	}

	@RequestMapping("/regist.html")
	public String Regist(Student student,HttpSession session){
		//将学生保存到数据库中
		studentService.regist(student);

		session.setAttribute("_CURRENT_STUDENT", student);
		return "redirect:/home.html";
	}
	//ajax检验学号是否存在
	@RequestMapping("checkSId.html")
	public void checkSid(String sId,HttpServletRequest request,HttpServletResponse response){

		response.setContentType("text/html;charset=utf-8");
		try {
			request.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e1) {
			e1.printStackTrace();
		}
		//通过ajax传来的sId到书库库中查询是否有该学号的学生,如果存在则该学号存在，不能再注册了
		Student student = studentService.findOneBySid(sId);
		if(student!=null){//学号已存在
			try {
				response.getWriter().write("学号已存在");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	} 

	/*
		管理员登陆
	 */
	@RequestMapping("/toAdminLogin.html")
	public String toAdminLogin(){
		return "/login/adminLogin";
	}
	@RequestMapping("/adminLogin.html")
	public String adminLogin(String uId,String password,Model model,HttpSession session){
		Subject currentUser = SecurityUtils.getSubject();
		if (!currentUser.isAuthenticated()) {
			CustomizedToken customizedToken = new CustomizedToken(uId, password, LoginType.ADMIN.toString());
			customizedToken.setRememberMe(false);
			try {
				currentUser.login(customizedToken);
				//得到登录成功的Admin
				Admin admin = (Admin)currentUser.getPrincipal();
				//在首页设置 欢迎** 
				session.setAttribute("_CURRENT_ADMIN", admin);

				return "redirect:/home.html";
			} catch (AuthenticationException e) {
				e.printStackTrace();

				model.addAttribute("errorInfo","用户名或密码不正确！");
				return "/login/login";
			}
		}
		return "/login/login";
	}


	/*
	添加管理員/管理員註冊
	 */
	@RequestMapping("/toAddAdmin.html")
	public String toAddAdmin(){
		//跳转到管理员注册页面
		return "/login/addAdmin";
	}
	@RequestMapping("/addAdmin.html")
	public String AddAdmin(Admin admin,HttpSession session,HttpServletResponse response){
		//将页面的管理员信息保存到数据库中
		adminService.regist(admin);
		//设置页面显示 欢迎 ** 用户
		session.setAttribute("_CURRENT_USER", admin.getUsername());
		return "redirect:/home.html";
	}
	//ajax检验管理员id是否存在
	@RequestMapping("/checkUId.html")
	public void checkUid(String uId,HttpServletRequest request,HttpServletResponse response){
		//设置编码
		response.setContentType("text/html;charset=utf-8");
		try {
			request.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e1) {
			e1.printStackTrace();
		}
		//获取传来的管理员id在数据库中的全部信息,如果不为空则该id已存在
		Admin admin = adminService.findOneByUid(uId);
		if(admin!=null){//管理员id已存在
			try {
				response.getWriter().write("管理员id已存在");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	} 

	/*
	 * 學生/管理員 退出
	 */	
	@RequestMapping("/logout.html")
	public String logout(HttpSession session){
		session.removeAttribute("_CURRENT_USER");

		// 通知shiro框架 退出登录
		Subject subject = SecurityUtils.getSubject();

		//判断是否是登录状态 如果是则退出
		if (subject.isAuthenticated()) {
			subject.logout();
		}
		return "redirect:/home.html";

	}
}
