package com.connect.inc.connect.interfaces;

import com.connect.inc.connect.model.chat.Chats;

import java.util.List;

public interface OnReadChatCallBack {
    void onReadSuccess(List<Chats> list);
    void onReadFailed();
}
