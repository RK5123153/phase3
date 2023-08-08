package com.woniuxy.operate.entity;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.models.auth.In;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 
 * </p>
 *
 * @author woniuxy
 * @since 2023-08-05
 */
@Getter
@Setter
  @TableName("admin")
@ApiModel(value = "Admin对象", description = "")
public class Admin implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "admin_id", type = IdType.AUTO)
      private Integer adminId;

    private String name;

    private String phone;

    private String password;

    @TableLogic
    private Integer deleteFlag;

    @Version
    private Integer version;

}
