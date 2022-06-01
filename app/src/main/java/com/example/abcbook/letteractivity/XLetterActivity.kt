package com.example.abcbook.letteractivity

import android.os.Bundle


class XLetterActivity : LetterActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        super.setNextButtonClickListener(YLetterActivity::class.java)
    }
}