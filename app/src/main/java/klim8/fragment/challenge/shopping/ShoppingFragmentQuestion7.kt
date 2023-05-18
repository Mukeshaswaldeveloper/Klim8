package klim8.fragment.challenge.shopping

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentTransaction
import com.inmortal.klim8.R
import com.inmortal.klim8.databinding.FragmentShoppingQuestion6Binding
import com.inmortal.klim8.databinding.FragmentShoppingQuestion7Binding
import klim8.activities.QuesAnsActivity

class ShoppingFragmentQuestion7 : Fragment() {
    lateinit var binding: FragmentShoppingQuestion7Binding
    lateinit var fragReplace: FragmentTransaction

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentShoppingQuestion7Binding.inflate(layoutInflater, container, false)
        onClick()
        manageVisiblity()
        return binding.root
    }

    private fun onClick() {
        binding.btnContinueShopQ7.setOnClickListener {
            startActivity(Intent(activity, QuesAnsActivity::class.java))

        }
    }

    private fun manageVisiblity() {
        binding.shoppingQ7Option1.setOnClickListener {
            binding.imgShoppingQ7SelectedOption1.visibility = View.VISIBLE
            binding.imgShoppingQ7SelectedOption2.visibility = View.INVISIBLE
            binding.imgShoppingQ7SelectedOption3.visibility = View.INVISIBLE

        }
        binding.shoppingQ7Option2.setOnClickListener {
            binding.imgShoppingQ7SelectedOption2.visibility = View.VISIBLE
            binding.imgShoppingQ7SelectedOption1.visibility = View.INVISIBLE
            binding.imgShoppingQ7SelectedOption3.visibility = View.INVISIBLE

        }
        binding.shoppingQ7Option3.setOnClickListener {
            binding.imgShoppingQ7SelectedOption3.visibility = View.VISIBLE
            binding.imgShoppingQ7SelectedOption2.visibility = View.INVISIBLE
            binding.imgShoppingQ7SelectedOption1.visibility = View.INVISIBLE

        }


    }
}

