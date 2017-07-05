package cn.edu.tju.rico.utils;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

  
/**        
 * Title: Web上下文工具类
 * @author rico       
 * @created 2017年7月4日 下午5:16:42    
 */      
public class WebContextUtil {
	  
	/**     
	 * @description 获取HTTP请求    
	 * @author rico       
	 * @created 2017年7月4日 下午5:18:08     
	 * @return     
	 */
	public static HttpServletRequest getRequest() {
		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder
				.getRequestAttributes()).getRequest();
		return request;
	}
}
