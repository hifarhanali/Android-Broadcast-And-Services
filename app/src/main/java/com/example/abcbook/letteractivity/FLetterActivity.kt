package com.example.abcbook.letteractivity

import android.os.Bundle


class FLetterActivity : LetterActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        super.setNextButtonClickListener(GLetterActivity::class.java)
    }
}