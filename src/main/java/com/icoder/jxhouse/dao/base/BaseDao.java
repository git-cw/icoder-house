package com.icoder.jxhouse.dao.base;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.Collection;
import java.util.List;
import com.icoder.jxhouse.pojo.vo.common.PageSupport;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Projections;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.HibernateTemplate;

/**
 * Created by congwangshi on 16/4/23.
 */
public class BaseDao {
    public org.slf4j.Logger logger = LoggerFactory.getLogger(this.getClass().getName());

    @Autowired
    private HibernateTemplate hibernateTemplate;

    /**
     * 保存或更新实体类
     *
     * @version 1.0
     * @param entity
     *            需要持久化的实体
     * @return void
     * @notes
     * @description
     * @author Wangweiwei
     * */
    public void saveOrUpdate(Object entity)
    {
        hibernateTemplate.saveOrUpdate(entity);
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
     * @author Wangweiwei
     * */
    public void Mage(Object entity)
    {
        hibernateTemplate.merge(entity);
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
    public void saveOrUpdateAll(Collection entities)
    {
        hibernateTemplate.saveOrUpdateAll(entities);
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
    public void delete(Object entity)
    {
        hibernateTemplate.delete(entity);
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
    public void deleteAll(Collection entities)
    {
        hibernateTemplate.deleteAll(entities);
    }

    /**
     * get class by id
     *
     * @param clazz
     * @param id
     * @return
     */
    public <T> T getEntity(Class<T> clazz, Serializable id)
    {
        // TODO Auto-generated method stub
        return hibernateTemplate.get(clazz, id);
    }
    /**
     * 由dc查出一个值

     * @return [返回类型说明]
     * @exception/throws [违例类型] [违例说明]
     * @see [类、类#方法、类#成员]
     */
    public Object getEntity(DetachedCriteria dc)
    {
        List result = hibernateTemplate.findByCriteria(dc,0,1);
        return result.isEmpty() ? null : result.get(0);
    }

    /**
     * execute DetachedCriteria
     *
     * @param dc
     * @return
     */
    public List getEntitiesByDetachedCriteria(final DetachedCriteria dc)
    {
        return hibernateTemplate.executeFind(new HibernateCallback<List>()
        {
            public List doInHibernate(Session session)
                    throws HibernateException, SQLException
            {
                // TODO Auto-generated method stub
                return dc.getExecutableCriteria(session).list();
            }
        });
    }

    /**
     * GET COUNT BY DC
     *
     * @param dc
     * @return
     */
    public int getCountByDetachedCriteria(final DetachedCriteria dc)
    {

        return hibernateTemplate.execute(new HibernateCallback<Integer>()
        {
            public Integer doInHibernate(Session session)
                    throws HibernateException, SQLException
            {
                Criteria c = dc.getExecutableCriteria(session);
                c.setProjection(Projections.rowCount());
                Object rt = c.uniqueResult();
                return rt == null ? 0 : (Integer) c.uniqueResult();
            }
        });
    }


    public PageSupport getEntitiesByPage(final DetachedCriteria dc,
                                         final int pageIndex, final int pageSize)
    {
        return hibernateTemplate.execute(new HibernateCallback<PageSupport>()
        {
            public PageSupport doInHibernate(Session session)
                    throws HibernateException, SQLException
            {
                PageSupport ps = new PageSupport(pageIndex, pageSize);
                Criteria c = dc.getExecutableCriteria(session);
                c.setFirstResult((pageIndex - 1) * pageSize);
                c.setMaxResults(pageSize);
                ps.setRows(c.list());
                c.setFirstResult(0);
                c.setMaxResults(Integer.MAX_VALUE);
                c.setProjection(Projections.rowCount());
                int total = (Integer) c.uniqueResult();
                c.setProjection(null);
                ps.setTotal(total);
                return ps;
            }
        });
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
                                              final int pageIndex, final int pageSize)
    {
        return hibernateTemplate.executeFind(new HibernateCallback<List>()
        {
            public List doInHibernate(Session session)
                    throws HibernateException, SQLException
            {
                Criteria c = dc.getExecutableCriteria(session);
                c.setFirstResult((pageIndex - 1) * pageSize);
                c.setMaxResults(pageSize);
                return c.list();
            }
        });
    }

    /**
     * find by HQL
     * @param HQL
     * @param values
     * @return
     * @author www
     * @date 2014-11-4 20:44:53
     */
    public List findByQueryString(String HQL){
        return hibernateTemplate.find(HQL);
    }
    /**
     * find by HQL
     * @param HQL
     * @param values
     * @return
     * @author www
     * @date 2014-11-4 20:44:53
     */
    public List findByQueryString(String HQL,Object... values){
        return hibernateTemplate.find(HQL, values);
    }

    /**
     * 执行原生SQL语句
     * @param SQL
     * @param values
     * @return
     * @author www
     * @date 2015-1-23 13:42:50
     */
    public int executeUpdate(String SQL, Object[] values) {
        final String SQL_LINE = String.format(SQL, values);
        return hibernateTemplate.execute(new HibernateCallback<Integer>(){
            public Integer doInHibernate(Session session)
                    throws HibernateException, SQLException {
                return session.createSQLQuery(SQL_LINE).executeUpdate();

            }
        });
    }

}
