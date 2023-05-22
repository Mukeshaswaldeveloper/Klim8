package klim8.fragment.deeds

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentTransaction
import com.inmortal.klim8.R
import com.inmortal.klim8.databinding.FragmentOnGoingAdapterBinding
import klim8.adapter.OnGoingDeedAdapter


class OnGoingFragment : Fragment() {
lateinit var binding:FragmentOnGoingAdapterBinding
lateinit var fragReplace: FragmentTransaction

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=FragmentOnGoingAdapterBinding.inflate(layoutInflater,container,false)
         binding.recyclerOngoing.adapter=OnGoingDeedAdapter(requireContext())
        return binding.root
    }


}