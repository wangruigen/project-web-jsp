package com.study.wrg.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <h5>log基本util类</h5>
 * 包含logback相关通用所有配置,对应配置文件如下：
 * <ol>
 * <li>getDaoLogger -> daoLog
 * <li>getSysLogger -> sysLog
 * <li>getServiceLogger -> serviceLog
 * <li>getControllerLogger -> controllerLog
 * </ol>
 * @author wrg
 */
public class LogUtil {
	
	/**
	 * <h5>基于logger名称获取日志对象（logback）</h5>
	 * @param name
	 * @return
	 */
	public static Logger getLogger(String name){
		return LoggerFactory.getLogger(name);
	}
	
	/**
	 * <h5>获取daoLogger,默认为ERROR级别</h5>
	 * 数据库读写相关日志
	 * @return
	 */
	public static Logger getDaoLogger(){
		return getLogger("daoLog");
	}
	
	/**
	 * <h5>获取sysLogger,默认为Info级别</h5>
	 * 系统级别的错误日志
	 * @return
	 */
	public static Logger getSysLogger(){
		return getLogger("sysLog");
	}
	
	/**
	 * <h5>获取serviceLog,默认为INFO级别</h5>
	 * 事务日志，包含所有事务异常
	 * @return
	 */
	public static Logger getServiceLogger(){
		return getLogger("serviceLog");
	}
	
	/**
	 * <h5>获取controllerLog,默认为ERROR级别</h5>
	 * 控制层日志，用于记录控制层相关异常
	 * @return
	 */
	public static Logger getControllerLogger(){
		return getLogger("controllerLog");
	}
	
}
