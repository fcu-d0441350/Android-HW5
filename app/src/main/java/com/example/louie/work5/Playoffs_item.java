package com.example.louie.work5;

/**
 * Created by louie on 2017/5/1.
 */

public class Playoffs_item {
    public Playoffs_item(int host_id, int guest_id, String host_Name, String guest_Name, String host_score, String guest_score) {
        Host_id = host_id;
        Guest_id = guest_id;
        Host_Name = host_Name;
        Guest_Name = guest_Name;
        Host_score = host_score;
        Guest_score = guest_score;
    }

    int Host_id;
    int Guest_id;
    String Host_Name;
    String Guest_Name;
    String Host_score;
    String Guest_score;
    public int getHost_id() {
        return Host_id;
    }

    public void setHost_id(int host_id) {
        Host_id = host_id;
    }

    public int getGuest_id() {
        return Guest_id;
    }

    public void setGuest_id(int guest_id) {
        Guest_id = guest_id;
    }

    public String getHost_Name() {
        return Host_Name;
    }

    public void setHost_Name(String host_Name) {
        Host_Name = host_Name;
    }

    public String getGuest_Name() {
        return Guest_Name;
    }

    public void setGuest_Name(String guest_Name) {
        Guest_Name = guest_Name;
    }

    public String getHost_score() {
        return Host_score;
    }

    public void setHost_score(String host_score) {
        Host_score = host_score;
    }

    public String getGuest_score() {
        return Guest_score;
    }

    public void setGuest_score(String guest_score) {
        Guest_score = guest_score;
    }

}
