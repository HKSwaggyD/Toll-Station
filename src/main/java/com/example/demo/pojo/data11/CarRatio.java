package com.example.demo.pojo.data11;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 1-1-3
 */
@Data
@TableName("113车辆比例")
public class CarRatio {
    @TableField("时间")
    private String time;
    @TableField("ETC车辆比例")
    private Double ETC;
    @TableField("MTC车辆比例")
    private Double MTC;
    @TableField("中小客车比例")
    private Double smallBus;
    @TableField("大客车比例")
    private Double bigBus;
    @TableField("中小货车比例")
    private Double smallTruck;
    @TableField("大货车比例")
    private Double bigTruck;
}
