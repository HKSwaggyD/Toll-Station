package com.example.demo.pojo.data15;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 1-5-3出站通道实时流量
 */
@Data
@TableName("153出站通道运行指数")
public class ExitIndex {
    @TableField("时间")
    private String time;
    @TableField("ETC通道1")
    private String ETC1;
    @TableField("ETC通道2")
    private String ETC2;
    @TableField("ETC通道3")
    private String ETC3;
    @TableField("ETC通道4")
    private String ETC4;
    @TableField("ETC通道5")
    private String ETC5;
    @TableField("ETC通道6")
    private String ETC6;
    @TableField("MTC通道7")
    private String MTC7;
    @TableField("MTC通道8")
    private String MTC8;
    @TableField("MTC通道9")
    private String MTC9;
}
