package br.com.kelvinfaria.bottomnav.fragments.main_fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import br.com.kelvinfaria.bottomnav.R
import kotlinx.android.synthetic.main.fragment_dashboard.*

class DashboardFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_dashboard, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        dashboardNumberTextView.text = "0"
        dashboardIncreaseButton.setOnClickListener {
            val current = dashboardNumberTextView.text.toString().toInt()
            dashboardNumberTextView.text = (current + 1).toString()
        }
    }

}
