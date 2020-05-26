package br.com.kelvinfaria.bottomnav.fragments.main_fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import br.com.kelvinfaria.bottomnav.R
import kotlinx.android.synthetic.main.fragment_main.*

class MainFragment : Fragment() {

    private val homeFragment = HomeFragment()
    private val dashboardFragment = DashboardFragment()
    private val notificationFragment = NotificationFragment()
    var activeFragment: Fragment = homeFragment

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupBottomNav()
    }

    private fun setupBottomNav() {
        val cfm = childFragmentManager

        cfm.beginTransaction().add(R.id.mainFragmentContainer, homeFragment,"1").commit()
        cfm.beginTransaction().add(R.id.mainFragmentContainer, dashboardFragment,"2").hide(dashboardFragment).commit()
        cfm.beginTransaction().add(R.id.mainFragmentContainer, notificationFragment,"3").hide(notificationFragment).commit()

        mainBottomNavigation.selectedItemId = R.id.navigation_home

        mainBottomNavigation.setOnNavigationItemSelectedListener {item ->
            when (item.itemId) {
                R.id.navigation_home -> {
                    cfm.beginTransaction().hide(activeFragment).show(homeFragment).commit()
                    activeFragment = homeFragment
                }
                R.id.navigation_dashboard -> {
                    cfm.beginTransaction().hide(activeFragment).show(dashboardFragment).commit()
                    activeFragment = dashboardFragment
                }
                R.id.navigation_notifications -> {
                    cfm.beginTransaction().hide(activeFragment).show(notificationFragment).commit()
                    activeFragment = notificationFragment
                }
            }
             true
        }
    }


}
