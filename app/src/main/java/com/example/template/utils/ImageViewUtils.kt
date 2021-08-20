package com.example.template.utils

import android.graphics.drawable.Drawable
import android.widget.ImageView
import com.example.template.utils.ViewExtensions.goneIf

object ImageViewExtensions {

    /**
     * Extension-функции для работы с ImageView.
     */

    /**
     * Установка изображения из ресурсов или скрытие [ImageView] если ([drawable] == null).
     */
    fun ImageView.setImageDrawableOrGone(drawable: Drawable?) {
        goneIf(drawable == null)
        setImageDrawable(drawable)
    }
}