package com.otherlogic.baseproject

import User
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.otherlogic.baseproject.Utilities.ConnectionDetector
import com.otherlogic.pregokotlin.Utilities.SharedPrefHelper.Companion.getSharedOBJECT
import com.otherlogic.pregokotlin.Utilities.SharedPrefHelper.Companion.setSharedOBJECT
import com.otherlogic.pregokotlin.Utilities.languagehelper.LanguageHelper


class MainActivity : AppCompatActivity() {


    var context: Context? = null
    var user: User? = null
    var MyUser: User? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        user = User(1, "mahmoud", "m@m.com", 0, "1sdfg2sd5fg")

        context = this
        setSharedOBJECT(context as MainActivity, "haha", user)
        MyUser = getSharedOBJECT(context as MainActivity, "haha", user) as User?


        Log.e("NAMMMME", MyUser?.user_name ?: "Not Found")

        var status = if ( ConnectionDetector.checkForInternet(context as MainActivity) ) true else false
        Log.e("STATus: ", status.toString())

        LanguageHelper.initLanguage(context as MainActivity,true )

    }
}