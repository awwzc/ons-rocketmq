package com.jerry.notification;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * ${DESCRIPTION}
 *
 * @author wuzq
 * @create 2018-04-15 下午12:59
 **/
@Data
public class DemoParam implements Serializable{
    private Long id ;
    private Integer age;
    private String name;
    private BigDecimal money;
    private Date birth;
}
