package com.example.myreycleview

object HeroesData {
    private val data = arrayOf(
        arrayOf(
            "Rendang",
            "makanan khas dari Sumatera Barat yang satu ini. Irisan daging sapi yang dimasak dengan rempah khas padang yang gurih.",
            "https://cdnwpseller.gramedia.net/wp-content/uploads/2021/11/26104659/Makanan-Khas-Indonesia-Rendang-300x205.jpg"
        ),
        arrayOf(
            "Sate",
            "Sate adalah kuliner khas Indonesia yang menggunakan daging ayam, sapi, kambing, kelinci, ataupun kerbau sebagai bahan bakunya.",
            "https://cdnwpseller.gramedia.net/wp-content/uploads/2021/11/26104839/Makanan-Khas-Indonesia-sate-1.jpg"
        ),
        arrayOf(
            "Nasi Goreng",
            "Nasi goreng sendiri banyak versinya, ada nasi goreng kampung, nasi goreng ijo, nasi goreng jawa, nasi goreng teri, nasi goreng seafood, nasi goreng, nasi goreng sunda, nasi goreng mawut, dll.",
            "https://cdnwpseller.gramedia.net/wp-content/uploads/2021/11/26104649/Makanan-Khas-Indonesia-Nasi-goreng-300x199.jpg"
        ),
        arrayOf(
            "Bakso",
            "Bakso merupakan olahan dari daging sapi yang dihaluskan, dicampur dengan bumbu halus, tepung terigu, dan penyedap rasa. Adonan tersebut dibentuk bola lalu direbus hingga matang. Bakso disajikan bersama kuah kaldu sapi beserta pelengkap berupa mie kuning, bihun, tahu bakso, dan rajangan daun seledri.",
            "https://cdnwpseller.gramedia.net/wp-content/uploads/2021/11/26104637/Makanan-Khas-Indonesia-bakso.jpg"
        ),
        arrayOf(
            "Soto",
            "Soto, Coto, Sauto, Tauto adalah makanan khas Indonesia sejenis sup dengan kuah rebusan ayam atau sapi. Soto biasanya memakai dua jenis daging, yakni daging ayam dan dan daging sapi.",
            "https://cdnwpseller.gramedia.net/wp-content/uploads/2021/11/26104713/Makanan-Khas-Indonesia-soto.jpg"
        ),
        arrayOf(
            "Rawon",
            "Rawon adalah makan khas dari Kota Surabaya yang mirip dengan sup daging namun memiliki kuah hitam pekat. Meskipun kuahnya tidak seperti sup pada umumnya, rawon memiliki cita rasa yang khas dan selalu dirindukan oleh penikmat masakan Jawa timuran.",
            "https://cdnwpseller.gramedia.net/wp-content/uploads/2021/11/26104658/Makanan-Khas-Indonesia-rawon.jpg"
        ),
        arrayOf(
            "Gado-Gado",
            "Gado-gado adalah makanan khas dari Jakarta yang menyehatkan karena terdiri dari rebusan sayuran seperti kangkung, wortel, labu siam, selada, timun dan irisan tempe yang disiram dengan saus kacang yang gurih.",
            "https://cdnwpseller.gramedia.net/wp-content/uploads/2021/11/26104642/Makanan-Khas-Indonesia-gado-gado.jpg"
        ),
        arrayOf(
            "Pempek",
            "Pempek merupakan kuliner khas Sumatra yang terbuat dari ikan tenggiri, toman, atau gabus yang dihaluskan, dicampur bersama tepung sagu dan bumbu halus. Pempek diuleni hingga kalis lalu direbus dalam air mendidih. setelah itu pempek digoreng dan disantap bersama kuah cuko. Kuah cuko adalah kuah yang terbuat dari rebusan gula merah dan cuka.",
            "https://cdnwpseller.gramedia.net/wp-content/uploads/2021/11/26104656/Makanan-Khas-Indonesia-pempek.jpg"
        ),
        arrayOf(
            "Nasi Padang",
            "Nasi Padang sebenarnya adalah nasi putih yang disajikan bersama aneka jenis lauk khas Padang seperti rendang, gulai ikan, ayam bakar, ayam pop, telor dadar, kering tempe, daging cincang, daun singkong rebus dan sambal ijo.",
            "https://cdnwpseller.gramedia.net/wp-content/uploads/2021/11/26104654/Makanan-Khas-Indonesia-nasi-padang.jpg"
        ),
        arrayOf(
            "Gudeg",
            "Gudeg merupakan makanan khas Yogyakarta yang terbuat dari nangka muda yang dimasak dengan santan dan daun jati selama berjam-jam hingga lembut dan bumbu meresap sempurna dan berwarna kemerahan.",
            "https://cdnwpseller.gramedia.net/wp-content/uploads/2021/11/26104645/Makanan-Khas-Indonesia-gudeg.jpg"
        )
    )

    val listData: ArrayList<Hero>
        get() {
            val list = arrayListOf<Hero>()
            for (aData in data) {
                val hero = Hero()
                hero.name = aData[0]
                hero.from = aData[1]
                hero.photo = aData[2]
                list.add(hero)
            }
            return list
        }
}
