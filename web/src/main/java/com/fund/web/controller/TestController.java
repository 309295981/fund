package com.fund.web.controller;

import com.fund.manager.FundInfoManager;
import com.fund.model.FundInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("/test/*")
public class TestController {
    @Resource
    private FundInfoManager fundInfoManager;
    @RequestMapping("qq.do")
    public @ResponseBody
    FundInfo test() {
        return fundInfoManager.selectByPrimaryKey(1l);
    }
}
