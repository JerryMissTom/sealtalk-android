package cn.rongcloud.im.ui.activity;

import android.os.Bundle;

import cn.rongcloud.im.R;
//公共号搜索界面，路径：通讯录=》公共号=》+
public class PublicServiceSearchActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pub_search);
        setTitle(R.string.rc_search);
    }
}
