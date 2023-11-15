package com.example.shinypoems

data class Poem(
    val idol: String,
    val body: String
)

class Constants {
    class ClothPoems {
        companion object {
            val POEM_LISTS = listOf(
                Poem("櫻木真乃", "しろはえの浴衣。赤い実のように甘くて楽しい時間"),
                Poem("櫻木真乃", "ビー・アンビシャス。軽やかなハニーレモンソーダ"),
                Poem("櫻木真乃", "ワンステップ。公園の鳩さんカラーでお気に入り"),
                Poem("櫻木真乃", "スタッカート。空を渡るいろたち"),
                Poem("櫻木真乃", "1stシーズンの水着。めぐるちゃんとお揃い柄♪"),
                Poem("櫻木真乃", "水色ジャージ。優しい灯織ちゃん色♪"),
            )
        }
    }
}
