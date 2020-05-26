package br.com.kelvinfaria.bottomnav.fragments.main_fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

import br.com.kelvinfaria.bottomnav.R
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        homeNumberTextView.text = "0"
        homeIncreaseButton.setOnClickListener {
            val current = homeNumberTextView.text.toString().toInt()
            homeNumberTextView.text = (current + 1).toString()
        }
    }

}
