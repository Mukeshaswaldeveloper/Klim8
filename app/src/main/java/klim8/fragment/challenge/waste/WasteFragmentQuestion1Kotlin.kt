package klim8.fragment.challenge.waste

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentTransaction
import com.inmortal.klim8.R
import com.inmortal.klim8.databinding.FragmentWasteQuestion1KotlinBinding

class WasteFragmentQuestion1Kotlin : Fragment() {
    lateinit var binding: FragmentWasteQuestion1KotlinBinding
    lateinit var ft: FragmentTransaction



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,

        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentWasteQuestion1KotlinBinding.inflate(inflater, container, false)
        onclick()
        manageVisiblity()

      return binding.root

    }
    private fun onclick(){
        binding.btnWasteQuestion1.setOnClickListener {
            ft= requireFragmentManager().beginTransaction()
            ft.add(R.id.frame_challenge_waste, WasteFragmentQuestion2Kotlin())
            ft.commit()

        }

    }

    private fun manageVisiblity(){
        binding.WasteQ1Option1.setOnClickListener {
            binding.imgWasteQ1SelectedOption1.visibility=View.VISIBLE
            binding.imgWasteQ1SelectedOption2.visibility=View.INVISIBLE
            binding.imgWasteQ1SelectedOption3.visibility=View.INVISIBLE

        }
        binding.WasteQ1Option2.setOnClickListener {
            binding.imgWasteQ1SelectedOption2.visibility=View.VISIBLE
            binding.imgWasteQ1SelectedOption1.visibility=View.INVISIBLE
            binding.imgWasteQ1SelectedOption3.visibility=View.INVISIBLE

        }
        binding.WasteQ1Option3.setOnClickListener {
            binding.imgWasteQ1SelectedOption3.visibility=View.VISIBLE
            binding.imgWasteQ1SelectedOption2.visibility=View.INVISIBLE
            binding.imgWasteQ1SelectedOption1.visibility=View.INVISIBLE

        }



    }




    }
