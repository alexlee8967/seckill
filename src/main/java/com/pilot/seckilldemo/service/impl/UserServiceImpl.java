package com.pilot.seckilldemo.service.impl;

import com.pilot.seckilldemo.pojo.User;
import com.pilot.seckilldemo.mapper.UserMapper;
import com.pilot.seckilldemo.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhoubin
 * @since 2022-05-10
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
