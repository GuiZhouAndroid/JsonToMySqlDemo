package com.example.demo.service.impl;

import com.example.demo.entity.XieHouYuBean;
import com.example.demo.mapper.XieHouYuMapper;
import com.example.demo.service.XieHouYuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Created: by 2022-07-15 17:18
 * @Description: 歇后语业务逻辑实现
 * @Author: 张松
 * @Blog: <a href="https://blog.csdn.net/qq_39038178"/>
 * @Github: <a href="https://github.com/GuiZhouAndroid"/>
 * @Copyright: 辽宁省-大连市-东华软件大连分公司
 */
@Service
public class XieHouYuServiceImpl implements XieHouYuService {

    @Autowired
    private XieHouYuMapper xieHouYuMapper;

    /**
     * 歇后语添加
     *
     * @param xieHouYuBeanList 歇后语实体集合
     * @return 添加结果
     */
    @Override
    public int batchInsertXieHouYu(List<XieHouYuBean> xieHouYuBeanList) {
        return xieHouYuMapper.batchInsertXieHouYu(xieHouYuBeanList);
    }

    /**
     * 歇后语谜底查询对应答案
     *
     * @param xhyRiddle 歇后语谜底
     * @return 谜底答案
     */
    @Override
    public String selectXieHouYu(String xhyRiddle) {
        return xieHouYuMapper.selectXieHouYu(xhyRiddle);
    }
}

