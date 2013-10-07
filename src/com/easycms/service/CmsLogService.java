package com.easycms.service;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import com.easycms.base.BaseDao;
import com.easycms.entity.CmsLog;

public interface CmsLogService extends BaseDao<CmsLog,Integer>{
	/**
	 * 插入后台日志操作
	 * @param request
	 * @param title
	 * @param content
	 * @return
	 */
	 public void operating(HttpServletRequest request, String title, String content);
	 /**
	  * 登录成功日志
	  * @param request
	  * @param title
	  * @param content
	  */
	 public void loginSucssessLog(HttpServletRequest request, String title);
	 /**
	  * 登录失败日志
	  * @param request
	  * @param title
	  * @param content
	  */
	 public void loginFailureLog(HttpServletRequest request, String title, String content);
	 
	 /**
	  * 保存日志
	  * @param log
	 * @return 
	  */
	 public void saveLog(Integer category, String username, String url, String ip, Date date, String title, String content);
}