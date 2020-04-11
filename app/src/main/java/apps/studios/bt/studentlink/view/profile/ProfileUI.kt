package apps.studios.bt.studentlink.view.profile


import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import apps.studios.bt.studentlink.R
import apps.studios.bt.studentlink.model.Course
import apps.studios.bt.studentlink.view.profile.adapters.CourseAdapter
import kotlinx.android.synthetic.main.fragment_profile_ui.view.*

class ProfileUI : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val v = inflater.inflate(R.layout.fragment_profile_ui, container, false)
        initViews(v)
        return v
    }

    private fun initViews(view: View) {
        view.listCourses.apply {
            layoutManager =
                LinearLayoutManager(this@ProfileUI.context, RecyclerView.VERTICAL, false)
            hasFixedSize()
            isNestedScrollingEnabled = true
            adapter = this@ProfileUI.context?.let { CourseAdapter(it, demoCourses()) }
        }
        view.editBtn.setOnClickListener { context?.startActivity(Intent(this@ProfileUI.context, EditProfile::class.java)) }
    }

    private fun demoCourses() = mutableListOf(
        Course("Biochemistry", "University of Pretoria"),
        Course("Applied Mathematics", "University of Pretoria"),
        Course("Computer Science", "University of Pretoria"),
        Course("Physics", "University of Pretoria")
    )

    companion object {
        @JvmStatic
        fun newInstance() =
            ProfileUI()
    }

}
