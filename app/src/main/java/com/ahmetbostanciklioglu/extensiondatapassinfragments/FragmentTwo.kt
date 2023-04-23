package com.ahmetbostanciklioglu.extensiondatapassinfragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ahmetbostanciklioglu.extensiondatapassinfragments.databinding.FragmentTwoBinding

class FragmentTwo : Fragment() {

    private var binding: FragmentTwoBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentTwoBinding.inflate(inflater)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        arguments?.let {
            binding?.myEditTextView?.text = it.getString("editTextKey")
        }
    }

}