package com.fund.manager.impl;

import java.util.List;
import java.util.Date;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.fund.util.tools.TTime;
import com.fund.model.FundInfo;
import com.fund.model.FundInfoSearch;
import com.fund.model.FundInfoSearch.Criteria;
import com.fund.dao.FundInfoMapper;
import com.fund.manager.FundInfoManager;

@Service
public class FundInfoManagerImpl implements FundInfoManager  {

	@Resource(name="fundInfoMapper")
	private FundInfoMapper _mapper;
	//cacheKey
	private final static String cacheKey="bean.FundInfo";

	private FundInfoSearch createSearch(FundInfo bean)
	{
		FundInfoSearch search = new FundInfoSearch();
		Criteria cra = search.createCriteria();
				if(bean!=null)
		{
		if(bean.getWalletAddress()!=null && bean.getWalletAddress()!=-1)
		{
				cra.andWalletAddressEqualTo(bean.getWalletAddress());
		}
		if(bean.getGmtCreate()!=null )		{
				cra.andGmtCreateEqualTo(bean.getGmtCreate());
		}
		if(bean.getSignature()!=null && bean.getSignature().length()>0)		{
				cra.andSignatureEqualTo(bean.getSignature());
		}
		if(bean.getFundraisingSignature()!=null && bean.getFundraisingSignature().length()>0)		{
				cra.andFundraisingSignatureEqualTo(bean.getFundraisingSignature());
		}
		if(bean.getFundraisingStatus()!=null && bean.getFundraisingStatus()!=-1)
		{
				cra.andFundraisingStatusEqualTo(bean.getFundraisingStatus());
		}
		if(bean.getFundraisingTokenName()!=null && bean.getFundraisingTokenName().length()>0)		{
				cra.andFundraisingTokenNameEqualTo(bean.getFundraisingTokenName());
		}
		if(bean.getTitle()!=null && bean.getTitle().length()>0)		{
				cra.andTitleEqualTo(bean.getTitle());
		}
		if(bean.getGmtModified()!=null )		{
				cra.andGmtModifiedEqualTo(bean.getGmtModified());
		}
		if(bean.getUid()!=null && bean.getUid()!=-1)
		{
				cra.andUidEqualTo(bean.getUid());
		}
		if(bean.getFundraisingStart()!=null )		{
				cra.andFundraisingStartEqualTo(bean.getFundraisingStart());
		}
		if(bean.getFundraisingEnd()!=null )		{
				cra.andFundraisingEndEqualTo(bean.getFundraisingEnd());
		}
		if(bean.getId()!=null && bean.getId()!=-1)
		{
				cra.andIdEqualTo(bean.getId());
		}
		if(bean.getFundraisingTokenAddress()!=null && bean.getFundraisingTokenAddress().length()>0)		{
				cra.andFundraisingTokenAddressEqualTo(bean.getFundraisingTokenAddress());
		}
		if(bean.getStatus()!=null && bean.getStatus()!=-1)
		{
				cra.andStatusEqualTo(bean.getStatus());
		}
		}

		if(bean.getOrderByClause()!=null)
		{
			search.setOrderByClause(bean.getOrderByClause());
		}
		return search;
	}
	
	@Override
	public int countByBean(FundInfo bean) {
		FundInfoSearch search = this.createSearch(bean);
		return _mapper.countByExample(search);
	}

	@Override
	public int delete(Long id) {
		if(id == null || id < 0) return 0;
		int val = _mapper.deleteByPrimaryKey(id);
		return val;
	}

	@Override
	public int insert(FundInfo bean) {
		if(bean == null) return 0;
		
		
		
		bean.setGmtCreate(new Date());
		bean.setGmtModified(new Date());
		int val =  _mapper.insertSelective(bean);
		return val;
	}

	@Override
	public int update(FundInfo bean) {
		if(bean == null) return 0;
		
		bean.setGmtModified(new Date());
		int val = _mapper.updateByPrimaryKeySelective(bean);
		return val;
	}

	@Override
	public FundInfo selectByPrimaryKey(Long id) {
		if(id == null || id < 0) return null;
		FundInfo  bean=_mapper.selectByPrimaryKey(id);
		return bean;
	}
	
	@Override
	public List<FundInfo> selectByBean(FundInfo bean) {
		FundInfoSearch search = this.createSearch(bean);
		search.setLimitStart(bean.getLimitStart());
		search.setLimitEnd(bean.getLimitEnd());
		List<FundInfo> list= _mapper.selectByExample(search);
		return list;
	}
	
}
