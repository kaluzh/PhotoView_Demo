package com.demo.photo.photo;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.WindowManager;

/**
 * description: 当前类描述信息
 * created by Administrator on 2017/10/26 0026 上午 3:55
 */
final class PhotoDialog extends Dialog {

    private OnBackPressedListener listener;

    public PhotoDialog(Activity activity) {
        super(activity);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }

    @Override
    public void show() {
        super.show();
        getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
    }

    @Override
    public void onBackPressed() {

        if (null != listener) {
            listener.onBackPressed();
        } else {
            super.onBackPressed();
        }
    }

    public void setOnBackPressedListener(OnBackPressedListener listener) {
        this.listener = listener;
    }

    public interface OnBackPressedListener {
        void onBackPressed();
    }
}
