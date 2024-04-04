package com.example.demo.pojo.data11;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 1-1-2
 */
@Data
@TableName("112小时交通量")
public class HourlyTrafficFlow {
    @TableField("时间")
    private String time;
    @TableField("进站分流区")
    private Integer entryDiversionArea;
    @TableField("出站分流区")
    private Integer exitDiversionArea;
    @TableField("出站合流区")
    private Integer exitMergingArea;
    @TableField("进站合流区")
    private Integer entryMergingArea;
}
