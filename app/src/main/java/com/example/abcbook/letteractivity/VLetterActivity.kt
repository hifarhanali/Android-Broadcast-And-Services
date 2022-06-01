package com.example.abcbook.letteractivity

import android.os.Bundle


class VLetterActivity : LetterActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        super.setNextButtonClickListener(WLetterActivity::class.java)
    }
}