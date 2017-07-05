package cn.edu.tju.rico.utils;

  
/**        
 * Title: 字符串工具类    
 * @author rico       
 * @created 2017年7月4日 下午5:15:29    
 */      
public class StringUtil {
	  
	/**     
	 * @description 给定字符串是否为空或空串
	 * @author rico       
	 * @created 2017年7月4日 下午5:15:46     
	 * @param str
	 * @return     
	 */
	public static boolean isNotEmpty(String str) {
		if (str != null && str.length() != 0) {
			return true;
		}
		return false;
	}

	/**     
	 * @description 给定字符串是否为空或空串
	 * @author rico       
	 * @created 2017年7月4日 下午5:15:46     
	 * @param str
	 * @return     
	 */
	public static boolean isEmpty(String str) {
		if (str != null && str.length() != 0) {
			return false;
		}
		return true;
	}
}
