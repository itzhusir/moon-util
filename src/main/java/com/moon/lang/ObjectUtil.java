package com.moon.lang;

import java.util.Objects;

import static com.moon.lang.ThrowUtil.noInstanceError;

/**
 * @author benshaoye
 * @date 2018/9/11
 */
public final class ObjectUtil {
    private ObjectUtil() {
        noInstanceError();
    }

    public static <T> T defaultIfNull(T obj, T defaultValue) {
        return obj == null ? defaultValue : obj;
    }

    public static boolean equals(Object o1, Object o2) {
        return Objects.equals(o1,o2);
    }
}
