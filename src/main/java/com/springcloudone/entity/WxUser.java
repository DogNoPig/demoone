package com.springcloudone.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 微信用户实体
 * @author xw
 * @date 2019/10/29 14:46
 */
@Data
public class WxUser implements Serializable {

    private Integer id;
    private String nickName;

}
