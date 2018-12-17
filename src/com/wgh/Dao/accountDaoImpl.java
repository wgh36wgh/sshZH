package com.wgh.Dao;

import com.wgh.domain.Account;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class accountDaoImpl extends HibernateDaoSupport implements  accountDao {
    @Override
    public void save(Account account) {
        System.out.println("这是DAO");
        getHibernateTemplate().save(account);
    }
}
