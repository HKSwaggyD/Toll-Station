package com.example.demo.pojo.data13;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("131实时流量")
public class RealTimeEnter {
    @TableField("时间")
    private String time;
    @TableField("ETC通道1")
    private Integer ETC1;
    @TableField("ETC通道2")
    private Integer ETC2;
    @TableField("ETC通道3")
    private Integer ETC3;
    @TableField("ETC通道4")
    private Integer ETC4;
    @TableField("ETC通道5")
    private Integer ETC5;
    @TableField("MTC通道6")
    private Integer MTC6;
    @TableField("MTC通道7")
    private Integer MTC7;
    @TableField("MTC通道8")
    private Integer MTC8;
}
