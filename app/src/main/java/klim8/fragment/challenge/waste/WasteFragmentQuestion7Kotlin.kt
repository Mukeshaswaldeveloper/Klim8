package klim8.fragment.challenge.waste

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentTransaction
import com.inmortal.klim8.R
import com.inmortal.klim8.databinding.FragmentWasteQuestion7Binding
import com.inmortal.klim8.databinding.FragmentWasteQuestion7KotlinBinding

class WasteFragmentQuestion7Kotlin : Fragment() {
    lateinit var binding:FragmentWasteQuestion7KotlinBinding
    lateinit var ft:FragmentTransaction


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=FragmentWasteQuestion7KotlinBinding.inflate(inflater,container,false)

        onclick()
        manageVisiblity()

        return binding.root

    }
    private fun onclick(){
        binding.btnWasteQuestion7.setOnClickListener {
            ft=requireFragmentManager().beginTransaction()
            ft.add(R.id.frame_challenge_waste,WasteFragmentQuestion8Kotlin())
            ft.commit()
        }
    }
    private fun manageVisiblity(){
        binding.wasteQ7Option1.setOnClickListener {
            binding.imgWasteQ7SelectedOption1.visibility=View.VISIBLE
            binding.imgWasteQ7SelectedOption2.visibility=View.INVISIBLE
            binding.imgWasteQ7SelectedOption3.visibility=View.INVISIBLE

        }
        binding.wasteQ7Option2.setOnClickListener {
            binding.imgWasteQ7SelectedOption2.visibility=View.VISIBLE
            binding.imgWasteQ7SelectedOption1.visibility=View.INVISIBLE
            binding.imgWasteQ7SelectedOption3.visibility=View.INVISIBLE

        }
        binding.wasteQ7Option3.setOnClickListener {
            binding.imgWasteQ7SelectedOption3.visibility=View.VISIBLE
            binding.imgWasteQ7SelectedOption2.visibility=View.INVISIBLE
            binding.imgWasteQ7SelectedOption1.visibility=View.INVISIBLE

        }



    }


}