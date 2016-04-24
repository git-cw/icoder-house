package com.icoder.jxhouse.dao.user;

import com.icoder.jxhouse.dao.base.BaseDao;
import com.icoder.jxhouse.pojo.po.SysUser;
import org.springframework.stereotype.Repository;

/**
 * Created by congwangshi on 16/4/24.
 */
@Repository
public class UserDao extends BaseDao{
    int count = 0;
    public void test(){
        SysUser user = new SysUser();
        user.setCnname("侍从旺");
        try {
            this.saveOrUpdate(user);
        }catch (Exception e){
            logger.error("{}",e);
        }
        logger.error("dao---------------------->{}",++count);
    }
}
