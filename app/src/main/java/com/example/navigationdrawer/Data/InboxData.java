package com.example.navigationdrawer.Data;

import com.example.navigationdrawer.R;

import java.util.ArrayList;

public class InboxData {

    private static  String[] subjek = {
            "Apa Itu Karya Monalisa?",
            "Di Balik Karya Seni The Scream",
            "Makna Dibalik Perjamuan Terkahir",
            "Siapa Tokoh Napoleon?",
            "Siapa Pelukis Salvador Dali?",
            "Siapa Tokoh Leonardo Da Vinci?",
            "Siapa Tokoh Pablo Picasso?",
            "Navigation Drawer",
            "Test Data",
            "Test Aplikasi"
    };

    private static String[] message = {
            "Lukisan setengah badan ini menggambarkan lukisan wanita yang tatapannya menuju pengunjung dengan ekspresi yang sering dideskripsikan sebagai enigmatik atau misterius.",
            "Lukisan ini melambangkan manusia modern yang tercekam oleh serangan angst (kecemasan eksistensial, dengan cakrawala yang diilhami oleh senja yang merah, yang dilihat setelah letusan Gunung Krakatau pada 1883.",
            "Bagi umat Kristen, perjamuan malam terakhir yang kemudian diulang-ulang dalam perjamuan kudus atau komuni di gereja-gereja adalah pengingat akan apa yang Yesus lakukan dan merayakan apa yang diterima dari pengorbanan-Nya.",
            "Kaisar Napoleon Bonaparte adalah seorang pemimpin militer dan politik Prancis yang menjadi terkenal saat Perang Revolusioner. Sebagai Napoleon I, dia adalah Kaisar Prancis dari tahun 1804 sampai tahun 1814, dan kembali pada tahun 1815.",
            "Salvador Domingo Felipe Jacinto Dalí i Domènech, 1st Marquess of Dalí de Púbol adalah salah satu pelukis terpenting dari Spanyol. Ia dikenal lewat karya-karyanya yang surealis.",
            "Leonardo di ser Piero da Vinci, yang lebih dikenal dengan nama Leonardo da Vinci, adalah seorang pelukis, pemahat/pematung, arsitek, penemu, ilmuwan, penulis, dan filsuf asal Italia pada masa Renaisans.",
            "Pablo Ruiz Picasso adalah seorang seniman yang terkenal dalam aliran kubisme dan dikenal sebagai pelukis revolusioner pada abad ke-20. Dia merupakan jenius seni yang cakap membuat patung, grafis, keramik, kostum penari balet sampai tata panggung.",
            "Navigation drawers provide access to destinations and app functionality, such as switching accounts. They can either be permanently on-screen or controlled by a navigation menu icon. Navigation drawers are recommended for: Apps with five or more top-level destinations.",
            "Test Data Berhasil Ditambahkan",
            "Aplikasi Berjalan dengan baik"
    };

    private static String[] time = {
            "5 minutes ago",
            "10 minutes ago",
            "15 minutes ago",
            "20 minutes ago",
            "25 minutes ago",
            "30 minutes ago",
            "35 minutes ago",
            "40 minutes ago",
            "45 minutes ago",
            "50 minutes ago",
            "55 minutes ago"
    };

    private static int[] image = {
            R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background
    };

    public static ArrayList<Inbox> getListData(){
        ArrayList<Inbox> list = new ArrayList<>();
        for (int position = 0; position < subjek.length; position++){
            Inbox inbox = new Inbox();
            inbox.setSubjek(subjek[position]);
            inbox.setMessage(message[position]);
            inbox.setTime(time[position]);
            inbox.setImage(image[position]);
            list.add(inbox);
        }
        return list;
    }
}
