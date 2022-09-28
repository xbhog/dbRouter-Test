package com.xbhog.pojo;

import lombok.Data;

import java.util.Date;

/**
 * @author xbhog
 */
@Data
public class UserTakeActivity {
    private String uId;
    private Long takeId;
    private Long activityId;
    private String activityName;
    private Date takeDate;
    private Integer takeCount;
    private String Uuid;
}
