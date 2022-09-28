package com.xbhog;

import com.xbhog.db.router.annotation.DBRouter;

public interface IUserDao {

    @DBRouter(key = "userId")
    void insertUser(String req);
}