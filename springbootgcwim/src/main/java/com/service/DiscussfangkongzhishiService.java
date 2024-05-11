package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussfangkongzhishiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussfangkongzhishiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussfangkongzhishiView;


/**
 * 防控知识评论表
 *
 * @author 
 * @email 
 * @date 2021-05-16 10:16:30
 */
public interface DiscussfangkongzhishiService extends IService<DiscussfangkongzhishiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussfangkongzhishiVO> selectListVO(Wrapper<DiscussfangkongzhishiEntity> wrapper);
   	
   	DiscussfangkongzhishiVO selectVO(@Param("ew") Wrapper<DiscussfangkongzhishiEntity> wrapper);
   	
   	List<DiscussfangkongzhishiView> selectListView(Wrapper<DiscussfangkongzhishiEntity> wrapper);
   	
   	DiscussfangkongzhishiView selectView(@Param("ew") Wrapper<DiscussfangkongzhishiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussfangkongzhishiEntity> wrapper);
   	
}

