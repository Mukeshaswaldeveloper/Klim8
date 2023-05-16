package klim8.fragment.challenge.waste

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentTransaction
import com.inmortal.klim8.R
import com.inmortal.klim8.databinding.FragmentWasteQuestion3KotlinBinding


class WasteFragmentQuestion3Kotlin : Fragment() {
    lateinit var binding: FragmentWasteQuestion3KotlinBinding
    lateinit var ft:FragmentTransaction


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding= FragmentWasteQuestion3KotlinBinding.inflate(inflater,container,false)
        onclick()
        manageVisiblity()
        return binding.root
    }

    private fun onclick(){
        binding.btnWasteQuestion3.setOnClickListener {
            ft=requireFragmentManager().beginTransaction()
            ft.add(R.id.frame_challenge_waste,WasteFragmentQuestion4Kotlin())
            ft.commit()
        }
    }
    private fun manageVisiblity(){
        binding.WasteQ3Option1.setOnClickListener {
            binding.imgWasteQ3SelectedOption1.visibility=View.VISIBLE
            binding.imgWasteQ3SelectedOption2.visibility=View.INVISIBLE
            binding.imgWasteQ3SelectedOption3.visibility=View.INVISIBLE

        }
        binding.WasteQ3Option2.setOnClickListener {
            binding.imgWasteQ3SelectedOption2.visibility=View.VISIBLE
            binding.imgWasteQ3SelectedOption1.visibility=View.INVISIBLE
            binding.imgWasteQ3SelectedOption3.visibility=View.INVISIBLE

        }
        binding.WasteQ3Option3.setOnClickListener {
            binding.imgWasteQ3SelectedOption3.visibility=View.VISIBLE
            binding.imgWasteQ3SelectedOption2.visibility=View.INVISIBLE
            binding.imgWasteQ3SelectedOption1.visibility=View.INVISIBLE

        }



    }


}