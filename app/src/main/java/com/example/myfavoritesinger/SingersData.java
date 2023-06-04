package com.example.myfavoritesinger;

import java.util.ArrayList;

public class SingersData {
    private static String[] singerNames = {
            "Ariana Grande",
            "Billie Eilish",
            "Christina Perri",
            "Ed Sheeran",
            "Justin Bieber",
            "Lauv",
            "Miley Cyrus",
            "Selena Gomez",
            "Shawn Mendes",
            "Taylor Swift"
    };

    private static String[] singerDetails = {
            "Ariana Grande-Butera lahir pada tanggal 26 Juni 1993 adalah seorang penyanyi, penulis lagu, dan pemeran asal Amerika Serikat. Dia memulai kariernya pada tahun 2008 di drama musikal Broadway berjudul 13, sebelum memerankan Cat Valentine di serial televisi Nickelodeon Victorious (2010 - 2013) dan di spinoff Sam & Cat (2013 - 2014). Dia juga pernah tampil di berbagai teater dan peran televisi dan telah mengisi suara di beberapa serial televisi dan film.",
            "Billie Eilish Pirate Baird O'Connell lahir pada tanggal 18 Desember 2001 adalah seorang penyanyi dan penulis lagu asal Amerika Serikat. Pada 2016, Eilish merilis single debutnya, 'Ocean Eyes' yang kemudian menjadi viral. EP Debutnya 'Don't Smile at Me' dirilis pada bulan Agustus tahun 2017. Menyusul kesuksesan EP, Apple Music menamai Eilish sebagai artis Up Next terbarunya pada September 2017. Album studio debutnya, When We All Fall Asleep, Where Do We Go? dirilis pada 29 Maret 2019.",
            "Christina Judith Perri lahir 19 Agustus 1986 adalah seorang penyanyi-penulis lagu asal Philadelphia, Amerika Serikat. Debut singlenya ‘Jar of Hearts’ berada di tangga lagu setelah muncul di acara televisi Fox So You Think You Can Dance pada 2010. Single itu terjual lebih dari 3 juta kopi di Amerika Serikat dan menjadi hit di seluruh dunia. Di Inggris, lagu ini berada di nomor tiga pada tangga lagu dan berada 3 bulan di UK Top 40. Beberapa bulan kemudian, Perri merilis extended play pertamanya, The Ocean Way Sessions.",
            "Edward Christopher Sheeran, MBE lahir 17 Februari 1991 adalah seorang penyanyi, penulis lagu, gitaris, produser rekaman, dan aktor berkebangsaan Inggris. Sheeran lahir di Halifax, West Yorkshire, dan dibesarkan di Framlingham, Suffolk. Dia memasuki Academy of Contemporary Music di Guildford sebagai seorang sarjana pada usia 18 tahun di 2009. Pada awal tahun 2011, Sheeran secara independen merilis sebuah extended play berjudul No. 6 Collaborations Project.",
            "Justin Drew Bieber lahir 1 Maret 1994 adalah seorang penyanyi dan penulis lagu berkebangsaan Kanada. Setelah manajer pencarian bakat Scooter Braun menemukannya melalui video-video YouTube-nya, ketika sedang menyanyikan ulang lagu pada tahun 2008, ia lalu dikontrak oleh RBMG, Bieber merilis album mini debutnya, My World, pada akhir tahun 2009. Album ini disertifikasi platinum di Amerika Serikat. Bieber menjadi artis pertama yang mempunyai tujuh lagu dari rekaman debut di tangga lagu Billboard Hot 100. Bieber merilis album studio penuh pertamanya, My World 2.0, pada tahun 2010. Album ini debut di atau hampir di nomor satu di beberapa negara, disertifikasi tiga kali platinum di Amerika Serikat, dan menghasilkan single 'Baby'.",
            "Ari Staprans Leff lahir 8 Agustus 1994, yang dikenal secara profesional sebagai Lauv, adalah penyanyi, penulis lagu, dan produser rekaman Amerika yang berbasis di Los Angeles. Debutnya EP Lost in the Light rilis pada tahun 2015 dan album kompilasinya, I Met You When I Was 18 (The Playlist) juga rilis pada 2018. Ia telah menulis lagu untuk artis lain termasuk single 'Boys' milik Charli XCX, 'No Promises' milik Cheat Codes, Demi Lovato dan terakhir 'Imperfections' milik Celine Dion. Album studio debutnya 'How I'm Feeling' dirilis 6 Maret 2020.",
            "Miley Ray Hemsworth dengan nama lahir Destiny Hope Cyrus lahir 22 November 1992 adalah seorang penyanyi, penulis lagu, dan aktris berkebangsaan Amerika Serikat. Setelah memainkan peran kecil di serial televisi berjudul Doc dan di film berjudul Big Fish saat masih anak-anak, dia menjadi seorang idola remaja pada tahun 2006, berperan di serial televisi Disney Channel Hannah Montana sebagai Miley Stewart. Ayahnya, musisi Billy Ray Cyrus, juga membintangi serial ini, yang tayang sampai empat musim sampai tahun 2011.",
            "Selena Marie Gomez lahir 22 Juli 1992 adalah seorang penyanyi, aktris, pebisnis dan produser berkebangsaan Amerika Serikat. Setelah tampil di serial televisi anak-anak Barney & Friends, dia semakin dikenal atas perannya sebagai Alex Russo di serial televisi Disney Channel Wizards of Waverly Place, yang tayang sampai empat musim dari tahun 2007 sampai 2012.",
            "Shawn Mendes lahir 8 Agustus 1998 adalah seorang penyanyi, penulis lagu berkebangsaan Kanada. Shawn Mendes mendapatkan pengikut pada tahun 2013, setelah mengupload cover lagu di aplikasi berbagi video Vine. Pada tahun berikutnya, dia menarik perhatian manajer artis Andrew Gertler dan A&R dari Island bernama Ziggy Chareton, yang membuatnya dikontrak di perusahaan rekaman ini. Dia sudah merilis tiga album studio, mengadakan tiga tur dunia, dan menerima berapa nominasi dan penghargaan.",
            "Taylor Alison Swift atau yang biasa dikenal dengan nama panggung Taylor Swift lahir 13 Desember 1989 adalah seorang penyanyi-penulis lagu berkebangsaan Amerika Serikat. Penulisan lagu naratifnya, yang sering berpusat di sekitar kehidupan pribadinya, telah menerima pujian kritis dan liputan media yang luas. Lahir di West Reading, Pennsylvania, Taylor Swift pindah ke Nashville, Tennessee pada usia 14 tahun untuk mengejar kariernya di musik country. Album studio debutnya yang bernama sama seperti namanya merupakan album tahun 2000-an terlama yang berada di Billboard 200. Single ketiga album, 'Our Song', menjadikannya sebagai penyanyi termuda yang menulis sendiri dan membawakan sebuah lagu nomor satu di tangga lagu Billboard Hot Country Songs. Album studio kedua Swift, Fearless (2008), mengusung gaya country pop dan memenangkan Grammy Awards sebagai Album of the Year."
    };

    private static int[] singerImages = {
            R.drawable.ariana_grande,
            R.drawable.billie_eilish,
            R.drawable.christina_perri,
            R.drawable.ed_sheeran,
            R.drawable.justin_bieber,
            R.drawable.lauv,
            R.drawable.miley_cyrus,
            R.drawable.selena_gomez,
            R.drawable.shawn_mendes,
            R.drawable.taylor_swift
    };

    static ArrayList<Singer> getListData() {
        ArrayList<Singer> list = new ArrayList<>();
        for (int position = 0; position < singerNames.length; position++) {
            Singer singer = new Singer();
            singer.setName(singerNames[position]);
            singer.setDetail(singerDetails[position]);
            singer.setPhoto(singerImages[position]);
            list.add(singer);
        }
        return list;
    }
}
