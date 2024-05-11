package com.entity.view;

import com.entity.FangkongzhishiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 防控知识
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-16 10:16:29
 */
@TableName("fangkongzhishi")
public class FangkongzhishiView  extends FangkongzhishiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public FangkongzhishiView(){
	}
 
 	public FangkongzhishiView(FangkongzhishiEntity fangkongzhishiEntity){
 	try {
			BeanUtils.copyProperties(this, fangkongzhishiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
