package com.example.android_lifecycle

import android.content.Context
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatEditText

class JordieeEditText : AppCompatEditText {
    constructor(context: Context) : super(context) {
//        init()
    }

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
//        init()
    }

    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {
//        init()
    }
    init {
        this.hint = "Welcome to Jordiee's Edit text"
    }
}