package cn.edu.tju.rico.controller;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cn.edu.tju.rico.annotation.IgnoreSecurity;
import cn.edu.tju.rico.authorization.TokenManager;
import cn.edu.tju.rico.response.Response;
import cn.edu.tju.rico.service.UserService;
import cn.edu.tju.rico.utils.Constants;
  
/**        
 * Title: Token的管理    
 * Description: 处理用户的登录、登出操作
 * @author rico       
 * @created 2017年7月4日 下午4:52:58    
 */      
@RestController
@RequestMapping("/tokens")
public class TokenController {

	private UserService userService;
	private TokenManager tokenManager;
	private static final Logger log = Logger.getLogger(TokenController.class);

	
	public UserService getUserService() {
		return userService;
	}

	@Resource(name = "userService")
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public TokenManager getTokenManager() {
		return tokenManager;
	}

	@Resource(name = "tokenManager")
	public void setTokenManager(TokenManager tokenManager) {
		this.tokenManager = tokenManager;
	}

	  
	/**     
	 * @description 登录处理
	 * @author rico       
	 * @created 2017年7月4日 下午4:53:58     
	 */
	@RequestMapping(method = RequestMethod.POST)
	@IgnoreSecurity
	public Response login(@RequestParam("uname") String uname,
			@RequestParam("passwd") String passwd, HttpServletResponse response) {
		boolean flag = userService.login(uname, passwd);
		if (flag) {
			String token = tokenManager.createToken(uname);
			log.debug("**** Generate Token **** : " + token);
			Cookie cookie = new Cookie(Constants.DEFAULT_TOKEN_NAME, token);
			log.debug("Write Token to Cookie and return to the Client : " + cookie.toString());
			response.addCookie(cookie);
			return new Response().success("Login Success...");
		}
		return new Response().failure("Login Failure...");
	}

	/**     
	 * @description 登出处理
	 * @author rico       
	 * @created 2017年7月4日 下午4:53:58     
	 */
	@RequestMapping(method = RequestMethod.DELETE)
	@IgnoreSecurity
	public Response logout(HttpServletRequest request) {
		String token = request.getHeader(Constants.DEFAULT_TOKEN_NAME);
		tokenManager.deleteToken(token);
		log.debug("Logout Success...");
		return new Response().success("Logout Success...");
	}
}
