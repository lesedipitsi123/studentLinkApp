package apps.studios.bt.studentlink.view.profile.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import apps.studios.bt.studentlink.R
import apps.studios.bt.studentlink.model.Course
import kotlinx.android.synthetic.main.item_course.view.*

class CourseAdapter(val context: Context, val listCourses: MutableList<Course>): RecyclerView.Adapter<CourseAdapter.CourseViewHolder>(){

    init {
        hasStableIds()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CourseViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_course, parent, false)

        return CourseViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listCourses.size
    }

    override fun onBindViewHolder(holder: CourseViewHolder, position: Int) {

        holder.courseName.text = listCourses[position].courseName
        holder.institutionName.text = listCourses[position].university
    }

    inner class CourseViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
    {
        val courseName = itemView.course_name
        val institutionName = itemView.institution_name
    }
}
