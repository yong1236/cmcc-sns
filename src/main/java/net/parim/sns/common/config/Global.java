package net.parim.sns.common.config;

import java.util.Map;

import net.parim.sns.common.utils.PropertiesLoader;
import net.parim.sns.common.utils.StringUtils;

import com.google.common.collect.Maps;

/**
 * 全局配置
 * @author Tony
 *
 */
public class Global {
	/**
	 * 保存全局属性值
	 */
	private static Map<String, String> map = Maps.newHashMap();
	private static PropertiesLoader loader = new PropertiesLoader("sns.properties");
	
	private Global(){}
	
	/**
	 * 获取配置
	 * @see ${fns:getConfig('adminPath')}
	 */
	public static String getConfig(String key) {
		String value = map.get(key);
		if (value == null){
			value = loader.getProperty(key);
			map.put(key, value != null ? value : StringUtils.EMPTY);
		}
		return value;
	}
	
	/**
	 * 路径前缀
	 * @return
	 */
	public static String getUrlPrefix(){
		return getConfig("web.view.prefix");
	}
	
	/**
	 * 路径后缀
	 * @return
	 */
	public static String getUrlSuffix(){
		return getConfig("web.view.suffix");
	}
}
