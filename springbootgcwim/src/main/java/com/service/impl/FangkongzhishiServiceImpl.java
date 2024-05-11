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


import com.dao.FangkongzhishiDao;
import com.entity.FangkongzhishiEntity;
import com.service.FangkongzhishiService;
import com.entity.vo.FangkongzhishiVO;
import com.entity.view.FangkongzhishiView;

@Service("fangkongzhishiService")
public class FangkongzhishiServiceImpl extends ServiceImpl<FangkongzhishiDao, FangkongzhishiEntity> implements FangkongzhishiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FangkongzhishiEntity> page = this.selectPage(
                new Query<FangkongzhishiEntity>(params).getPage(),
                new EntityWrapper<FangkongzhishiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FangkongzhishiEntity> wrapper) {
		  Page<FangkongzhishiView> page =new Query<FangkongzhishiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FangkongzhishiVO> selectListVO(Wrapper<FangkongzhishiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FangkongzhishiVO selectVO(Wrapper<FangkongzhishiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FangkongzhishiView> selectListView(Wrapper<FangkongzhishiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FangkongzhishiView selectView(Wrapper<FangkongzhishiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
