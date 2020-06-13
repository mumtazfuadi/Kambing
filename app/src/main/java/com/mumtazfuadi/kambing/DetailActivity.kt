package com.mumtazfuadi.kambing

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBar
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_IMG = "extra_img"
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_DETAIL = "extra_detail"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        setActionBarTitle("Detail")

        showGoatDetail()
    }

    private fun showGoatDetail() {
        tv_item_name.setText(intent.getStringExtra(EXTRA_NAME))
        tv_item_detail.setText(intent.getStringExtra(EXTRA_DETAIL))

        Glide.with(this)
            .load(intent.getIntExtra(EXTRA_IMG, 0))
            .apply((RequestOptions().placeholder(R.color.light_gray)))
            .into(img_item_photo)
    }

    private fun setActionBarTitle(title: String) {
        if (supportActionBar != null) {
            (supportActionBar as ActionBar).title = title
        }
    }
}