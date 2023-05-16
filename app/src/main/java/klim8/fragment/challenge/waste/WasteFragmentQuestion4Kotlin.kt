package klim8.fragment.challenge.waste

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentTransaction
import com.inmortal.klim8.R
import com.inmortal.klim8.databinding.FragmentWasteQuestion4KotlinBinding


class WasteFragmentQuestion4Kotlin : Fragment() {
    lateinit var binding: FragmentWasteQuestion4KotlinBinding
    lateinit var ft:FragmentTransaction


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding= FragmentWasteQuestion4KotlinBinding.inflate(inflater,container,false)
        onclick()
        manageVisiblity()


        return binding.root

    }
    private fun onclick(){
        binding.btnWasteQuestion4.setOnClickListener {
            ft=requireFragmentManager().beginTransaction()
            ft.add(R.id.frame_challenge_waste,WasteFragmentQuestion5Kotlin())
            ft.commit()
        }
    }
    private fun manageVisiblity(){
        binding.WasteQ4Option1.setOnClickListener {
            binding.imgWasteQ4SelectedOption1.visibility=View.VISIBLE
            binding.imgWasteQ4SelectedOption2.visibility=View.INVISIBLE
            binding.imgWasteQ4SelectedOption3.visibility=View.INVISIBLE

        }
        binding.WasteQ4Option2.setOnClickListener {
            binding.imgWasteQ4SelectedOption2.visibility=View.VISIBLE
            binding.imgWasteQ4SelectedOption1.visibility=View.INVISIBLE
            binding.imgWasteQ4SelectedOption3.visibility=View.INVISIBLE

        }
        binding.WasteQ4Option3.setOnClickListener {
            binding.imgWasteQ4SelectedOption3.visibility=View.VISIBLE
            binding.imgWasteQ4SelectedOption2.visibility=View.INVISIBLE
            binding.imgWasteQ4SelectedOption1.visibility=View.INVISIBLE

        }



    }


}