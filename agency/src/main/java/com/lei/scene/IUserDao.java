package com.lei.scene;

import com.lei.scene.agent.Select;

/**
 * UserDao
 *
 * @author leijiahao
 * @date 2023-11-30
 */
public interface IUserDao {

    @Select("select * from user where id = #{uId}")
    String queryUserInfo(String uId);
}
