package com.academy.lessons02;

public class Track {
    public static void main(String[] args) {
        String[] tracks = {
                "track_01", "track_03", "track_21", "track_15",
                "track_12", "track_99", "track_11", "track_10"
        };
        filterTrack(tracks);

        String str = "Ivan_Ivanov";
        String firstName = str.substring(5); // Ivan
        String lastName = str.substring(0,4); // Ivanov
        System.out.println(firstName);
        System.out.println(lastName);

        String strDemo = "    Ivan      ";
        System.out.println(strDemo.trim());

        String[] parts = str.split("_");
        String firstName2 = parts[0];
        String lastName2 = parts[1];

        String strDemo2 = " Ivan , Ivanov ";
        System.out.println(strDemo2.trim());

        //String strDemo2Normalized str.replaceAll()

    }

    public static void filterTrack(String[] tracks) {
        for (int i = 0; i < tracks.length; i++) {
            String digits1 = tracks[i].substring(6);
            String digits = cutLastDigits4(tracks[i]);
            //System.out.println(digits);
            //System.out.println(tracks[i]);
            int number = Integer.parseInt(digits);
            if (number >= 10 && number <= 15) {
                System.out.println(tracks[i]);

            }

        }
    }

    public static String cutLastDigits(String track) {
        // track.substring();
        return track.substring("track_".length());
    }

    public static String cutLastDigits2(String track) {
        int index = track.indexOf("_");
        return track.substring("track_".length());
    }

    public static String cutLastDigits3(String track) {
        int index = track.length() - 2;
        return track.substring(index);

    }

    public static String cutLastDigits4(String track) {

        return track.replaceFirst("track_", "");
    }
}