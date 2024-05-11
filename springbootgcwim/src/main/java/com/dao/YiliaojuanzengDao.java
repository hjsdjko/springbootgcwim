package com.dao;

import com.entity.YiliaojuanzengEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YiliaojuanzengVO;
import com.entity.view.YiliaojuanzengView;


/**
 * 医疗捐赠
 * 
 * @author 
 * @email 
 * @date 2021-05-16 10:16:29
 */
public interface YiliaojuanzengDao extends BaseMapper<YiliaojuanzengEntity> {
	
	List<YiliaojuanzengVO> selectListVO(@Param("ew") Wrapper<YiliaojuanzengEntity> wrapper);
	
	YiliaojuanzengVO selectVO(@Param("ew") Wrapper<YiliaojuanzengEntity> wrapper);
	
	List<YiliaojuanzengView> selectListView(@Param("ew") Wrapper<YiliaojuanzengEntity> wrapper);

	List<YiliaojuanzengView> selectListView(Pagination page,@Param("ew") Wrapper<YiliaojuanzengEntity> wrapper);
	
	YiliaojuanzengView selectView(@Param("ew") Wrapper<YiliaojuanzengEntity> wrapper);
	
}
