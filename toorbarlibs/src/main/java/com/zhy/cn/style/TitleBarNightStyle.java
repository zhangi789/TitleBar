package com.zhy.cn.style;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;

import com.zhy.cn.R;

/**
 *    author : 张海洋
 *    github :
 *    time   : 2019/05/20.
 *    desc   : 默认夜间主题样式实现（布局属性：app:barStyle="light"）
 */
public class TitleBarNightStyle extends BaseTitleBarStyle {

    public TitleBarNightStyle(Context context) {
        super(context);
    }

    @Override
    public Drawable getBackground() {
        return new ColorDrawable(0xFF000000);
    }

    @Override
    public Drawable getBackIcon() {
        return getDrawable(R.mipmap.bar_icon_back_white);
    }

    @Override
    public int getLeftColor() {
        return 0xCCFFFFFF;
    }

    @Override
    public int getTitleColor() {
        return 0xEEFFFFFF;
    }

    @Override
    public int getRightColor() {
        return 0xCCFFFFFF;
    }

    @Override
    public boolean isLineVisible() {
        return true;
    }

    @Override
    public Drawable getLineDrawable() {
        return new ColorDrawable(0xFFFFFFFF);
    }

    @Override
    public int getLineSize() {
        return 1;
    }

    @Override
    public Drawable getLeftBackground() {
        return getDrawable(R.drawable.bar_selector_selectable_black);
    }

    @Override
    public Drawable getRightBackground() {
        return getDrawable(R.drawable.bar_selector_selectable_black);
    }
}