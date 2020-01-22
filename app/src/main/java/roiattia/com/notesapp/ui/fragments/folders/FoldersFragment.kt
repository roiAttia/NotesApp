package roiattia.com.notesapp.ui.fragments.folders

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import roiattia.com.notesapp.R

class FoldersFragment : Fragment() {

    companion object {
        fun newInstance() = FoldersFragment()
    }

    private lateinit var viewModel: FoldersViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_folders, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(FoldersViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
