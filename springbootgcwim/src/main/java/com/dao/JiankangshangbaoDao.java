package com.dao;

import com.entity.JiankangshangbaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiankangshangbaoVO;
import com.entity.view.JiankangshangbaoView;


/**
 * 健康上报
 * 
 * @author 
 * @email 
 * @date 2021-05-16 10:16:29
 */
public interface JiankangshangbaoDao extends BaseMapper<JiankangshangbaoEntity> {
	
	List<JiankangshangbaoVO> selectListVO(@Param("ew") Wrapper<JiankangshangbaoEntity> wrapper);
	
	JiankangshangbaoVO selectVO(@Param("ew") Wrapper<JiankangshangbaoEntity> wrapper);
	
	List<JiankangshangbaoView> selectListView(@Param("ew") Wrapper<JiankangshangbaoEntity> wrapper);

	List<JiankangshangbaoView> selectListView(Pagination page,@Param("ew") Wrapper<JiankangshangbaoEntity> wrapper);
	
	JiankangshangbaoView selectView(@Param("ew") Wrapper<JiankangshangbaoEntity> wrapper);
	
}
