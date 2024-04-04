package com.example.demo.pojo.data13;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("134通道平均排队时长")
public class AverageQueuingEnter {
    @TableField("时间")
    private String time;
    @TableField("ETC通道1")
    private Double ETC1;
    @TableField("ETC通道2")
    private Double ETC2;
    @TableField("ETC通道3")
    private Double ETC3;
    @TableField("ETC通道4")
    private Double ETC4;
    @TableField("ETC通道5")
    private Double ETC5;
    @TableField("MTC通道6")
    private Double MTC6;
    @TableField("MTC通道7")
    private Double MTC7;
    @TableField("MTC通道8")
    private Double MTC8;
}
