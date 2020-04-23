package apps.studios.bt.studentlink.view.auth


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import apps.studios.bt.studentlink.R


class SignUpStep1 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.auth_sign_up_step1, container, false)
    }

    companion object {
        @JvmStatic
        fun newInstance(): Fragment =
            SignUpStep1()
    }
}


