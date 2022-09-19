package com.elcin.spinnerproject;

import java.util.ArrayList;

public class User
{
    private static ArrayList<User> userArrayList = new ArrayList<>();

    private String id;
    private String name;

    public User(String id, String name)
    {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void initUsers()
    {
        User user1 = new User("0", "Büşra");
        userArrayList.add(user1);

        User user2 = new User("1", "Eda");
        userArrayList.add(user2);

        User user3 = new User("2", "Selin");
        userArrayList.add(user3);

        User user4 = new User("3", "Alaca");
        userArrayList.add(user4);

        User user5 = new User("4", "Metehan");
        userArrayList.add(user5);

        User user6 = new User("5", "Ayşin");
        userArrayList.add(user6);
    }

    public int getImage()
    {
        switch (getId())
        {
            case "0":
                return R.drawable.woman;
            case "1":
                return R.drawable.woman;
            case "2":
                return R.drawable.woman;
            case "3":
                return R.drawable.man;
            case "4":
                return R.drawable.man;
            case "5":
                return R.drawable.woman;
        }
        return R.drawable.woman;
    }

    public static ArrayList<User> getUserArrayList()
    {
        return userArrayList;
    }
}