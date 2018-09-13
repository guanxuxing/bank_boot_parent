package com.boot.bank.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * Created by Administrator on 2017-08-25.
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ToString(callSuper = true)
public class QhReliabiltiyTemp {

    private String id;
    private String mobile;
    private String credooScore;


}
