package com.channing.af.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.channing.af.common.Base;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@TableName(value = "public.goods")
@NoArgsConstructor
@AllArgsConstructor
public class Goods extends Base {

    @TableId(value = "gid", type = IdType.AUTO)
    private Long gId;
    @TableField("gname")
    private String gName;
    @TableField("gdesc")
    private String gDesc;
    @TableField("gweight")
    private float gWeight;
    @TableField("gsize")
    private float gSize;

}
