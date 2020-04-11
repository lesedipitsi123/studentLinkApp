package apps.studios.bt.studentlink.view.home

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import apps.studios.bt.studentlink.R
import apps.studios.bt.studentlink.view.home.adapters.TabNavigationAdapter
import apps.studios.bt.studentlink.view.search.SearchActivity
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        initViews()
    }

    private fun initViews() {
        viewPager?.offscreenPageLimit = 2
        viewPager?.pageMargin = 24
        viewPager?.adapter = TabNavigationAdapter(supportFragmentManager)

        tabLayout?.addTab(tabLayout.newTab())
        tabLayout?.addTab(tabLayout.newTab())

        searchBtn?.setOnClickListener { startActivity(Intent(this@HomeActivity, SearchActivity::class.java)) }
        tabLayout?.setupWithViewPager(viewPager)
    }
}
