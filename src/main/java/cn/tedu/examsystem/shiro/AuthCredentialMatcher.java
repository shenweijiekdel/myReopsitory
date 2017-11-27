package cn.tedu.examsystem.shiro;

import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authc.credential.SimpleCredentialsMatcher;

import cn.tedu.examsystem.tool.Md5Utils;

public class AuthCredentialMatcher extends SimpleCredentialsMatcher {

	@Override
	public boolean doCredentialsMatch(AuthenticationToken token, AuthenticationInfo info) {
		 
		//把用户输入的密码 进行加密
		UsernamePasswordToken loginToken = (UsernamePasswordToken) token;
		//把用户输入的密码取出  char[] 转成 String
		String password = String.valueOf(loginToken.getPassword());
		password = Md5Utils.getMd5(password, loginToken.getUsername());
		//修改令牌中的密码 
		loginToken.setPassword(password.toCharArray());

		return super.doCredentialsMatch(token, info);
	}
}
