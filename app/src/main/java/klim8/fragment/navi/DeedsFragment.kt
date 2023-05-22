package klim8.fragment.navi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentTransaction
import com.inmortal.klim8.R
import com.inmortal.klim8.databinding.FragmentDeedsBinding
import klim8.fragment.deeds.CompletedDeeds
import klim8.fragment.deeds.OnGoingFragment
import klim8.fragment.reward.RewardHistoryFragment


class DeedsFragment : Fragment() {
    lateinit var binding: FragmentDeedsBinding
    lateinit var fragReplace: FragmentTransaction

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDeedsBinding.inflate(layoutInflater, container, false)
        fragReplace(OnGoingFragment())
        onClick()
        return binding.root
    }

    private fun onClick() {
        binding.tvOngoing.setOnClickListener{
            fragReplace(OnGoingFragment())
            binding.imgBarComplete.visibility=View.INVISIBLE
            binding.imgBarOngoing.visibility=View.VISIBLE
        }
        binding.tvCompletedDeed.setOnClickListener {
            fragReplace(CompletedDeeds())
            binding.imgBarOngoing.visibility=View.INVISIBLE
            binding.imgBarComplete.visibility=View.VISIBLE
        }



    }

    private fun fragReplace(fragment: Fragment) {
        fragReplace = requireFragmentManager().beginTransaction()
        fragReplace.replace(R.id.frame_ongoing_deeds, fragment)
        fragReplace.commit()


    }


}