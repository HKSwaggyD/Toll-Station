package com.example.demo.service.impl;

import com.example.demo.mapper.data13.AverageQueuingEnterMapper;
import com.example.demo.mapper.data13.AverageSpeedEnterMapper;
import com.example.demo.mapper.data13.ChannelIndexEnterMapper;
import com.example.demo.mapper.data13.RealTimeEnterMapper;
import com.example.demo.pojo.data13.AverageQueuingEnter;
import com.example.demo.pojo.data13.AverageSpeedEnter;
import com.example.demo.pojo.data13.ChannelIndexEnter;
import com.example.demo.pojo.data13.RealTimeEnter;
import com.example.demo.service.EnteringStationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class EnteringStationServiceImpl implements EnteringStationService {
    @Autowired
    AverageSpeedEnterMapper averageSpeedEnterMapper;
    @Autowired
    AverageQueuingEnterMapper averageQueuingEnterMapper;
    @Autowired
    ChannelIndexEnterMapper channelIndexEnterMapper;
    @Autowired
    RealTimeEnterMapper realTimeEnterMapper;
    @Override
    public Map<String, Object> getAll() {
        List<AverageQueuingEnter> averageQueuingEnters = averageQueuingEnterMapper.selectList(null);
        List<AverageSpeedEnter> averageSpeedEnters = averageSpeedEnterMapper.selectList(null);
        List<ChannelIndexEnter> channelIndexEnters = channelIndexEnterMapper.selectList(null);
        List<RealTimeEnter> realTimeEnters = realTimeEnterMapper.selectList(null);
        Map<String,Object> map=new HashMap<>();
        map.put("averageQueuingEnters",averageQueuingEnters);
        map.put("averageSpeedEnters",averageSpeedEnters);
        map.put("channelIndexEnters",channelIndexEnters);
        map.put("realTimeEnters",realTimeEnters);
        return map;
    }
}
