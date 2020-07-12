package kr.co.tjoeun.lifecycle_20200712

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()

        Log.d("메인화면", "onCreate 실행")
    }

    override fun setupEvents() {

        moveBtn.setOnClickListener {
            val myIntent = Intent(mContext, OtherActivity::class.java)
            stratActivity(myIntent)
        }

    }

    override fun setValues() {

    }

}