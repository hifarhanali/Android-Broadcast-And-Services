package com.example.abcbook.letteractivity

import android.os.Bundle


class DLetterActivity : LetterActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        super.setNextButtonClickListener(ELetterActivity::class.java)
    }
}