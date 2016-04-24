package com.icoder.jxhouse.service.user;

import com.icoder.jxhouse.dao.user.UserDao;
import com.icoder.jxhouse.service.base.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by congwangshi on 16/4/23.
 */
@Service
public class UserService extends BaseService{
    int count = 0;
    @Autowired
    private UserDao userDao ;

    public void text(){
        logger.error("service---------------------->{}",++count);
      userDao.test();
    }
}
