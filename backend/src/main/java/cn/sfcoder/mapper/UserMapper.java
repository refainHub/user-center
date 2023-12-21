package cn.sfcoder.mapper;

import cn.sfcoder.model.domain.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author Lenovo
* @description 针对表【user(用户表)】的数据库操作Mapper
* @createDate 2023-08-17 03:58:13
* @Entity cn.sfcoder.model.domain.User.User
*/
public interface UserMapper extends BaseMapper<User> {

}




