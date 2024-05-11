package com.entity.view;

import com.entity.DiscussfangkongzhishiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 防控知识评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-16 10:16:30
 */
@TableName("discussfangkongzhishi")
public class DiscussfangkongzhishiView  extends DiscussfangkongzhishiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussfangkongzhishiView(){
	}
 
 	public DiscussfangkongzhishiView(DiscussfangkongzhishiEntity discussfangkongzhishiEntity){
 	try {
			BeanUtils.copyProperties(this, discussfangkongzhishiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
