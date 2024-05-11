package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YiliaojuanzengEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YiliaojuanzengVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YiliaojuanzengView;


/**
 * 医疗捐赠
 *
 * @author 
 * @email 
 * @date 2021-05-16 10:16:29
 */
public interface YiliaojuanzengService extends IService<YiliaojuanzengEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YiliaojuanzengVO> selectListVO(Wrapper<YiliaojuanzengEntity> wrapper);
   	
   	YiliaojuanzengVO selectVO(@Param("ew") Wrapper<YiliaojuanzengEntity> wrapper);
   	
   	List<YiliaojuanzengView> selectListView(Wrapper<YiliaojuanzengEntity> wrapper);
   	
   	YiliaojuanzengView selectView(@Param("ew") Wrapper<YiliaojuanzengEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YiliaojuanzengEntity> wrapper);
   	
}

