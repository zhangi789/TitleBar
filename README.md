
## Android标题栏（TitleBar)

#### 集成步骤

    dependencies {
        #### 集成步骤

    dependencies {
        implementation 'com.github.zhangi789:TitleBar:5.0'
    }

#### 属性大全  兼容高版本 attr 

    <declare-styleable name="TitleBar" >
        <!-- 整体样式 -->
        <attr name="barStyle">
            <enum name="light" value="0x10" />
            <enum name="night" value="0x20" />
            <enum name="transparent" value="0x30" />
        </attr>
        <!-- 中间 -->
        <attr name="title" format="string" />
        <attr name="titleColor" format="color" />
        <attr name="titleSize" format="dimension" />
        <!-- 左边 -->
        <attr name="leftTitle" format="string"/>
        <attr name="leftIcon" format="reference" /><!-- leftIcon 优先于 backButton -->
        <attr name="backButton" format="boolean" /><!-- 返回按钮（默认开） -->
        <attr name="leftColor" format="color" />
        <attr name="leftSize" format="dimension" />
        <attr name="leftBackground" format="reference|color" />
        <!-- 右边 -->
        <attr name="rightTitle" format="string" />
        <attr name="rightIcon" format="reference" />
        <attr name="rightColor" format="color" />
        <attr name="rightSize" format="dimension" />
        <attr name="rightBackground" format="reference|color" />
        <!-- 分割线 -->
        <attr name="lineVisible" format="boolean" />
        <attr name="lineColor" format="reference|color" />
        <attr name="lineSize" format="dimension" />
    </declare-styleable>

#### XML示例

> [点我查看完整的Demo示例](https://github.com/zhangi789/TitleBar/blob/master/app/src/main/res/layout/activity_main.xmll)

       <com.zhy.cn.TitleBar
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        app:backButton="true"
        app:barStyle="light"
        app:leftIcon="@mipmap/bar_icon_back_white"
        app:title="@string/app_name"></com.zhy.cn.TitleBar>

#### 设置监听事件

    mTitleBar.setOnTitleBarListener(new OnTitleBarListener() {

        @Override
        public void onLeftClick(View v) {
            ToastUtils.show("左项View被点击");
        }

        @Override
        public void onTitleClick(View v) {
            ToastUtils.show("中间View被点击");
        }

        @Override
        public void onRightClick(View v) {
            ToastUtils.show("右项View被点击");
        }
    });
    }


