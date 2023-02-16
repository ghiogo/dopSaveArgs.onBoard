package com.example.dopsaveargsonboard.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.dopsaveargsonboard.R
import com.example.dopsaveargsonboard.databinding.FragmentMainBinding

class MainFragment : Fragment() {

    lateinit var binding: FragmentMainBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMainBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setName()
    }

    private fun setName() {
        binding.btnIm.setOnClickListener{
            val name = binding.etEdittext.text
            val hello = "Привет, $name"

            findNavController().navigate(MainFragmentDirections.actionMainFragmentToSecondFragment(hello))
        }
    }
}