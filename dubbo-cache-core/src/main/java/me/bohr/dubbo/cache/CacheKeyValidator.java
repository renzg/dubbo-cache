/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package me.bohr.dubbo.cache;

import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.common.extension.Adaptive;
import com.alibaba.dubbo.common.extension.SPI;
import com.alibaba.dubbo.rpc.Invocation;

/**
 * @date 2018-07-24 01:29
 */
@SPI("default")
public interface CacheKeyValidator {
    /**
     * Check if the key can be cached
     *
     * @param url        URL
     * @param invocation Invocation
     * @param key        el express evaluated key
     * @return cache if ture
     */
    @Adaptive("cacheKeyValidator")
    boolean isValid(URL url, Invocation invocation, Object key);
}
