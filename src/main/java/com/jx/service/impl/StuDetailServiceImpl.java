package com.jx.service.impl;

import com.jx.bean.StuDetail;
import com.jx.comment.Pager;
import com.jx.dao.StuDetailDAO;
import com.jx.service.StuDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StuDetailServiceImpl implements StuDetailService {

    @Autowired
    private StuDetailDAO stuDetailDAO;

    @Override
    public void save(StuDetail stuDetail) {
        stuDetailDAO.save(stuDetail);
    }

    @Override
    public void remove(StuDetail stuDetail) {
        stuDetailDAO.remove(stuDetail);
    }

    @Override
    public void removeById(Long id) {
        stuDetailDAO.removeById(id);
    }

    @Override
    public void active(Long id, Byte status) {

    }

    @Override
    public void update(StuDetail stuDetail) {
        stuDetailDAO.update(stuDetail);
    }

    @Override
    public StuDetail getById(Long id) {
        return stuDetailDAO.getById(id);
    }

    @Override
    public List<StuDetail> listAll() {
        return stuDetailDAO.listAll();
    }

    @Override
    public Pager<StuDetail> listPager(int pageNo, int pageSize) {
        Pager<StuDetail> pager = new Pager<>(pageNo, pageSize);
        pager = stuDetailDAO.listPager(pager);
        pager.setTotal(stuDetailDAO.count());
        return pager;
    }

    @Override
    public Pager<StuDetail> listPagerCriteria(int pageNo, int pageSize, StuDetail stuDetail) {
        Pager<StuDetail> pager = new Pager<>(pageNo, pageSize);
        pager.setTotal(stuDetailDAO.countCriteria(stuDetail));
        return stuDetailDAO.listPagerCriteria(pager, stuDetail);
    }

}
