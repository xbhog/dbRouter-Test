package com.xbhog.mapper;

import com.xbhog.db.router.annotation.DBRouter;
import com.xbhog.pojo.UserTakeActivity;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author xbhog
 */
@Mapper
public interface IUserTakeActivityDao {

    void insertDB(UserTakeActivity userTakeActivity);
}
