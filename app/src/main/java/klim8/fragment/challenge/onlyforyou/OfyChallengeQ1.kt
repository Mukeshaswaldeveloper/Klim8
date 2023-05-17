package klim8.fragment.challenge.onlyforyou

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentTransaction
import com.inmortal.klim8.R
import com.inmortal.klim8.databinding.FragmentOfyChallengeQ1Binding

class OfyChallengeQ1 : Fragment() {

    lateinit var binding: FragmentOfyChallengeQ1Binding
    lateinit var ft:FragmentTransaction

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=FragmentOfyChallengeQ1Binding.inflate(inflater,container,false)

        onclick()
        manageVisiblity()
        return binding.root

    }
    private fun onclick(){
        binding.btnOfyQuestion1.setOnClickListener {
      ft=requireFragmentManager().beginTransaction()
            ft.add(R.id.frame_challenge_Ofy,OfyChallengeQ2())
            ft.commit()
        }
    }
    private fun manageVisiblity(){
        binding.ofyQ1Option1.setOnClickListener {
            binding.imgOfyQ1SelectedOption1.visibility=View.VISIBLE
            binding.imgOfyQ1SelectedOption2.visibility=View.INVISIBLE
            binding.imgOfyQ1SelectedOption3.visibility=View.INVISIBLE

        }
        binding.ofyQ1Option2.setOnClickListener {
            binding.imgOfyQ1SelectedOption2.visibility=View.VISIBLE
            binding.imgOfyQ1SelectedOption1.visibility=View.INVISIBLE
            binding.imgOfyQ1SelectedOption3.visibility=View.INVISIBLE

        }
        binding.ofyQ1Option3.setOnClickListener {
            binding.imgOfyQ1SelectedOption3.visibility=View.VISIBLE
            binding.imgOfyQ1SelectedOption2.visibility=View.INVISIBLE
            binding.imgOfyQ1SelectedOption1.visibility=View.INVISIBLE

        }



    }


}