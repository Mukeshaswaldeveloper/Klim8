package klim8.fragment.challenge.waste

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentTransaction
import com.inmortal.klim8.R
import com.inmortal.klim8.databinding.FragmentActive2Binding
import com.inmortal.klim8.databinding.FragmentWasteQuestion1KotlinBinding
import com.inmortal.klim8.databinding.FragmentWasteQuestion2KotlinBinding


class WasteFragmentQuestion2Kotlin : Fragment() {
    lateinit var binding:FragmentWasteQuestion2KotlinBinding
    lateinit var ft: FragmentTransaction



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       binding= FragmentWasteQuestion2KotlinBinding.inflate(inflater,container,false)
        onclick()
        manageVisiblity()

        return binding.root

    }
    private fun onclick(){
        binding.btnWasteQuestion2.setOnClickListener {
            ft=requireFragmentManager().beginTransaction()
            ft.add(R.id.frame_challenge_waste,WasteFragmentQuestion3Kotlin())
            ft.commit()
        }
    }
    private fun manageVisiblity(){
        binding.WasteQ2Option1.setOnClickListener {
            binding.imgWasteQ2SelectedOption1.visibility=View.VISIBLE
            binding.imgWasteQ2SelectedOption2.visibility=View.INVISIBLE
            binding.imgWasteQ2SelectedOption3.visibility=View.INVISIBLE

        }
        binding.WasteQ2Option2.setOnClickListener {
            binding.imgWasteQ2SelectedOption2.visibility=View.VISIBLE
            binding.imgWasteQ2SelectedOption1.visibility=View.INVISIBLE
            binding.imgWasteQ2SelectedOption3.visibility=View.INVISIBLE

        }
        binding.WasteQ2Option3.setOnClickListener {
            binding.imgWasteQ2SelectedOption3.visibility=View.VISIBLE
            binding.imgWasteQ2SelectedOption2.visibility=View.INVISIBLE
            binding.imgWasteQ2SelectedOption1.visibility=View.INVISIBLE

        }



    }


    }
