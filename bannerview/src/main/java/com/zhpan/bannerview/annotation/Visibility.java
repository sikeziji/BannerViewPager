package com.zhpan.bannerview.annotation;

import android.view.View;

import androidx.annotation.IntDef;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static com.zhpan.bannerview.constants.IndicatorGravity.CENTER;
import static com.zhpan.bannerview.constants.IndicatorGravity.END;
import static com.zhpan.bannerview.constants.IndicatorGravity.START;


/**
 * <pre>
 *   Created by zhangpan on 2019-11-12.
 * </pre>
 */
@IntDef({View.VISIBLE, View.INVISIBLE, View.GONE})
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.PARAMETER)
public @interface Visibility {

}
