package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.YiliaojuanzengDao;
import com.entity.YiliaojuanzengEntity;
import com.service.YiliaojuanzengService;
import com.entity.vo.YiliaojuanzengVO;
import com.entity.view.YiliaojuanzengView;

@Service("yiliaojuanzengService")
public class YiliaojuanzengServiceImpl extends ServiceImpl<YiliaojuanzengDao, YiliaojuanzengEntity> implements YiliaojuanzengService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YiliaojuanzengEntity> page = this.selectPage(
                new Query<YiliaojuanzengEntity>(params).getPage(),
                new EntityWrapper<YiliaojuanzengEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YiliaojuanzengEntity> wrapper) {
		  Page<YiliaojuanzengView> page =new Query<YiliaojuanzengView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YiliaojuanzengVO> selectListVO(Wrapper<YiliaojuanzengEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YiliaojuanzengVO selectVO(Wrapper<YiliaojuanzengEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YiliaojuanzengView> selectListView(Wrapper<YiliaojuanzengEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YiliaojuanzengView selectView(Wrapper<YiliaojuanzengEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
