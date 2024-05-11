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


import com.dao.DiscussfangkongzhishiDao;
import com.entity.DiscussfangkongzhishiEntity;
import com.service.DiscussfangkongzhishiService;
import com.entity.vo.DiscussfangkongzhishiVO;
import com.entity.view.DiscussfangkongzhishiView;

@Service("discussfangkongzhishiService")
public class DiscussfangkongzhishiServiceImpl extends ServiceImpl<DiscussfangkongzhishiDao, DiscussfangkongzhishiEntity> implements DiscussfangkongzhishiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussfangkongzhishiEntity> page = this.selectPage(
                new Query<DiscussfangkongzhishiEntity>(params).getPage(),
                new EntityWrapper<DiscussfangkongzhishiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussfangkongzhishiEntity> wrapper) {
		  Page<DiscussfangkongzhishiView> page =new Query<DiscussfangkongzhishiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussfangkongzhishiVO> selectListVO(Wrapper<DiscussfangkongzhishiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussfangkongzhishiVO selectVO(Wrapper<DiscussfangkongzhishiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussfangkongzhishiView> selectListView(Wrapper<DiscussfangkongzhishiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussfangkongzhishiView selectView(Wrapper<DiscussfangkongzhishiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
