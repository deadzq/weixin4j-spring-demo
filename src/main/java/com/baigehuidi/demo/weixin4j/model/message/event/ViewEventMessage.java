/*
 * 微信公众平台(JAVA) SDK
 *
 * Copyright (c) 2014, Ansitech Network Technology Co.,Ltd All rights reserved.
 * 
 * http://www.weixin4j.org/
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.baigehuidi.demo.weixin4j.model.message.event;


import com.baigehuidi.demo.weixin4j.model.message.EventType;

/**
 * 自定义菜单事件
 *
 * 点击菜单跳转链接时的事件推送
 *
 * @author 杨启盛<qsyang@ansitech.com>
 * @since 0.0.1
 */
public class ViewEventMessage extends EventMessage {

    //事件KEY值，设置的跳转URL
    private String EventKey;
    private String MenuId;

    @Override
    public String getEvent() {
        return EventType.View.toString();
    }

    public String getEventKey() {
        return EventKey;
    }

    public void setEventKey(String EventKey) {
        this.EventKey = EventKey;
    }

    public String getMenuId() {
        return MenuId;
    }

    public void setMenuId(String MenuId) {
        this.MenuId = MenuId;
    }

}
