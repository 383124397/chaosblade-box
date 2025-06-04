package com.alibaba.chaosblade.box.common.experiment.task.flow.util;

import java.util.function.Supplier;

/**
 * @author haibin
 *
 *
 */
public interface Settings {

    boolean containsKey(String key);

    Float getAsFloat(String key);

    Float getAsFloat(String key, Float defaultValue);

    Integer getAsInteger(String key);

    Integer getAsInteger(String key, Integer defaultValue);

    String getAsString(String key, String defaultValue);

    String getAsString(String key);

    Boolean getAsBoolean(String key, Boolean defaultValue);

    <T> T getObject(String key, Class<T> tClass, Supplier<T> supplierIfNotExist);

    Boolean getAsBoolean(String key);

    <T> T getObject(String key, Class<T> tClass);

    void add(String key, Object value);

    void remove(String key);
}


