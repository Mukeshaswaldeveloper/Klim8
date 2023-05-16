package klim8.fragment.challenge.waste

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentTransaction
import com.inmortal.klim8.R
import com.inmortal.klim8.databinding.FragmentWasteQuestion6KotlinBinding

class WasteFragmentQuestion6Kotlin : Fragment() {
    lateinit var binding: FragmentWasteQuestion6KotlinBinding
    lateinit var ft:FragmentTransaction



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=FragmentWasteQuestion6KotlinBinding.inflate(inflater,container,false)
        onclick()
        manageVisiblity()

        return binding.root

    }
    private fun onclick(){
        binding.btnWasteQuestion6.setOnClickListener {
            ft=requireFragmentManager().beginTransaction()
            ft.add(R.id.frame_challenge_waste,WasteFragmentQuestion7Kotlin())
            ft.commit()
        }
    }
    private fun manageVisiblity(){
        binding.wasteQ6Option1.setOnClickListener {
            binding.imgWasteQ6SelectedOption1.visibility=View.VISIBLE
            binding.imgWasteQ6SelectedOption2.visibility=View.INVISIBLE
            binding.imgWasteQ6SelectedOption3.visibility=View.INVISIBLE

        }
        binding.wasteQ6Option2.setOnClickListener {
            binding.imgWasteQ6SelectedOption2.visibility=View.VISIBLE
            binding.imgWasteQ6SelectedOption1.visibility=View.INVISIBLE
            binding.imgWasteQ6SelectedOption3.visibility=View.INVISIBLE

        }
        binding.wasteQ6Option3.setOnClickListener {
            binding.imgWasteQ6SelectedOption3.visibility=View.VISIBLE
            binding.imgWasteQ6SelectedOption2.visibility=View.INVISIBLE
            binding.imgWasteQ6SelectedOption1.visibility=View.INVISIBLE

        }



    }


}