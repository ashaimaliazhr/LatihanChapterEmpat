package asha.binar.latihanchapterempat.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.recyclerview.widget.LinearLayoutManager
import asha.binar.latihanchapterempat.MainViewModel
import asha.binar.latihanchapterempat.databinding.FragmentListBinding


class ListFragment: Fragment() {
    private var _binding : FragmentListBinding? = null
    private val binding get() = _binding!!
    private val model: MainViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        model.textAlphabet.observe(viewLifecycleOwner){ alphabet->
            val adapter = ListAdapter(alphabet)
            binding.rvList.layoutManager = LinearLayoutManager(activity, LinearLayoutManager.VERTICAL, false)
            binding.rvList.adapter=adapter
        }
    }

}