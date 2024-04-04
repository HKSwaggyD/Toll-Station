package com.example.demo.service.impl;

import com.example.demo.mapper.data11.CarRatioMapper;
import com.example.demo.mapper.data11.DailyTrafficFlowMapper;
import com.example.demo.mapper.data11.HourlyTrafficFlowMapper;
import com.example.demo.pojo.data11.CarRatio;
import com.example.demo.pojo.data11.DailyTrafficFlow;
import com.example.demo.pojo.data11.HourlyTrafficFlow;
import com.example.demo.service.BasicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Service
public class BasicServiceImpl implements BasicService {
    @Autowired
    HourlyTrafficFlowMapper hourlyTrafficFlowMapper;
    @Autowired
    DailyTrafficFlowMapper dailyTrafficFlowMapper;
    @Autowired
    CarRatioMapper carRatioMapper;
    @Override
    public Map<String, Object> getAll() {
        List<DailyTrafficFlow> dailyTrafficFlows=dailyTrafficFlowMapper.selectList(null);
        List<HourlyTrafficFlow> hourlyTrafficFlows=hourlyTrafficFlowMapper.selectList(null);
        List<CarRatio> carRatios=carRatioMapper.selectList(null);
        Map<String,Object> map=new HashMap<>();
        map.put("dailyTrafficFlows",dailyTrafficFlows);
        map.put("hourlyTrafficFlows",hourlyTrafficFlows);
        map.put("carRatios",carRatios);
        return map;
    }
}
