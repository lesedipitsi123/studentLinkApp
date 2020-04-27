package apps.studios.bt.studentlink.view.auth

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import apps.studios.bt.studentlink.R
import apps.studios.bt.studentlink.view.search.SearchActivity
import kotlinx.android.synthetic.main.auth_sign_up_step2.view.*

/**
 * Final step of user registration
 *
 * */
class SignUpStep2 : Fragment() {

    private lateinit var userUniversityName : String
    private lateinit var userFullName : String

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        userUniversityName = arguments?.getString("user_university_name")!!
        userFullName = arguments?.getString("user_university_name")!!
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val v= inflater.inflate(R.layout.auth_sign_up_step2, container, false)
        configUI(v)
        return v
    }

    /**
     * Configure screen UI elements
     * */
    private fun configUI(v : View)
    {
        addClickListeners(v)
    }

    /**
     * Setup click listeners
     * */
    private fun addClickListeners(view : View)
    {
        // finish user sign up
        view.signUp.setOnClickListener {
            validateForm(view)
        }

        // show university dialog
        view.ed_select_university.setOnClickListener{
            displayUniversities()
        }

        // goto course selection screen
        view.btnAddCourse.setOnClickListener{
            val intent = Intent(activity, SearchActivity::class.java)
            intent.putExtra("university_name", userUniversityName)
            startActivity(intent)
        }
    }

    /**
     * Validate all fields are filled
     * */
    private fun validateForm(v : View)
    {

    }

    /**
     * Display dialog sheet for
     * available universities
     * */
    private fun displayUniversities()
    {

    }

}
