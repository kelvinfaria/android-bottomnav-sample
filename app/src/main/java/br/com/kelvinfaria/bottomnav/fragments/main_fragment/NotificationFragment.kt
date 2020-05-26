package br.com.kelvinfaria.bottomnav.fragments.main_fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import br.com.kelvinfaria.bottomnav.R
import kotlinx.android.synthetic.main.fragment_notification.*


class NotificationFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_notification, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        notificationNumberTextView.text = "0"
        notificationIncreaseButton.setOnClickListener {
            val current = notificationNumberTextView.text.toString().toInt()
            notificationNumberTextView.text = (current + 1).toString()
        }
    }

}
