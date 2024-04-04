package com.example.demo.service.impl;

import com.example.demo.mapper.data15.ExitIndexMapper;
import com.example.demo.mapper.data15.ExitTimeMapper;
import com.example.demo.mapper.data15.ExitTrafficMapper;
import com.example.demo.mapper.data15.ExitVelocityMapper;
import com.example.demo.pojo.data15.ExitIndex;
import com.example.demo.pojo.data15.ExitTime;
import com.example.demo.pojo.data15.ExitTraffic;
import com.example.demo.pojo.data15.ExitVelocity;
import com.example.demo.service.ExitingStationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ExitingStationServiceImpl implements ExitingStationService {
    @Autowired
    ExitTrafficMapper exitTrafficMapper;
    @Autowired
    ExitVelocityMapper exitVelocityMapper;
    @Autowired
    ExitIndexMapper exitIndexMapper;
    @Autowired
    ExitTimeMapper exitTimeMapper;

    @Override
    public Map<String, Object> getAll() {
        List<ExitTraffic> exitTraffics = exitTrafficMapper.selectList(null);
        List<ExitVelocity> exitVelocities = exitVelocityMapper.selectList(null);
        List<ExitIndex> exitIndices = exitIndexMapper.selectList(null);
        List<ExitTime> exitTimes = exitTimeMapper.selectList(null);

        Map<String, Object> map = new HashMap<>();
        map.put("ExitTrafficMapper", exitTraffics);
        map.put("ExitVelocityMapper", exitVelocities);
        map.put("ExitIndexMapper", exitIndices);
        map.put("ExitTimeMapper", exitTimes);
        return map;
    }
}
