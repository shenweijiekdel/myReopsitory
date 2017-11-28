package cn.tedu.examsystem.shiro;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cn.tedu.examsystem.pojo.Student;
import cn.tedu.examsystem.service.StudentService;
@Component
public class StudentRealm extends AuthorizingRealm{
	@Autowired
	private StudentService studentService;
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		return null;
	}


	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		Student student = null;
		// 1. 把AuthenticationToken转换为CustomizedToken
		CustomizedToken customizedToken = (CustomizedToken) token;
		// 2. 从CustomizedToken中获取email
		String sId = customizedToken.getUsername();
		// 3. 若用户不存在，抛出UnknownAccountException异常
		student = studentService.findOneBySid(sId);
		if (student == null)
			throw new UnknownAccountException("用户不存在！");
		 
		AuthenticationInfo info = new SimpleAuthenticationInfo(student, student.getsPassword(), this.getName());
		return info;
		 
	}


	 
}
