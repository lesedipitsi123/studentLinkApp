package apps.studios.bt.studentlink.view.search

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import apps.studios.bt.studentlink.R
import kotlinx.android.synthetic.main.activity_search.*

/**
 * Search Courses of selected universities
 * */
class SearchActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search)

        val university_name : String? = intent.getStringExtra("university_name")
        this.selected_university.text = university_name
        configUI()
    }

    /**
     * Configure UI elements
     * */
    private fun configUI()
    {
      addClickListeners()
    }

    /**
     * Setup click listeners
     * */
    private fun addClickListeners()
    {

    }

}
