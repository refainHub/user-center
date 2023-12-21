package cn.sfcoder.service;

import cn.sfcoder.model.domain.User;
import com.baomidou.mybatisplus.extension.service.IService;


import javax.servlet.http.HttpServletRequest;


/**
* @author Lenovo
* @description 针对表【user(用户表)】的数据库操作Service
* @createDate 2023-08-17 03:58:13
*/

public interface UserService extends IService<User> {

    /**
     * 用户登录态键
     */
    String USER_LOGIN_STATE="userLoginState";

    /**
     *
     * @param userAccount 用户账户
     * @param userPassword 用户密码
     * @param checkPassword 校验密码
     * @return
     */

    long userRegister(String userAccount,String userPassword,String checkPassword);

    /**
     * @param userAccount
     * @param userPassword
     * @param request
     * @return 返回脱敏后的用户信息
     */
    User userLogin(String userAccount, String userPassword, HttpServletRequest request);


    /**
     * 用户脱敏
     * @param originUser
     * @return
     */
    User getSafetyUser(User originUser);

    int userLogout(HttpServletRequest request);
}
