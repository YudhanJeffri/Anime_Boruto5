package com.cobacobaaja.anime_boruto5;

import java.util.ArrayList;

public class AnimeData {
    public static String[] heroNames = {
            "Uzumaki Boruto",
            "Uzumaki Himawari",
            "Metal Lee",
            "Shinki",
            "Uchiha Sarada",
            "Yudo",
            "Inojin",
            "Mirai Sarutobi",
            "Mitsuki Orochimaru",
            "Nara Shikadai",
            "Akamichi Choco"
    };

    public static String[] heroDetails = {
            "Anak laki-laki Naruto dan Hinata, sehingga membuatnya anggota dari klan Uzumaki dan Hyuga. Mirip seperti ayahnya, Boruto adalah anak yang hiperaktif, pemberani, dan bandel. Bahkan dia juga sempat mengotori patung wajah Hokage. Dia melakukannya untuk mencari perhatian dari Naruto yang sibuk mengerjakan tugas-tugas Hokage.",
            "Himawari adalah anak kedua dari Naruto dan Hinata. Adik dari Boruto ini masih sangat kecil sehingga dia hanya berada dirumah saja. Namun ketika dia marah, Byakugan miliknya akan bangkit dan bisa membahayakan orang lain termasuk Naruto sendiri, yang pernah pingsan dalam satu kali pukulan saja ketika marah. Himawari belum menunjukkan semua kekuatannya, namun dilihat dari mata Byakugan sehari-harinya.",
            "Dari namanya juga sudah ditebak anak siapa ini. Iya, Rock Lee dan Tenten menikah dan kini memikiki seorang anak yang diberi nama Metal Lee. Sepertinya Kishimoto Sensei bermain kata kata di nama Rock yang kemudian Metal. Selain itu, Metal Lee juga merupakan salah satu karakter di komik dan anime Boruto terkuat yang membantu desa Konoha. Unjuk gigi pertamanya adalah saat melawan Shinki di ujian Chuunin.",
            "Shinki adalah anak adopsi Gaara. Masih belum tahu asal usul Shinki baik di masa lalu maupun di masa perang Shinobi. Kemampuan menakutkan dari Shinki adalah kemampuannya untuk mengendalikan pasir magnet dan juga tidak menutup kemungkinan jika suatu saat nanti akan memiliki kemampuan yang meningkat untuk mengendalikan besi. Kekuatan yang menakutkan itu bahkan bisa melebihi kekuatan Gaara suatu saat nanti dan menjadi salah satu karakter Boruto terkuat selanjutnya.",
            "Sarada Uchiha adalah anak dari Sasuke Uchiha yang merupakan penerus klan Uchiha setelah Sasuke menjadi yang terakhir. Sarada Uchiha sebagai salah satu keturunan klan Uchiha tentunya memiliki mata yang serupa seperti ayahnya ditambah kekuatan ibunya yakni Sakura Haruno terutama dalam kemampuan mengontrol Chakra. Sarada sangat mengagumi ayahnya, dan dia juga telah membangkitkan mata Sharingannya jauh sebelum Sasuke dulu menguasainya. Sarada menggunakan sebuah kacamata yang merupakan hadiah dari Karin, teman Sasuke selama berkelana sebagai grup Taka.",
            "yudo merupakan salah satu karakter Boruto terkuat yang berasal dari Sunagakure. yudo sendiri merupakan anak dari Gaara sehingga dia mampu mengendalikan pasir. Namun sepertinya yudo belum banyak mengeluarkan jurusnya, hanya saja jika melihat ayahnya sudah bisa diduga lah kekuatan macam apa yang dimiliki.",
            "Melihat nama Yamanaka pada nama Inojin akan mengingatkan kita pada sosok Ino Yamanaka yang merupakan bekas rival Sakura. Inojin Yamanaka memang adalah anak dari Ino Yamanaka yang tentunya memiliki kemampuan khas Yamanaka dalam pengendalian pikira atau tubuh. Namun siapa ayahnya? Ayahnya adalah Sai yang dulu sempat bergabung dengan tim 7 bersama Naruto. Bisa dibayangkan kekuatan Inojin yang menurunkan jurus menggambar dari ayahnya dan juga kontrol pikiran dari ibunya?.",
            "Anak perempuan Kurenai dan Asuma. Dulunya dititipkan pada Shikamaru, dia sekarang sudah tumbuh besar menjadi seorang Jonin. Belum banyak yang diketahui tentang Mirai, namun dikatakan dia punya kemampuan yang hebat seperti orang tuanya. Salah satunya adalah kekuatan membuat Pisau Chakra dan mengeluarkan jurus Demonic Illusion: Tree Binding Death.",
            "Dari segi fisik, Mitsuki memiliki kemiripan dengan Orochimaru. Namun dia bukanlah anak biologisnya. Mitsuki diciptakan dari DNA Orochimaru. Latar belakangnya tetap menjadi misteri dalam serial ini namun sepertinya Mitsuki bukan menjadi tokoh antagonis di serial Boruto. Kemampuan spesialnya yang menakutkan adalah dia bisa menggunakan Sage Mode pada usia sangat muda. Selain itu belum lagi dia juga bisa melakuka beberapa summon hewan ninja legendaris yang membutuhkan banyak chakra",
            "Anak laki-laki Shikamaru dan Temari ini adalah rival dari Boruto. Sifatnya sama persis seperti sang ayah: pemalas dan suka sok tahu. Shikadai dianggap sebagai jenius di antara Klan Nara, karena mewarisi kecerdasan ayahnya dan memiliki darah Klan Kazekage. Dia juga tampak telah menguasai Jutsu Bayangan keluarga Nara yang sempat membuat Boruto kewalahan di ujian Chuunin.",
            "Sahabat dekat Sarada yang memiliki ciri khas berkulit gelap serta bertuuh tambun ini merupakan Anak perempuan Choji dan Karui dari KumogakureAkimichi yang merupakan penerus klan Akimichi. Klan Akimichi memiliki jurus rahasia yang menakutkan yakni dapat memanipulasi ukuran tubuh mereka. Hanya saja dulu Choji membutuhkan pil warna tradisional untuk melakukan transformasi jurus tersebut dan kini anaknya yakni Choco Akimichi bisa melakukannya secara instan tanpa bantuan dari pil warna."
    };

    public static int[] heroesImages = {
            R.drawable.uzumaki_boruto,
            R.drawable.uzumaki_himawari,
            R.drawable.metal_lee,
            R.drawable.shinki,
            R.drawable.uchiha_sarada,
            R.drawable.yudo,
            R.drawable.inojin,
            R.drawable.mirai_sarutobi,
            R.drawable.mitsuki_orochimaru,
            R.drawable.nara_shikadai,
            R.drawable.akamichi_choco

    };

    public static ArrayList getListData() {
        ArrayList<Anime> list = new ArrayList<>();
        for (int position = 0; position < heroNames.length; position++) {
            Anime anime = new Anime();
            anime.setName(heroNames[position]);
            anime.setDetail(heroDetails[position]);
            anime.setPhoto(heroesImages[position]);
            list.add(anime);
        }
        return list;
    }
}
