package com.fund.manager;
import java.util.List;
import com.fund.model.FundInfo;

public interface FundInfoManager {

	    int countByBean(FundInfo bean);

	    int delete(Long id);

	    int insert(FundInfo bean);
	    
	    int update(FundInfo bean);

	    FundInfo selectByPrimaryKey(Long id);
	    
	    List<FundInfo> selectByBean(FundInfo bean);
}
