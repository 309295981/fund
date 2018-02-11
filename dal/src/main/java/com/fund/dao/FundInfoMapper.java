package com.fund.dao;

import com.fund.model.FundInfo;
import com.fund.model.FundInfoSearch;
import java.util.List;

public interface FundInfoMapper {
    int countByExample(FundInfoSearch example);

    int deleteByPrimaryKey(Long id);

    int insert(FundInfo record);

    int insertSelective(FundInfo record);

    List<FundInfo> selectByExample(FundInfoSearch example);

    FundInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(FundInfo record);

    int updateByPrimaryKey(FundInfo record);
}