package com.entity.model;

import com.entity.YiliaojuanzengEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 医疗捐赠
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-05-16 10:16:29
 */
public class YiliaojuanzengModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 目标金额
	 */
	
	private Integer mubiaojine;
		
	/**
	 * 捐赠金额
	 */
	
	private Integer juanzengjine;
		
	/**
	 * 发布时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date fabushijian;
		
	/**
	 * 捐款内容
	 */
	
	private String juankuanneirong;
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：目标金额
	 */
	 
	public void setMubiaojine(Integer mubiaojine) {
		this.mubiaojine = mubiaojine;
	}
	
	/**
	 * 获取：目标金额
	 */
	public Integer getMubiaojine() {
		return mubiaojine;
	}
				
	
	/**
	 * 设置：捐赠金额
	 */
	 
	public void setJuanzengjine(Integer juanzengjine) {
		this.juanzengjine = juanzengjine;
	}
	
	/**
	 * 获取：捐赠金额
	 */
	public Integer getJuanzengjine() {
		return juanzengjine;
	}
				
	
	/**
	 * 设置：发布时间
	 */
	 
	public void setFabushijian(Date fabushijian) {
		this.fabushijian = fabushijian;
	}
	
	/**
	 * 获取：发布时间
	 */
	public Date getFabushijian() {
		return fabushijian;
	}
				
	
	/**
	 * 设置：捐款内容
	 */
	 
	public void setJuankuanneirong(String juankuanneirong) {
		this.juankuanneirong = juankuanneirong;
	}
	
	/**
	 * 获取：捐款内容
	 */
	public String getJuankuanneirong() {
		return juankuanneirong;
	}
			
}
