package com.example.demo.service.impl;

import com.example.demo.mapper.data14.RiskIndexMapper;
import com.example.demo.pojo.data14.RiskIndex;
import com.example.demo.service.TollBoothService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class TollBoothServiceImpl implements TollBoothService {
    @Autowired
    RiskIndexMapper riskIndexMapper;

    @Override
    public Map<String, Object> getAll() {
        List<RiskIndex> riskIndices = riskIndexMapper.selectList(null);

        Map<String, Object> map = new HashMap<>();
        map.put("RiskIndexMapper", riskIndices);
        return map;
    }
}
