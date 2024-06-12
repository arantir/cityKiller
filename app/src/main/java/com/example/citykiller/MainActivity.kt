package com.example.citykiller

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.annotation.RequiresApi
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Покраска статусной строки.(Это та бесячая фиолетовая полоска сверху)
        window.statusBarColor = ContextCompat.getColor(this, R.color.green)
        //Toast.makeText(this@MainActivity, "You clicked me.", Toast.LENGTH_SHORT).show()

        //Нажатие на кнопки
        findViewById<ImageView>(R.id.ivGenderMale1).setOnClickListener { changeStateYesNoEmpty(findViewById<ImageView>(R.id.ivGenderMale1)) }
        findViewById<ImageView>(R.id.ivGenderFemale1).setOnClickListener { changeStateYesNoEmpty(findViewById<ImageView>(R.id.ivGenderFemale1)) }
        findViewById<ImageView>(R.id.ivAge201).setOnClickListener { changeStateYesNoEmpty(findViewById<ImageView>(R.id.ivAge201)) }
        findViewById<ImageView>(R.id.ivAge401).setOnClickListener { changeStateYesNoEmpty(findViewById<ImageView>(R.id.ivAge401)) }
        findViewById<ImageView>(R.id.ivAge601).setOnClickListener { changeStateYesNoEmpty(findViewById<ImageView>(R.id.ivAge601)) }
        findViewById<ImageView>(R.id.ivBodyTypeSmall1).setOnClickListener { changeStateYesNoEmpty(findViewById<ImageView>(R.id.ivBodyTypeSmall1)) }
        findViewById<ImageView>(R.id.ivBodyTypeMedium1).setOnClickListener { changeStateYesNoEmpty(findViewById<ImageView>(R.id.ivBodyTypeMedium1)) }
        findViewById<ImageView>(R.id.ivBodyTypeLarge1).setOnClickListener { changeStateYesNoEmpty(findViewById<ImageView>(R.id.ivBodyTypeLarge1)) }
        findViewById<ImageView>(R.id.ivHeightSmall1).setOnClickListener { changeStateYesNoEmpty(findViewById<ImageView>(R.id.ivHeightSmall1)) }
        findViewById<ImageView>(R.id.ivHeightMedium1).setOnClickListener { changeStateYesNoEmpty(findViewById<ImageView>(R.id.ivHeightMedium1)) }
        findViewById<ImageView>(R.id.ivHeightLarge1).setOnClickListener { changeStateYesNoEmpty(findViewById<ImageView>(R.id.ivHeightLarge1)) }

        findViewById<ImageView>(R.id.ivGenderMale2).setOnClickListener { changeStateYesNoEmpty(findViewById<ImageView>(R.id.ivGenderMale2)) }
        findViewById<ImageView>(R.id.ivGenderFemale2).setOnClickListener { changeStateYesNoEmpty(findViewById<ImageView>(R.id.ivGenderFemale2)) }
        findViewById<ImageView>(R.id.ivAge202).setOnClickListener { changeStateYesNoEmpty(findViewById<ImageView>(R.id.ivAge202)) }
        findViewById<ImageView>(R.id.ivAge402).setOnClickListener { changeStateYesNoEmpty(findViewById<ImageView>(R.id.ivAge402)) }
        findViewById<ImageView>(R.id.ivAge602).setOnClickListener { changeStateYesNoEmpty(findViewById<ImageView>(R.id.ivAge602)) }
        findViewById<ImageView>(R.id.ivBodyTypeSmall2).setOnClickListener { changeStateYesNoEmpty(findViewById<ImageView>(R.id.ivBodyTypeSmall2)) }
        findViewById<ImageView>(R.id.ivBodyTypeMedium2).setOnClickListener { changeStateYesNoEmpty(findViewById<ImageView>(R.id.ivBodyTypeMedium2)) }
        findViewById<ImageView>(R.id.ivBodyTypeLarge2).setOnClickListener { changeStateYesNoEmpty(findViewById<ImageView>(R.id.ivBodyTypeLarge2)) }
        findViewById<ImageView>(R.id.ivHeightSmall2).setOnClickListener { changeStateYesNoEmpty(findViewById<ImageView>(R.id.ivHeightSmall2)) }
        findViewById<ImageView>(R.id.ivHeightMedium2).setOnClickListener { changeStateYesNoEmpty(findViewById<ImageView>(R.id.ivHeightMedium2)) }
        findViewById<ImageView>(R.id.ivHeightLarge2).setOnClickListener { changeStateYesNoEmpty(findViewById<ImageView>(R.id.ivHeightLarge2)) }

        findViewById<ImageView>(R.id.ivGenderMale3).setOnClickListener { changeStateYesNoEmpty(findViewById<ImageView>(R.id.ivGenderMale3)) }
        findViewById<ImageView>(R.id.ivGenderFemale3).setOnClickListener { changeStateYesNoEmpty(findViewById<ImageView>(R.id.ivGenderFemale3)) }
        findViewById<ImageView>(R.id.ivAge203).setOnClickListener { changeStateYesNoEmpty(findViewById<ImageView>(R.id.ivAge203)) }
        findViewById<ImageView>(R.id.ivAge403).setOnClickListener { changeStateYesNoEmpty(findViewById<ImageView>(R.id.ivAge403)) }
        findViewById<ImageView>(R.id.ivAge603).setOnClickListener { changeStateYesNoEmpty(findViewById<ImageView>(R.id.ivAge603)) }
        findViewById<ImageView>(R.id.ivBodyTypeSmall3).setOnClickListener { changeStateYesNoEmpty(findViewById<ImageView>(R.id.ivBodyTypeSmall3)) }
        findViewById<ImageView>(R.id.ivBodyTypeMedium3).setOnClickListener { changeStateYesNoEmpty(findViewById<ImageView>(R.id.ivBodyTypeMedium3)) }
        findViewById<ImageView>(R.id.ivBodyTypeLarge3).setOnClickListener { changeStateYesNoEmpty(findViewById<ImageView>(R.id.ivBodyTypeLarge3)) }
        findViewById<ImageView>(R.id.ivHeightSmall3).setOnClickListener { changeStateYesNoEmpty(findViewById<ImageView>(R.id.ivHeightSmall3)) }
        findViewById<ImageView>(R.id.ivHeightMedium3).setOnClickListener { changeStateYesNoEmpty(findViewById<ImageView>(R.id.ivHeightMedium3)) }
        findViewById<ImageView>(R.id.ivHeightLarge3).setOnClickListener { changeStateYesNoEmpty(findViewById<ImageView>(R.id.ivHeightLarge3)) }

        findViewById<ImageView>(R.id.ivGenderMale4).setOnClickListener { changeStateYesNoEmpty(findViewById<ImageView>(R.id.ivGenderMale4)) }
        findViewById<ImageView>(R.id.ivGenderFemale4).setOnClickListener { changeStateYesNoEmpty(findViewById<ImageView>(R.id.ivGenderFemale4)) }
        findViewById<ImageView>(R.id.ivAge204).setOnClickListener { changeStateYesNoEmpty(findViewById<ImageView>(R.id.ivAge204)) }
        findViewById<ImageView>(R.id.ivAge404).setOnClickListener { changeStateYesNoEmpty(findViewById<ImageView>(R.id.ivAge404)) }
        findViewById<ImageView>(R.id.ivAge604).setOnClickListener { changeStateYesNoEmpty(findViewById<ImageView>(R.id.ivAge604)) }
        findViewById<ImageView>(R.id.ivBodyTypeSmall4).setOnClickListener { changeStateYesNoEmpty(findViewById<ImageView>(R.id.ivBodyTypeSmall4)) }
        findViewById<ImageView>(R.id.ivBodyTypeMedium4).setOnClickListener { changeStateYesNoEmpty(findViewById<ImageView>(R.id.ivBodyTypeMedium4)) }
        findViewById<ImageView>(R.id.ivBodyTypeLarge4).setOnClickListener { changeStateYesNoEmpty(findViewById<ImageView>(R.id.ivBodyTypeLarge4)) }
        findViewById<ImageView>(R.id.ivHeightSmall4).setOnClickListener { changeStateYesNoEmpty(findViewById<ImageView>(R.id.ivHeightSmall4)) }
        findViewById<ImageView>(R.id.ivHeightMedium4).setOnClickListener { changeStateYesNoEmpty(findViewById<ImageView>(R.id.ivHeightMedium4)) }
        findViewById<ImageView>(R.id.ivHeightLarge4).setOnClickListener { changeStateYesNoEmpty(findViewById<ImageView>(R.id.ivHeightLarge4)) }

        findViewById<ImageView>(R.id.ivGenderMale5).setOnClickListener { changeStateYesNoEmpty(findViewById<ImageView>(R.id.ivGenderMale5)) }
        findViewById<ImageView>(R.id.ivGenderFemale5).setOnClickListener { changeStateYesNoEmpty(findViewById<ImageView>(R.id.ivGenderFemale5)) }
        findViewById<ImageView>(R.id.ivAge205).setOnClickListener { changeStateYesNoEmpty(findViewById<ImageView>(R.id.ivAge205)) }
        findViewById<ImageView>(R.id.ivAge405).setOnClickListener { changeStateYesNoEmpty(findViewById<ImageView>(R.id.ivAge405)) }
        findViewById<ImageView>(R.id.ivAge605).setOnClickListener { changeStateYesNoEmpty(findViewById<ImageView>(R.id.ivAge605)) }
        findViewById<ImageView>(R.id.ivBodyTypeSmall5).setOnClickListener { changeStateYesNoEmpty(findViewById<ImageView>(R.id.ivBodyTypeSmall5)) }
        findViewById<ImageView>(R.id.ivBodyTypeMedium5).setOnClickListener { changeStateYesNoEmpty(findViewById<ImageView>(R.id.ivBodyTypeMedium5)) }
        findViewById<ImageView>(R.id.ivBodyTypeLarge5).setOnClickListener { changeStateYesNoEmpty(findViewById<ImageView>(R.id.ivBodyTypeLarge5)) }
        findViewById<ImageView>(R.id.ivHeightSmall5).setOnClickListener { changeStateYesNoEmpty(findViewById<ImageView>(R.id.ivHeightSmall5)) }
        findViewById<ImageView>(R.id.ivHeightMedium5).setOnClickListener { changeStateYesNoEmpty(findViewById<ImageView>(R.id.ivHeightMedium5)) }
        findViewById<ImageView>(R.id.ivHeightLarge5).setOnClickListener { changeStateYesNoEmpty(findViewById<ImageView>(R.id.ivHeightLarge5)) }

        findViewById<ImageView>(R.id.ivGenderMale6).setOnClickListener { changeStateYesNoEmpty(findViewById<ImageView>(R.id.ivGenderMale6)) }
        findViewById<ImageView>(R.id.ivGenderFemale6).setOnClickListener { changeStateYesNoEmpty(findViewById<ImageView>(R.id.ivGenderFemale6)) }
        findViewById<ImageView>(R.id.ivAge206).setOnClickListener { changeStateYesNoEmpty(findViewById<ImageView>(R.id.ivAge206)) }
        findViewById<ImageView>(R.id.ivAge406).setOnClickListener { changeStateYesNoEmpty(findViewById<ImageView>(R.id.ivAge406)) }
        findViewById<ImageView>(R.id.ivAge606).setOnClickListener { changeStateYesNoEmpty(findViewById<ImageView>(R.id.ivAge606)) }
        findViewById<ImageView>(R.id.ivBodyTypeSmall6).setOnClickListener { changeStateYesNoEmpty(findViewById<ImageView>(R.id.ivBodyTypeSmall6)) }
        findViewById<ImageView>(R.id.ivBodyTypeMedium6).setOnClickListener { changeStateYesNoEmpty(findViewById<ImageView>(R.id.ivBodyTypeMedium6)) }
        findViewById<ImageView>(R.id.ivBodyTypeLarge6).setOnClickListener { changeStateYesNoEmpty(findViewById<ImageView>(R.id.ivBodyTypeLarge6)) }
        findViewById<ImageView>(R.id.ivHeightSmall6).setOnClickListener { changeStateYesNoEmpty(findViewById<ImageView>(R.id.ivHeightSmall6)) }
        findViewById<ImageView>(R.id.ivHeightMedium6).setOnClickListener { changeStateYesNoEmpty(findViewById<ImageView>(R.id.ivHeightMedium6)) }
        findViewById<ImageView>(R.id.ivHeightLarge6).setOnClickListener { changeStateYesNoEmpty(findViewById<ImageView>(R.id.ivHeightLarge6)) }

        findViewById<ImageView>(R.id.ivGenderMale7).setOnClickListener { changeStateYesNoEmpty(findViewById<ImageView>(R.id.ivGenderMale7)) }
        findViewById<ImageView>(R.id.ivGenderFemale7).setOnClickListener { changeStateYesNoEmpty(findViewById<ImageView>(R.id.ivGenderFemale7)) }
        findViewById<ImageView>(R.id.ivAge207).setOnClickListener { changeStateYesNoEmpty(findViewById<ImageView>(R.id.ivAge207)) }
        findViewById<ImageView>(R.id.ivAge407).setOnClickListener { changeStateYesNoEmpty(findViewById<ImageView>(R.id.ivAge407)) }
        findViewById<ImageView>(R.id.ivAge607).setOnClickListener { changeStateYesNoEmpty(findViewById<ImageView>(R.id.ivAge607)) }
        findViewById<ImageView>(R.id.ivBodyTypeSmall7).setOnClickListener { changeStateYesNoEmpty(findViewById<ImageView>(R.id.ivBodyTypeSmall7)) }
        findViewById<ImageView>(R.id.ivBodyTypeMedium7).setOnClickListener { changeStateYesNoEmpty(findViewById<ImageView>(R.id.ivBodyTypeMedium7)) }
        findViewById<ImageView>(R.id.ivBodyTypeLarge7).setOnClickListener { changeStateYesNoEmpty(findViewById<ImageView>(R.id.ivBodyTypeLarge7)) }
        findViewById<ImageView>(R.id.ivHeightSmall7).setOnClickListener { changeStateYesNoEmpty(findViewById<ImageView>(R.id.ivHeightSmall7)) }
        findViewById<ImageView>(R.id.ivHeightMedium7).setOnClickListener { changeStateYesNoEmpty(findViewById<ImageView>(R.id.ivHeightMedium7)) }
        findViewById<ImageView>(R.id.ivHeightLarge7).setOnClickListener { changeStateYesNoEmpty(findViewById<ImageView>(R.id.ivHeightLarge7)) }

        findViewById<ImageView>(R.id.ivGenderMale8).setOnClickListener { changeStateYesNoEmpty(findViewById<ImageView>(R.id.ivGenderMale8)) }
        findViewById<ImageView>(R.id.ivGenderFemale8).setOnClickListener { changeStateYesNoEmpty(findViewById<ImageView>(R.id.ivGenderFemale8)) }
        findViewById<ImageView>(R.id.ivAge208).setOnClickListener { changeStateYesNoEmpty(findViewById<ImageView>(R.id.ivAge208)) }
        findViewById<ImageView>(R.id.ivAge408).setOnClickListener { changeStateYesNoEmpty(findViewById<ImageView>(R.id.ivAge408)) }
        findViewById<ImageView>(R.id.ivAge608).setOnClickListener { changeStateYesNoEmpty(findViewById<ImageView>(R.id.ivAge608)) }
        findViewById<ImageView>(R.id.ivBodyTypeSmall8).setOnClickListener { changeStateYesNoEmpty(findViewById<ImageView>(R.id.ivBodyTypeSmall8)) }
        findViewById<ImageView>(R.id.ivBodyTypeMedium8).setOnClickListener { changeStateYesNoEmpty(findViewById<ImageView>(R.id.ivBodyTypeMedium8)) }
        findViewById<ImageView>(R.id.ivBodyTypeLarge8).setOnClickListener { changeStateYesNoEmpty(findViewById<ImageView>(R.id.ivBodyTypeLarge8)) }
        findViewById<ImageView>(R.id.ivHeightSmall8).setOnClickListener { changeStateYesNoEmpty(findViewById<ImageView>(R.id.ivHeightSmall8)) }
        findViewById<ImageView>(R.id.ivHeightMedium8).setOnClickListener { changeStateYesNoEmpty(findViewById<ImageView>(R.id.ivHeightMedium8)) }
        findViewById<ImageView>(R.id.ivHeightLarge8).setOnClickListener { changeStateYesNoEmpty(findViewById<ImageView>(R.id.ivHeightLarge8)) }

        findViewById<ImageView>(R.id.ivGenderMale9).setOnClickListener { changeStateYesNoEmpty(findViewById<ImageView>(R.id.ivGenderMale9)) }
        findViewById<ImageView>(R.id.ivGenderFemale9).setOnClickListener { changeStateYesNoEmpty(findViewById<ImageView>(R.id.ivGenderFemale9)) }
        findViewById<ImageView>(R.id.ivAge209).setOnClickListener { changeStateYesNoEmpty(findViewById<ImageView>(R.id.ivAge209)) }
        findViewById<ImageView>(R.id.ivAge409).setOnClickListener { changeStateYesNoEmpty(findViewById<ImageView>(R.id.ivAge409)) }
        findViewById<ImageView>(R.id.ivAge609).setOnClickListener { changeStateYesNoEmpty(findViewById<ImageView>(R.id.ivAge609)) }
        findViewById<ImageView>(R.id.ivBodyTypeSmall9).setOnClickListener { changeStateYesNoEmpty(findViewById<ImageView>(R.id.ivBodyTypeSmall9)) }
        findViewById<ImageView>(R.id.ivBodyTypeMedium9).setOnClickListener { changeStateYesNoEmpty(findViewById<ImageView>(R.id.ivBodyTypeMedium9)) }
        findViewById<ImageView>(R.id.ivBodyTypeLarge9).setOnClickListener { changeStateYesNoEmpty(findViewById<ImageView>(R.id.ivBodyTypeLarge9)) }
        findViewById<ImageView>(R.id.ivHeightSmall9).setOnClickListener { changeStateYesNoEmpty(findViewById<ImageView>(R.id.ivHeightSmall9)) }
        findViewById<ImageView>(R.id.ivHeightMedium9).setOnClickListener { changeStateYesNoEmpty(findViewById<ImageView>(R.id.ivHeightMedium9)) }
        findViewById<ImageView>(R.id.ivHeightLarge9).setOnClickListener { changeStateYesNoEmpty(findViewById<ImageView>(R.id.ivHeightLarge9)) }

        findViewById<ImageView>(R.id.ivGenderMale10).setOnClickListener { changeStateYesNoEmpty(findViewById<ImageView>(R.id.ivGenderMale10)) }
        findViewById<ImageView>(R.id.ivGenderFemale10).setOnClickListener { changeStateYesNoEmpty(findViewById<ImageView>(R.id.ivGenderFemale10)) }
        findViewById<ImageView>(R.id.ivAge2010).setOnClickListener { changeStateYesNoEmpty(findViewById<ImageView>(R.id.ivAge2010)) }
        findViewById<ImageView>(R.id.ivAge4010).setOnClickListener { changeStateYesNoEmpty(findViewById<ImageView>(R.id.ivAge4010)) }
        findViewById<ImageView>(R.id.ivAge6010).setOnClickListener { changeStateYesNoEmpty(findViewById<ImageView>(R.id.ivAge6010)) }
        findViewById<ImageView>(R.id.ivBodyTypeSmall10).setOnClickListener { changeStateYesNoEmpty(findViewById<ImageView>(R.id.ivBodyTypeSmall10)) }
        findViewById<ImageView>(R.id.ivBodyTypeMedium10).setOnClickListener { changeStateYesNoEmpty(findViewById<ImageView>(R.id.ivBodyTypeMedium10)) }
        findViewById<ImageView>(R.id.ivBodyTypeLarge10).setOnClickListener { changeStateYesNoEmpty(findViewById<ImageView>(R.id.ivBodyTypeLarge10)) }
        findViewById<ImageView>(R.id.ivHeightSmall10).setOnClickListener { changeStateYesNoEmpty(findViewById<ImageView>(R.id.ivHeightSmall10)) }
        findViewById<ImageView>(R.id.ivHeightMedium10).setOnClickListener { changeStateYesNoEmpty(findViewById<ImageView>(R.id.ivHeightMedium10)) }
        findViewById<ImageView>(R.id.ivHeightLarge10).setOnClickListener { changeStateYesNoEmpty(findViewById<ImageView>(R.id.ivHeightLarge10)) }

        findViewById<ImageView>(R.id.ivSocialGroup1).setOnClickListener { changeStateYesNo(findViewById<ImageView>(R.id.ivSocialGroup1)) }
        findViewById<ImageView>(R.id.ivSocialGroup2).setOnClickListener { changeStateYesNo(findViewById<ImageView>(R.id.ivSocialGroup2)) }
        findViewById<ImageView>(R.id.ivSocialGroup3).setOnClickListener { changeStateYesNo(findViewById<ImageView>(R.id.ivSocialGroup3)) }
        findViewById<ImageView>(R.id.ivSocialGroup4).setOnClickListener { changeStateYesNo(findViewById<ImageView>(R.id.ivSocialGroup4)) }
        findViewById<ImageView>(R.id.ivSocialGroup5).setOnClickListener { changeStateYesNo(findViewById<ImageView>(R.id.ivSocialGroup5)) }
        findViewById<ImageView>(R.id.ivSocialGroup6).setOnClickListener { changeStateYesNo(findViewById<ImageView>(R.id.ivSocialGroup6)) }
        findViewById<ImageView>(R.id.ivSocialGroup7).setOnClickListener { changeStateYesNo(findViewById<ImageView>(R.id.ivSocialGroup7)) }
        findViewById<ImageView>(R.id.ivSocialGroup8).setOnClickListener { changeStateYesNo(findViewById<ImageView>(R.id.ivSocialGroup8)) }
        findViewById<ImageView>(R.id.ivSocialGroup9).setOnClickListener { changeStateYesNo(findViewById<ImageView>(R.id.ivSocialGroup9)) }

        findViewById<ImageView>(R.id.ivMotive1).setOnClickListener { changeStateYesNo(findViewById<ImageView>(R.id.ivMotive1)) }
        findViewById<ImageView>(R.id.ivMotive2).setOnClickListener { changeStateYesNo(findViewById<ImageView>(R.id.ivMotive2)) }
        findViewById<ImageView>(R.id.ivMotive3).setOnClickListener { changeStateYesNo(findViewById<ImageView>(R.id.ivMotive3)) }
        findViewById<ImageView>(R.id.ivMotive4).setOnClickListener { changeStateYesNo(findViewById<ImageView>(R.id.ivMotive4)) }
        findViewById<ImageView>(R.id.ivMotive5).setOnClickListener { changeStateYesNo(findViewById<ImageView>(R.id.ivMotive5)) }
        findViewById<ImageView>(R.id.ivMotive6).setOnClickListener { changeStateYesNo(findViewById<ImageView>(R.id.ivMotive6)) }
        findViewById<ImageView>(R.id.ivMotive7).setOnClickListener { changeStateYesNo(findViewById<ImageView>(R.id.ivMotive7)) }
        findViewById<ImageView>(R.id.ivMotive8).setOnClickListener { changeStateYesNo(findViewById<ImageView>(R.id.ivMotive8)) }
    }

    //Смена состоянии да/нет/пусто для жителей.
    fun changeStateYesNoEmpty(iv: ImageView){
        if (iv.alpha == 0.98F){
            iv.alpha = 0.99F
            iv.setImageResource(R.drawable.yes)
        }
        else if (iv.alpha == 0.99F){
            iv.alpha = 1.0F
            iv.setImageResource(R.drawable.no)
        }
        else{
            iv.alpha = 0.98F
            iv.setImageResource(android.R.color.transparent)
        }
    }

    //Смена состоянии да/нет для социальных групп.
    fun changeStateYesNo(iv: ImageView){
        if (iv.alpha == 0.2F){
            iv.alpha = 1.0F
        }
        else{
            iv.alpha = 0.2F
        }
    }
}