package cn.edu.tju.rico.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cn.edu.tju.rico.mapper.UserMapper;
import cn.edu.tju.rico.model.entity.User;
import cn.edu.tju.rico.service.UserService;

@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT)
@Component("userService")
public class UserServiceImpl implements UserService {

	private UserMapper userMapper;

	public UserMapper getUserMapper() {
		return userMapper;
	}

	@Resource
	// 默认按名称(userMapper)注入,若名称匹配失败，则按照类型匹配
	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}

	/**
	 * @description 登录逻辑的具体实现，对应事务包括用户的查询和日志的插入两部分
	 * @author rico
	 * @created 2017年4月24日 上午9:34:07
	 * @param uname
	 * @param passwd
	 * @return 用户名、密码匹配成功，返回true；否则，返回false;
	 * @see cn.edu.tju.rico.service.UserService#login(java.lang.String,
	 *      java.lang.String)
	 */
	@Transactional(readOnly = false)   //必须设置为false,因为此处切入了日志的保存逻辑
	public boolean login(String uname, String passwd) {
		// TODO Auto-generated method stub
		User user = userMapper.findUserByUnameAndPasswd(uname, passwd);
		return user == null ? false : true;
	}

	/**
	 * @description 用户获取逻辑的具体实现
	 * @author rico
	 * @created 2017年6月12日 下午12:22:00
	 * @param id
	 * @return
	 * @see cn.edu.tju.rico.service.UserService#getUser(int)
	 */

	@Transactional(readOnly = false)   //必须设置为false,因为此处切入了日志的保存逻辑
	public Object getUser(int id) {
		// TODO Auto-generated method stub
		return userMapper.findUserById(id);
	}

	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		userMapper.saveUser(user);
	}
}
