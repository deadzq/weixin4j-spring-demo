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
package com.baigehuidi.demo.weixin4j.factory;


import com.baigehuidi.demo.weixin4j.Weixin;

/**
 * 创建一个微信操作工厂类
 *
 * @author 杨启盛<qsyang@ansitech.com>
 * @since 1.0.0
 */
public interface WeixinFactory {

    Weixin getWeixin();
}
