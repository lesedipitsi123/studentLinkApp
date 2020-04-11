package apps.studios.bt.studentlink.view.groups


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import apps.studios.bt.studentlink.R

class Documents : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val v =inflater.inflate(R.layout.fragment_documents, container, false)

        return v;
    }



}
