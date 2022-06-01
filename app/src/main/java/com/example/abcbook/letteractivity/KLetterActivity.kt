package com.example.abcbook.letteractivity

import android.os.Bundle


class KLetterActivity : LetterActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        super.setNextButtonClickListener(LLetterActivity::class.java)
    }
}