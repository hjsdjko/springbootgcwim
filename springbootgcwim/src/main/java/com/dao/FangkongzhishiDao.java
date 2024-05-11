package com.dao;

import com.entity.FangkongzhishiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FangkongzhishiVO;
import com.entity.view.FangkongzhishiView;


/**
 * 防控知识
 * 
 * @author 
 * @email 
 * @date 2021-05-16 10:16:29
 */
public interface FangkongzhishiDao extends BaseMapper<FangkongzhishiEntity> {
	
	List<FangkongzhishiVO> selectListVO(@Param("ew") Wrapper<FangkongzhishiEntity> wrapper);
	
	FangkongzhishiVO selectVO(@Param("ew") Wrapper<FangkongzhishiEntity> wrapper);
	
	List<FangkongzhishiView> selectListView(@Param("ew") Wrapper<FangkongzhishiEntity> wrapper);

	List<FangkongzhishiView> selectListView(Pagination page,@Param("ew") Wrapper<FangkongzhishiEntity> wrapper);
	
	FangkongzhishiView selectView(@Param("ew") Wrapper<FangkongzhishiEntity> wrapper);
	
}
