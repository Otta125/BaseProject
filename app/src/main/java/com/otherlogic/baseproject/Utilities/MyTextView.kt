package com.otherlogic.pregokotlin.Utilities

import android.content.Context
import android.graphics.Typeface
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatTextView
import com.otherlogic.pregokotlin.Utilities.SharedPrefHelper.Companion.getSharedString

/**this class set custom font for all textviews  **/


class MyTextView : AppCompatTextView {
    var Lang: String?

    constructor(context: Context?, attrs: AttributeSet?, defStyle: Int) : super(
        context!!, attrs, defStyle
    ) {
        Lang = getSharedString(
            context,
            SharedPrefHelper.SHARED_PREFERENCE_LANGUAGE_KEY
        )
        init()
    }

    constructor(context: Context?, attrs: AttributeSet?) : super(
        context!!, attrs
    ) {
        Lang = getSharedString(
            context,
            SharedPrefHelper.SHARED_PREFERENCE_LANGUAGE_KEY
        )
        init()
    }

    constructor(context: Context?) : super(context!!) {
        Lang = getSharedString(
            context,
            SharedPrefHelper.SHARED_PREFERENCE_LANGUAGE_KEY
        )
        init()
    }

    private fun init() {
        if (!isInEditMode) {
            typeface = if (Lang == "ar") {
                val tf = Typeface.createFromAsset(context.assets, "fonts/kufireg.ttf")
                tf
            } else {
                val tf = Typeface.createFromAsset(context.assets, "fonts/robotoregular.ttf")
                tf
            }
        }
    }
}
