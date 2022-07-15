package com.example.demo.entity;

/**
 * @Created: by 2022-07-15 17:04
 * @Description: 歇后语实体
 * @Author: 张松
 * @Blog: <a href="https://blog.csdn.net/qq_39038178"/>
 * @Github: <a href="https://github.com/GuiZhouAndroid"/>
 * @Copyright: 辽宁省-大连市-东华软件大连分公司
 */
public class XieHouYuBean {

    /**
     * 谜底
     */
    private String xhy_riddle;

    /**
     * 答案
     */
    private String xhy_answer;

    public XieHouYuBean() {
    }

    public XieHouYuBean(String xhy_riddle, String xhy_answer) {
        this.xhy_riddle = xhy_riddle;
        this.xhy_answer = xhy_answer;
    }

    public String getXhy_riddle() {
        return xhy_riddle;
    }

    public void setXhy_riddle(String xhy_riddle) {
        this.xhy_riddle = xhy_riddle;
    }

    public String getXhy_answer() {
        return xhy_answer;
    }

    public void setXhy_answer(String xhy_answer) {
        this.xhy_answer = xhy_answer;
    }

    @Override
    public String toString() {
        return "XieHouYuBean{" +
                ", xhy_riddle=" + xhy_riddle +
                ", xhy_answer=" + xhy_answer +
                '}';
    }
}
