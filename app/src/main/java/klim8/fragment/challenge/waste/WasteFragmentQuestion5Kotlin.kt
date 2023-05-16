package klim8.fragment.challenge.waste

import android.os.Binder
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentTransaction
import com.inmortal.klim8.R
import com.inmortal.klim8.databinding.FragmentWasteQuestion5KotlinBinding
import com.inmortal.klim8.databinding.FragmentWasteQuestion6KotlinBinding


class WasteFragmentQuestion5Kotlin : Fragment() {

    lateinit var binding: FragmentWasteQuestion5KotlinBinding
    lateinit var ft:FragmentTransaction

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=FragmentWasteQuestion5KotlinBinding.inflate(inflater,container,false)
        onclick()
        manageVisiblity()

        return binding.root


    }
    private fun onclick(){
        binding.btnWasteQuestion5.setOnClickListener {
            ft=requireFragmentManager().beginTransaction()
            ft.add(R.id.frame_challenge_waste,WasteFragmentQuestion6Kotlin())
            ft.commit()
        }

    }
    private fun manageVisiblity(){
        binding.wasteQ5Option1.setOnClickListener {
            binding.imgWasteQ5SelectedOption1.visibility=View.VISIBLE
            binding.imgWasteQ5SelectedOption2.visibility=View.INVISIBLE
            binding.imgWasteQ5SelectedOption3.visibility=View.INVISIBLE

        }
        binding.wasteQ5Option2.setOnClickListener {
            binding.imgWasteQ5SelectedOption2.visibility=View.VISIBLE
            binding.imgWasteQ5SelectedOption1.visibility=View.INVISIBLE
            binding.imgWasteQ5SelectedOption3.visibility=View.INVISIBLE

        }
        binding.wasteQ5Option3.setOnClickListener {
            binding.imgWasteQ5SelectedOption3.visibility=View.VISIBLE
            binding.imgWasteQ5SelectedOption2.visibility=View.INVISIBLE
            binding.imgWasteQ5SelectedOption1.visibility=View.INVISIBLE

        }



    }



}