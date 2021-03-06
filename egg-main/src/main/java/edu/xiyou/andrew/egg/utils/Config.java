package edu.xiyou.andrew.egg.utils;

/*
 * Copyright (c) 2015 Andrew-Wang.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


import com.google.common.collect.Maps;

import java.util.Map;


/**
 * 设置爬虫参数
 * Created by andrew on 15-5-21.
 */
public class Config {

    public static final String USER_AGENT = "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Ubuntu Chromium/43.0.2357.130 Chrome/43.0.2357.130 Safari/537.36";

    public static final Map cookies = Maps.newHashMap();

    public static final int INTERVAL_JUST_ONE = -1;
    public static int interval = INTERVAL_JUST_ONE;

    public static final int FETCH_COUNT =  100000;
    public static final int BLOOMFILTER_RATE = 10*1000*1000;
    public static final double BLOOMFILTER_ERROR_RATE = 0.0001;

    public static long emptySleepTime = 1000;

    public static final int NULL_COUNT = 5;    //连续取出NULL_COUNT次url则退出
}
