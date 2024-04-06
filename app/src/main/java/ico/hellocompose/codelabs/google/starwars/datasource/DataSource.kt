package ico.hellocompose.codelabs.google.starwars.datasource

import ico.hellocompose.R
import ico.hellocompose.codelabs.google.starwars.model.Character

object DataSource {
    val persons = listOf<Character>(
        Character(R.string.name_dart_vader, R.string.description_dart_vader, R.drawable.darth_vader),
        Character(R.string.name_han_solo, R.string.description_han_solo, R.drawable.han_solo),
        Character(R.string.name_obi_wan, R.string.description_obi_wan, R.drawable.obi_wan_kenobi),
        Character(R.string.name_leia_organa, R.string.description_leia_organa, R.drawable.princesa_leia),
        Character(R.string.name_kylo_ren, R.string.description_kylo_ren, R.drawable.kylo_ren),
        Character(R.string.name_rey, R.string.description_rey, R.drawable.rey),
        Character(R.string.name_luke_skywalker, R.string.description_luke_skywalker, R.drawable.luke_skywalker),
        Character(R.string.name_chewbacca, R.string.description_chewbacca, R.drawable.chewbacca),
        Character(R.string.name_r2_d2, R.string.description_r2_d2, R.drawable.r2d2),
        Character(R.string.name_emperador_palpatine, R.string.description_emperador_palpatine, R.drawable.palpatine),
        Character(R.string.name_yoda, R.string.description_yoda, R.drawable.yoda),
        Character(R.string.name_din_djarin, R.string.description_din_djarin, R.drawable.mando),
        Character(R.string.name_cassian_andor, R.string.description_cassian_andor, R.drawable.cassian_andor),
        Character(R.string.name_lando_calrissian, R.string.description_lando_calrissian, R.drawable.lando),
        Character(R.string.name_gui_gon_jinn, R.string.description_gui_gon_jinn, R.drawable.qui_gon_jinn),
        Character(R.string.name_darth_maul, R.string.description_dart_maul, R.drawable.darth_maul),
        Character(R.string.name_bb8, R.string.description_bb8, R.drawable.bb8),
        Character(R.string.name_jyn_esso, R.string.description_jyn_esso, R.drawable.jyn_erso),
        Character(R.string.name_grogu, R.string.description_grogu, R.drawable.grogu),
        Character(R.string.name_jabba, R.string.description_jabba, R.drawable.jabba)
    )
}