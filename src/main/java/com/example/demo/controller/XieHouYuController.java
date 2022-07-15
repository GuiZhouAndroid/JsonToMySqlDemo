package com.example.demo.controller;

import cn.hutool.core.io.resource.ResourceUtil;
import cn.hutool.json.JSONArray;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import com.example.demo.entity.XieHouYuBean;
import com.example.demo.service.XieHouYuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @Created: by 2022-07-14 16:45
 * @Description: 歇后语控制层
 * @Author: 张松
 * @Blog: <a href="https://blog.csdn.net/qq_39038178"/>
 * @Github: <a href="https://github.com/GuiZhouAndroid"/>
 * @Copyright: 辽宁省-大连市-东华软件大连分公司
 */
@RestController
public class XieHouYuController {

    @Autowired
    private XieHouYuService xieHouYuService;

    /**
     * 歇后语添加
     */
    @RequestMapping("/readXieHouYuJson")
    public void readXieHouYuJson() {
        String strFile = ResourceUtil.readUtf8Str("json/xiehouyu.json");// 读取json文件
        JSONArray jsonArray = JSONUtil.parseArray(strFile);//解析json文件
        List<XieHouYuBean> xieHouYuBeanList = new ArrayList<>();//存放歇后语实体的list
        for (JSONObject jsonObject : jsonArray.jsonIter()) { //遍历json数组
            // 将json数组中的每一个对象转换成实体类并存放到list中
            if (jsonObject != null) {
                xieHouYuBeanList.add(new XieHouYuBean(
                        jsonObject.get("riddle").toString(),
                        jsonObject.get("answer").toString())
                );
            }
        }
        System.out.println(xieHouYuBeanList);
        // 批量添加歇后语
        xieHouYuService.batchInsertXieHouYu(xieHouYuBeanList);
    }

    /**
     * 歇后语谜底查询对应答案
     *
     * @param riddle 歇后语谜底
     */
    @PostMapping("/selectXieHouYuAnswerByRiddle")
    public String selectXieHouYuAnswerByRiddle(@RequestParam String riddle) {
        // 查询歇后语对应答案
        return xieHouYuService.selectXieHouYu(riddle);
    }
}
