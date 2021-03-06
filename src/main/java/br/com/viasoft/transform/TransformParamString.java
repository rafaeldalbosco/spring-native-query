package br.com.viasoft.transform;

import org.apache.commons.lang3.StringUtils;

import java.util.function.Function;

abstract class TransformParamString {

    Object executeWhenValueIsNotBlank(Object value, Function<Object, Object> function) {
        if (value != null && StringUtils.isNotBlank(value.toString())) {
            return function.apply(value);
        }
        return null;
    }

}
