package klim8.fragment.challenge.onlyforyou

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentTransaction
import com.inmortal.klim8.R
import com.inmortal.klim8.databinding.FragmentOfyChallengeQ3Binding
import klim8.activities.QuesAnsActivity

class OfyChallengeQ3 : Fragment() {
    lateinit var binding: FragmentOfyChallengeQ3Binding
    lateinit var ft: FragmentTransaction


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentOfyChallengeQ3Binding.inflate(inflater, container, false)
        onclick()
        manageVisiblity()
        return binding.root

    }
    private fun manageVisiblity(){
        binding.ofyQ3Option1.setOnClickListener {
            binding.imgOfyQ3SelectedOption1.visibility=View.VISIBLE
            binding.imgOfyQ3SelectedOption2.visibility=View.INVISIBLE
            binding.imgOfyQ3SelectedOption3.visibility=View.INVISIBLE

        }
        binding.ofyQ3Option2.setOnClickListener {
            binding.imgOfyQ3SelectedOption2.visibility=View.VISIBLE
            binding.imgOfyQ3SelectedOption1.visibility=View.INVISIBLE
            binding.imgOfyQ3SelectedOption3.visibility=View.INVISIBLE

        }
        binding.ofyQ3Option3.setOnClickListener {
            binding.imgOfyQ3SelectedOption3.visibility=View.VISIBLE
            binding.imgOfyQ3SelectedOption2.visibility=View.INVISIBLE
            binding.imgOfyQ3SelectedOption1.visibility=View.INVISIBLE

        }



    }
    private fun onclick(){
        binding.btnOfyQuestion3.setOnClickListener {
            startActivity(Intent(context, QuesAnsActivity::class.java))
        }
    }
}
