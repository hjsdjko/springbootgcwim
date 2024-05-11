package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 医疗捐赠
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-05-16 10:16:29
 */
@TableName("yiliaojuanzeng")
public class YiliaojuanzengEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public YiliaojuanzengEntity() {
		
	}
	
	public YiliaojuanzengEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 标题
	 */
					
	private String biaoti;
	
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date fabushijian;
	
	/**
	 * 捐款内容
	 */
					
	private String juankuanneirong;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：标题
	 */
	public void setBiaoti(String biaoti) {
		this.biaoti = biaoti;
	}
	/**
	 * 获取：标题
	 */
	public String getBiaoti() {
		return biaoti;
	}
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
