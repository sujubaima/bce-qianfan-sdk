/*
 * Copyright (c) 2024 Baidu, Inc. All Rights Reserved.
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

package com.baidubce.qianfan.model.plugin;

public class PluginUsage {
    /**
     * 问题tokens数
     */
    private Integer promptTokens;

    /**
     * 回答tokens数
     */
    private Integer completionTokens;

    /**
     * tokens总数
     */
    private Integer totalTokens;

    public Integer getPromptTokens() {
        return promptTokens;
    }

    public PluginUsage setPromptTokens(Integer promptTokens) {
        this.promptTokens = promptTokens;
        return this;
    }

    public Integer getCompletionTokens() {
        return completionTokens;
    }

    public PluginUsage setCompletionTokens(Integer completionTokens) {
        this.completionTokens = completionTokens;
        return this;
    }

    public Integer getTotalTokens() {
        return totalTokens;
    }

    public PluginUsage setTotalTokens(Integer totalTokens) {
        this.totalTokens = totalTokens;
        return this;
    }
}
