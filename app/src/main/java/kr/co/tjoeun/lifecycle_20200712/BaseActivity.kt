package kr.co.tjoeun.lifecycle_20200712

import androidx.appcompat.app.AppCompatActivity

open class BaseActivity {

    abstract class BaseActivity : AppCompatActivity() {

        val mContext = this

        abstract fun setupEvents()
        abstract fun setValues()
    }
