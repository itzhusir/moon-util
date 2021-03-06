package com.moon.lang;

import static com.moon.lang.CharUtil.toCharValue;
import static com.moon.lang.ThrowUtil.noInstanceError;

/**
 * @author benshaoye
 * @date 2018/9/11
 */
public final class CharacterUtil {
    private CharacterUtil() {
        noInstanceError();
    }

    /**
     * @param value
     * @return
     * @see IntUtil#toIntValue(Object)
     */
    public static final Character toCharacter(Object value) {
        if (value == null) {
            return null;
        }
        if (value instanceof Character) {
            return (Character) value;
        }
        if (value instanceof Number) {
            return (char) ((Number) value).intValue();
        }
        if (value instanceof CharSequence) {
            return toCharValue(value.toString());
        }
        if (value instanceof Boolean) {
            boolean bool = (boolean) value;
            return (char) (bool ? 1 : 0);
        }
        try {
            Object firstItem = SupportUtil.onlyOneItemOrSize(value);
            return toCharValue(firstItem);
        } catch (Exception e) {
            throw new IllegalArgumentException(String.format("Can not cast to Character of: %s", value), e);
        }
    }
}
