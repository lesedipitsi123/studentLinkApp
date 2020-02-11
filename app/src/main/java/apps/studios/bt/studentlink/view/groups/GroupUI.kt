package apps.studios.bt.studentlink.view.groups


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

import apps.studios.bt.studentlink.R
import apps.studios.bt.studentlink.model.Course
import apps.studios.bt.studentlink.model.Group
import apps.studios.bt.studentlink.view.groups.adapters.GroupAdapter
import kotlinx.android.synthetic.main.fragment_group_ui.view.*

class GroupUI : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val v= inflater.inflate(R.layout.fragment_group_ui, container, false)
        initViews(v)
        return v
    }

    private fun initViews(v: View)
    {
        val demoAdapter = GroupAdapter(this@GroupUI.context!!, demoGroups())
        v.listGroups.apply {
            layoutManager = GridLayoutManager(this@GroupUI.context, 2, RecyclerView.VERTICAL, false)
            hasFixedSize()
            adapter = demoAdapter
        }
        v.number_of_groups.text = "${demoAdapter.itemCount} groups"
    }

    private fun demoGroups() =
        mutableListOf(Group(Course("English Literature 201", "University of Pretoria"), 15),
            Group(Course("Accounting 31102", "University of Pretoria"), 26),
            Group(Course("Human Kinetics Ergonomics", "University of Pretoria"), 6)
            )
    companion object {

        @JvmStatic
        fun newInstance() =
            GroupUI()

    }
}
