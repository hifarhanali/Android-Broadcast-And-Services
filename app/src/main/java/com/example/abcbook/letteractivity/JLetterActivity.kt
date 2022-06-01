package com.example.abcbook.letteractivity

import android.os.Bundle


class JLetterActivity : LetterActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        super.setNextButtonClickListener(KLetterActivity::class.java)
    }
}