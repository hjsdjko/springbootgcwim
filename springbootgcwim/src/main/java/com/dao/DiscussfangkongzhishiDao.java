package com.dao;

import com.entity.DiscussfangkongzhishiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussfangkongzhishiVO;
import com.entity.view.DiscussfangkongzhishiView;


/**
 * 防控知识评论表
 * 
 * @author 
 * @email 
 * @date 2021-05-16 10:16:30
 */
public interface DiscussfangkongzhishiDao extends BaseMapper<DiscussfangkongzhishiEntity> {
	
	List<DiscussfangkongzhishiVO> selectListVO(@Param("ew") Wrapper<DiscussfangkongzhishiEntity> wrapper);
	
	DiscussfangkongzhishiVO selectVO(@Param("ew") Wrapper<DiscussfangkongzhishiEntity> wrapper);
	
	List<DiscussfangkongzhishiView> selectListView(@Param("ew") Wrapper<DiscussfangkongzhishiEntity> wrapper);

	List<DiscussfangkongzhishiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussfangkongzhishiEntity> wrapper);
	
	DiscussfangkongzhishiView selectView(@Param("ew") Wrapper<DiscussfangkongzhishiEntity> wrapper);
	
}
