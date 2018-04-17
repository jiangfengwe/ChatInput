package com.zhongwenhui.tdin360.chatinput;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import cn.jiguang.imui.chatinput.ChatInputView;
import cn.jiguang.imui.chatinput.listener.OnMenuClickListener;
import cn.jiguang.imui.chatinput.model.FileItem;

public class MainActivity extends AppCompatActivity {
    ChatInputView chatInputView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        chatInputView= (ChatInputView) findViewById(R.id.chat_input);
        chatInputView.setMenuContainerHeight(1000);
        chatInputView.setMenuClickListener(new OnMenuClickListener() {

            @Override
            public boolean onSendTextMessage(CharSequence input) {
                // 输入框输入文字后，点击发送按钮事件

                return false;
            }

            @Override
            public void onSendFiles(List<FileItem> list) {
                // 选中文件或者录制完视频后，点击发送按钮触发此事件

            }

            @Override
            public void switchToMicrophoneMode() {
                // 点击语音按钮触发事件，显示录音界面前触发此事件
            }

            @Override
            public void switchToGalleryMode() {
                // 点击图片按钮触发事件，显示图片选择界面前触发此事件
            }

            @Override
            public void switchToCameraMode() {
                // 点击拍照按钮触发事件，显示拍照界面前触发此事件
            }
        });
    }

}
