package com.icoder.jxhouse.service.base;

import com.icoder.jxhouse.dao.base.BaseDao;
import com.icoder.jxhouse.pojo.vo.common.PageSupport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

/**
 * Created by congwangshi on 16/4/23.
 */
public class BaseService {
    public Logger logger = LoggerFactory.getLogger(this.getClass().getName());
    @Autowired
    private BaseDao baseDao ;

    /**
     * 保存或更新实体类
     *
     * @param entity
     *            需要持久化的实体
     * @return void
     * @notes
     * @description
     * @author Wangweiwei
     * */
    public void saveOrUpdate(Object entity) {
        baseDao.saveOrUpdate(entity);
    }

    /**
     * 更新实体类
     *
     * @version 1.0
     * @param entity
     *            需要持久化的实体
     * @return void
     * @notes
     * @description
     * @author song
     * */
    public void Mage(Object entity) {

        baseDao.Mage(entity);
    }

    /**
     * 持久化集合
     *
     * @version 1.0
     * @params entities
     * @return void
     * @notes
     * @description
     * @time 2014-4-22 上午09:58:59
     * @author Wangweiwei
     * */
    @SuppressWarnings("rawtypes")
    public void saveOrUpdateAll(Collection entities) {
        baseDao.saveOrUpdateAll(entities);
    }

    /**
     * 删除实体类
     *
     * @version 1.0
     * @params entity
     * @return void
     * @notes
     * @description
     * @time 2014-4-22 上午10:00:36
     * @author Wangweiwei
     * */
    public void delete(Object entity) {
        baseDao.delete(entity);
    }

    /**
     * 将一个持久化的集合删除掉
     *
     * @version 1.0
     * @params entities
     * @return void
     * @notes
     * @description
     * @time 2014-4-22 上午10:00:52
     * @author Wangweiwei
     * */
    @SuppressWarnings("rawtypes")
    public void deleteAll(Collection entities) {
        baseDao.deleteAll(entities);
    }

    /**
     * get class by id
     * @param clazz
     * @param id
     * @return
     */
    public <T> T getEntity(Class<T> clazz, Serializable id) {
        // TODO Auto-generated method stub
        return baseDao.getEntity(clazz, id);
    }

    /**
     * 由dc查出一个值
     */
    public Object getEntity(DetachedCriteria dc) {
        return baseDao.getEntity(dc);
    }

    /**
     * DELETE ENTITY BY ID
     *
     * @param clazz
     * @param id
     */
    public void deleteEntity(Class clazz, Serializable id) {
        baseDao.delete(baseDao.getEntity(clazz, id));
    }

    /**
     * 分页查询
     */
    public PageSupport getEntitiesByPage(final DetachedCriteria dc,
                                         final int pageIndex, final int pageSize) {
        return baseDao.getEntitiesByPage(dc, pageIndex, pageSize);
    }

    /**
     * 由dc查询实体类列表
     *
     * @param dc
     * @return
     */
    public List getEntities(final DetachedCriteria dc) {
        return baseDao.getEntitiesByDetachedCriteria(dc);
    }

    /**
     * get entities by page
     *
     * @param dc
     * @param pageIndex
     * @param pageSize
     * @return
     */
    public List getEntitiesByDetachedCriteria(final DetachedCriteria dc,
                                              int pageIndex, int pageSize) {
        return baseDao.getEntitiesByDetachedCriteria(dc, pageIndex, pageSize);
    }


    /**
     * find by HQL
     *
     * @param HQL
     * @return
     * @author www
     * @date 2014-12-5 13:52:36
     */
    public List findByQueryString(String HQL) {
        return baseDao.findByQueryString(HQL);
    }

    /**
     * find by HQL
     * @param HQL
     * @param values
     * @return

     */
    public List findByQueryString(String HQL, Object... values) {
        return baseDao.findByQueryString(HQL, values);
    }

    /**
     * 执行SQL语句
     *
     * @param SQL
     * @param values
     * @return
     */
    public int executeUpdate(String SQL, Object... values) {
        return baseDao.executeUpdate(SQL, values);
    }

}
