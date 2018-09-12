/*
 * Copyright (C) 2018 Chatopera Inc, <https://www.chatopera.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.chatopera.cc.disruptor.chatbot;

import com.chatopera.cc.app.service.hibernate.BaseService;
import com.chatopera.cc.event.UserEvent;

public class ChatbotEvent<S> implements UserEvent {

    private S data;
    private BaseService<?> crudRes;
    private String eventype;

    public ChatbotEvent(S data, BaseService<?> crudRes, String eventype) {
        this.data = data;
        this.crudRes = crudRes;
        this.eventype = eventype;
    }

    public S getData() {
        return data;
    }

    public void setData(S data) {
        this.data = data;
    }

    public BaseService<?> getCrudRes() {
        return crudRes;
    }

    public void setCrudRes(BaseService<?> crudRes) {
        this.crudRes = crudRes;
    }

    public String getEventype() {
        return eventype;
    }

    public void setEventype(String eventype) {
        this.eventype = eventype;
    }
}