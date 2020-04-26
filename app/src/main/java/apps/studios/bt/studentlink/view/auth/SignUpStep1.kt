package apps.studios.bt.studentlink.view.auth


import android.os.Bundle
import android.text.TextUtils
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import apps.studios.bt.studentlink.R
import apps.studios.bt.studentlink.utilities.AppConstants
import kotlinx.android.synthetic.main.auth_sign_up_step1.*
import kotlinx.android.synthetic.main.auth_sign_up_step1.view.*

/**
 * First step auth screen
 * */
class SignUpStep1 : Fragment() {

    private var userUniversityName: String? = null
    private var userFullName: String? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val v = inflater.inflate(R.layout.auth_sign_up_step1, container, false)
        configUI(v)
        return v
    }

    /***
     * Configure UI screen
     * */
    private fun configUI(v: View) {
        addClickListeners(v)
    }

    /*
    * Setup Click listeners
    * */
    private fun addClickListeners(view: View) {

        view.nextScreen.setOnClickListener {
            //        Send user to next screen only if valid
            if (validForm(view)) {
                userUniversityName?.let { value -> detectUniversity(value) }
                val args = bundleOf(
                    "user_university_name" to userUniversityName,
                    "user_full_name" to userFullName
                )
                it.findNavController().navigate(R.id.step2, args)
            } else AppConstants.toast_alert(getString(R.string.error_form_invalid), activity)

        }
    }

    /**
     * Validate all fields are filled
     * correctly
     * */
    private fun validForm(v: View): Boolean {
        userUniversityName = v.ed_student_email.text?.trim().toString()
        userFullName = v.ed_full_name.text?.trim().toString()
        return if (!TextUtils.isEmpty(userUniversityName) && !TextUtils.isEmpty(userFullName)) {
    //            Check if user email is valid
            if (!android.util.Patterns.EMAIL_ADDRESS.matcher(userUniversityName).matches()) {
                true
            } else {
                ed_student_email.error = getString(R.string.error_student_email)
                false
            }
        } else
            false
    }


    /**
     * Detect user university from student email
     * */
    private fun detectUniversity(stu_email: String) {

        if (stu_email.contains(AppConstants.RU_EMAIL))
            userUniversityName = getString(R.string.uni_ru)
        else if (stu_email.contains(AppConstants.UP_EMAIL))
            userUniversityName = getString(R.string.uni_up)
        else
            userUniversityName = getString(R.string.uni_uct)
    }

    companion object {
        @JvmStatic
        fun newInstance(): Fragment =
            SignUpStep1()
    }
}


