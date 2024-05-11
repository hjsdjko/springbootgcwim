package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FangkongzhishiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FangkongzhishiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FangkongzhishiView;


/**
 * 防控知识
 *
 * @author 
 * @email 
 * @date 2021-05-16 10:16:29
 */
public interface FangkongzhishiService extends IService<FangkongzhishiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FangkongzhishiVO> selectListVO(Wrapper<FangkongzhishiEntity> wrapper);
   	
   	FangkongzhishiVO selectVO(@Param("ew") Wrapper<FangkongzhishiEntity> wrapper);
   	
   	List<FangkongzhishiView> selectListView(Wrapper<FangkongzhishiEntity> wrapper);
   	
   	FangkongzhishiView selectView(@Param("ew") Wrapper<FangkongzhishiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FangkongzhishiEntity> wrapper);
   	
}

