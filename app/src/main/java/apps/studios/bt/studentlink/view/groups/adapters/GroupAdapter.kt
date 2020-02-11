package apps.studios.bt.studentlink.view.groups.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import apps.studios.bt.studentlink.R
import apps.studios.bt.studentlink.model.Group
import kotlinx.android.synthetic.main.item_group.view.*

class GroupAdapter(val context: Context, private val listGroups: MutableList<Group>) :
    RecyclerView.Adapter<GroupAdapter.GroupViewHolder>() {

    init {
        hasStableIds()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GroupViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_group, parent, false)

        return GroupViewHolder(view)
    }

    override fun getItemCount() = listGroups.size

    override fun onBindViewHolder(holder: GroupViewHolder, position: Int) {

        val item = listGroups[position]
        holder.courseName.text = item.course.courseName
        holder.memberCount.text = "${item.no_members} members"
        holder.institution_name.text = item.course.university
    }

    inner class GroupViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val courseName = itemView.course_name
        val memberCount = itemView.member_count
        val institution_name = itemView.institution_name
    }
}