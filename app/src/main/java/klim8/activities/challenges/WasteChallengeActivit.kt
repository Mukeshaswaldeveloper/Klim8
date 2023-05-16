package klim8.activities.challenges

import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentTransaction
import com.inmortal.klim8.R
import com.inmortal.klim8.databinding.ActivityWasteChallengeBinding
import com.inmortal.klim8.databinding.FragmentWasteQuestion1KotlinBinding
import klim8.fragment.challenge.waste.WasteFragmentQuestion1Kotlin

class WasteChallengeActivit : AppCompatActivity() {
    lateinit var binding:ActivityWasteChallengeBinding
    lateinit var fragReplace:FragmentTransaction


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityWasteChallengeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        fragReplace=supportFragmentManager.beginTransaction()
        fragReplace.replace(R.id.frame_challenge_waste,WasteFragmentQuestion1Kotlin())
        fragReplace.commit()


    }
}