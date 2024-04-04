package com.example.demo.pojo.data11;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 1-1-1
 */
@Data
@TableName("111当日交通流量")
public class DailyTrafficFlow {
    @TableField("时间")
    private String time;
    @TableField("进站方向当日交通量")
    private Integer ina;
    @TableField("出站方向当日交通量")
    private Integer outa;
}
