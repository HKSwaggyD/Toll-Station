package com.example.demo.pojo.data15;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 1-5-1出站通道实时流量
 */
@Data
@TableName("151出站通道实时流量")
public class ExitTraffic {
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
    @TableField("ETC通道6")
    private Integer ETC6;
    @TableField("MTC通道7")
    private Integer MTC7;
    @TableField("MTC通道8")
    private Integer MTC8;
    @TableField("MTC通道9")
    private Integer MTC9;
}
