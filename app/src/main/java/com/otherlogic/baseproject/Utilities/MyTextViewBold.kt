package com.otherlogic.pregokotlin.Utilities

import android.content.Context
import android.graphics.Typeface
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatTextView

/**this class set custom font for all textviews  **/

class MyTextViewBold : AppCompatTextView {
    var Lang: String?

    constructor(context: Context?, attrs: AttributeSet?, defStyle: Int) : super(
        context!!,
        attrs,
        defStyle
    ) {
        Lang =  SharedPrefHelper.getSharedString(
            context!!,
            SharedPrefHelper.SHARED_PREFERENCE_LANGUAGE_KEY
        )
        init()
    }

    constructor(context: Context?, attrs: AttributeSet?) : super(context!!, attrs) {
        Lang = SharedPrefHelper.getSharedString(
            context!!,
            SharedPrefHelper.SHARED_PREFERENCE_LANGUAGE_KEY
        )
        init()
    }

    constructor(context: Context?) : super(context!!) {
        Lang =SharedPrefHelper.getSharedString(
            context!!,
            SharedPrefHelper.SHARED_PREFERENCE_LANGUAGE_KEY
        )
        init()
    }

    private fun init() {
        if (!isInEditMode()) {
            if (Lang == "ar") {
                val tf = Typeface.createFromAsset(getContext().getAssets(), "fonts/kufibold.ttf")
                setTypeface(tf)
            } else {
                val tf = Typeface.createFromAsset(getContext().getAssets(), "fonts/robotobold.ttf")
                setTypeface(tf)
            }
        }
    }
}