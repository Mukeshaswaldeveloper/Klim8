package klim8.fragment.challenge.onlyforyou

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentTransaction
import com.inmortal.klim8.R
import com.inmortal.klim8.databinding.FragmentOfyChallengeQ2Binding


class OfyChallengeQ2 : Fragment() {
    lateinit var binding:FragmentOfyChallengeQ2Binding
    lateinit var ft:FragmentTransaction

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=FragmentOfyChallengeQ2Binding.inflate(inflater,container,false)
        onclick()
        manageVisiblity()
        return binding.root

    }
    private fun onclick(){
        binding.btnOfyQuestion2.setOnClickListener {
            ft=requireFragmentManager().beginTransaction()
            ft.add(R.id.frame_challenge_Ofy,OfyChallengeQ3())
            ft.commit()

        }
    }
    private fun manageVisiblity(){
        binding.ofyQ2Option1.setOnClickListener {
            binding.imgOfyQ2SelectedOption1.visibility=View.VISIBLE
            binding.imgOfyQ2SelectedOption2.visibility=View.INVISIBLE
            binding.imgOfyQ2SelectedOption3.visibility=View.INVISIBLE

        }
        binding.ofyQ2Option2.setOnClickListener {
            binding.imgOfyQ2SelectedOption2.visibility=View.VISIBLE
            binding.imgOfyQ2SelectedOption1.visibility=View.INVISIBLE
            binding.imgOfyQ2SelectedOption3.visibility=View.INVISIBLE

        }
        binding.ofyQ2Option3.setOnClickListener {
            binding.imgOfyQ2SelectedOption3.visibility=View.VISIBLE
            binding.imgOfyQ2SelectedOption2.visibility=View.INVISIBLE
            binding.imgOfyQ2SelectedOption1.visibility=View.INVISIBLE

        }



    }


}