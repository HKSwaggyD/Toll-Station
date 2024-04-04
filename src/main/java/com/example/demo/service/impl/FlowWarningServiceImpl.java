package com.example.demo.service.impl;

import com.example.demo.mapper.data12.FlowWarningMapper;
import com.example.demo.pojo.data12.FlowWarning;
import com.example.demo.service.FlowWarningService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlowWarningServiceImpl implements FlowWarningService {
    @Autowired
    FlowWarningMapper flowWarningMapper;

    @Override
    public List<FlowWarning> getAll() {
        List<FlowWarning> flowWarnings = flowWarningMapper.selectList(null);
        return flowWarnings;
    }
}
