package com.example.demo.pojo.data12;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("121流量预警小时交通量")
public class FlowWarning {
    @TableField("时间")
    private String time;
    @TableField("进站方向扩展小时交通量")
    private Integer entryFlow;
    @TableField("出站方向扩展小时交通量")
    private Integer exitFlow;
}
