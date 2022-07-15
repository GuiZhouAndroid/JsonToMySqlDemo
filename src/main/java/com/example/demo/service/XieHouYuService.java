package com.example.demo.service;

import com.example.demo.entity.XieHouYuBean;

import java.util.List;

/**
 * @Created: by 2022-07-15 17:16
 * @Description: 歇后语业务逻辑层
 * @Author: 张松
 * @Blog: <a href="https://blog.csdn.net/qq_39038178"/>
 * @Github: <a href="https://github.com/GuiZhouAndroid"/>
 * @Copyright: 辽宁省-大连市-东华软件大连分公司
 */
public interface XieHouYuService {
    /**
     * 歇后语添加
     *
     * @param xieHouYuBeanList 歇后语实体集合
     * @return 添加结果
     */
    public int batchInsertXieHouYu(List<XieHouYuBean> xieHouYuBeanList);

    /**
     * 歇后语谜底查询对应答案
     *
     * @param xhyRiddle 歇后语谜底
     * @return 谜底答案
     */
    public String selectXieHouYu(String xhyRiddle);
}
