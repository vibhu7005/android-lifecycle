package com.example.android_lifecycle

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

class ConfigChangeFragment : Fragment() {

    var btnSubmit: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_config_change, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        btnSubmit = view.findViewById(R.id.buttonSubmit)
        super.onViewCreated(view, savedInstanceState)
        val activity = requireActivity()
        btnSubmit?.setOnClickListener {
            if(activity is DataSubmittedCallback) {
                activity.onDataSubmitted()
            }
        }
    }

    companion object {
        fun newInstance() =
            ConfigChangeFragment()
    }

    interface DataSubmittedCallback {
        fun onDataSubmitted()
    }
}