package com.example.abcbook.util

import android.content.Context
import android.widget.Toast

object Helper {
    fun showPhoneMessage(context: Context?, msg: String, phoneNum: Any?) {
        if (phoneNum != null) {
            Toast.makeText(context, "$msg: $phoneNum", Toast.LENGTH_SHORT).show()
        }
    }

    fun showToast(context: Context?, msg: Any?) {
        if (msg != null) {
            Toast.makeText(context, msg.toString(), Toast.LENGTH_SHORT).show()
        }
    }

}
