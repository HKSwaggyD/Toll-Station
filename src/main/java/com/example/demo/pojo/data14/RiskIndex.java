package com.example.demo.pojo.data14;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 1-4-1风险指数
 */
@Data
@TableName("141风险指数")
public class RiskIndex {
    @TableField("时间")
    private String time;
    @TableField("进站方向分流区风险指数")
    private Double entryDiversionIndex;
    @TableField("进站方向合流区风险指数")
    private Double entryMergingIndex;
    @TableField("出站方向分流区风险指数")
    private Double exitDiversionIndex;
    @TableField("出站方向合流区风险指数")
    private Double exitMergingIndex;
}
