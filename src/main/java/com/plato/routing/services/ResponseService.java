package com.plato.routing.services;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Future;

public interface ResponseService {
    Map<Long, Future> map = new HashMap<>();
    public void sendRequest(String key, Object message);
    public void setResponse();
}
