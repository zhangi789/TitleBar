package com.zhy.cn;

import android.view.View;

/**
 * @author 张海洋
 * @Date on 2019/05/20.
 * @org 上海..科技有限公司
 * @describe
 */
public interface OnTitleBarListener {
    /**
     * 左项被点击
     *
     * @param v     被点击的左项View
     */
    void onLeftClick(View v);

    /**
     * 标题被点击
     *
     * @param v     被点击的标题View
     */
    void onTitleClick(View v);

    /**
     * 右项被点击
     *
     * @param v     被点击的右项View
     */
    void onRightClick(View v);
}
