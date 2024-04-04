package com.example.demo.controller;


import com.example.demo.pojo.R;
import com.example.demo.pojo.data12.FlowWarning;
import com.example.demo.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/index")
public class FirstController {
    @Autowired
    TollBoothService tollBoothService;
    @Autowired
    ExitingStationService exitingStationService;
    @Autowired
    BasicService basicService;
    @Autowired
    FlowWarningService flowWarningService;
    @Autowired
    EnteringStationService enteringStationService;

    @GetMapping("/basic")
    public R<Map<String,Object>> getBasic(){
        Map<String, Object> map = basicService.getAll();
        return R.success(map);
    }

    @GetMapping("/flowWarning")
    public R<List<FlowWarning>> getFlowWaring(){
        List<FlowWarning> flowWarnings = flowWarningService.getAll();
        return R.success(flowWarnings);
    }

    @GetMapping("/enterStation")
    public R<Map<String,Object>> getEnteringStation() {
        Map<String, Object> map = enteringStationService.getAll();
        return R.success(map);
    }

    @GetMapping("/tollbooth")
    public R<Map<String, Object>> getTollBooth() {
        Map<String, Object> map = tollBoothService.getAll();
        return R.success(map);
    }


    @GetMapping("/exitingstation")
    public R<Map<String, Object>> getExitTraffic() {
        Map<String, Object> map = exitingStationService.getAll();
        return R.success(map);
    }
}
