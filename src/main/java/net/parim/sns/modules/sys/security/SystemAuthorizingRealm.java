/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package net.parim.sns.modules.sys.security;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.parim.sns.modules.sys.exception.IncorrectCredentialsException;
import net.parim.sns.modules.sys.exception.UnknownAccountException;
import net.parim.sns.modules.sys.service.AccountService;

/**
 * 系统安全认证实现类
 * @author ThinkGem
 * @version 2014-7-5
 */
@Service
//@DependsOn({"userDao","roleDao","menuDao"})
public class SystemAuthorizingRealm extends AuthorizingRealm {
	
	@Autowired
	AccountService accountService;

	/**
	 * 认证回调函数, 登录时调用
	 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(
			PrincipalCollection paramPrincipalCollection) {
		return null;
	}

	/**
	 * 授权查询回调函数, 进行鉴权但缓存中无用户的授权信息时调用
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(
			AuthenticationToken paramAuthenticationToken)
			throws AuthenticationException {
		String username = (String)paramAuthenticationToken.getPrincipal();
		String password = new String((char[])paramAuthenticationToken.getCredentials());
		try {
			accountService.checkUser(username, password);
		} catch (UnknownAccountException e) {
			throw new org.apache.shiro.authc.UnknownAccountException();
		} catch (IncorrectCredentialsException e) {
			throw new org.apache.shiro.authc.IncorrectCredentialsException();
		}
		return new SimpleAuthenticationInfo(username, password, SystemAuthorizingRealm.class.getName());
	}

	
}
