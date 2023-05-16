package klim8.fragment.challenge.waste

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentTransaction
import com.inmortal.klim8.R
import com.inmortal.klim8.databinding.FragmentWasteQuestion8KotlinBinding


class WasteFragmentQuestion8Kotlin : Fragment() {
    lateinit var binding: FragmentWasteQuestion8KotlinBinding
    lateinit var ft:FragmentTransaction

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=FragmentWasteQuestion8KotlinBinding.inflate(inflater,container,false)
        onclick()
        manageVisiblity()
        return binding.root

    }
    private fun onclick(){
        binding.btnWasteQuestion8.setOnClickListener {
            ft=requireFragmentManager().beginTransaction()
            ft.add(R.id.frame_challenge_waste,WasteFragmentQuestion9Kotlin())
            ft.commit()
        }
    }
    private fun manageVisiblity(){
        binding.wasteQ8Option1.setOnClickListener {
            binding.imgWasteQ8SelectedOption1.visibility=View.VISIBLE
            binding.imgWasteQ8SelectedOption2.visibility=View.INVISIBLE
            binding.imgWasteQ8SelectedOption3.visibility=View.INVISIBLE

        }
        binding.wasteQ8Option2.setOnClickListener {
            binding.imgWasteQ8SelectedOption2.visibility=View.VISIBLE
            binding.imgWasteQ8SelectedOption1.visibility=View.INVISIBLE
            binding.imgWasteQ8SelectedOption3.visibility=View.INVISIBLE

        }
        binding.wasteQ8Option3.setOnClickListener {
            binding.imgWasteQ8SelectedOption3.visibility=View.VISIBLE
            binding.imgWasteQ8SelectedOption2.visibility=View.INVISIBLE
            binding.imgWasteQ8SelectedOption1.visibility=View.INVISIBLE

        }



    }


}