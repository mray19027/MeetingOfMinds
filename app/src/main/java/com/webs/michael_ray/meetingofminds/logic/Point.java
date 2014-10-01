package com.webs.michael_ray.meetingofminds.logic;

import java.sql.Time;

/**
 * Created by asb on 30/09/14.
 */
public class Point {


    //Data
    //----------------------------------------------------------------------------------------------
    private String cat;
    private String name;
    private int icon;
    private int dir;
    private double dist;
    private double rate;
    private boolean fav;
    //----------------------------------------------------------------------------------------------


    //Constructors
    //----------------------------------------------------------------------------------------------
    public Point(){
        this(null, null, -1, -1, -1, -1, false);
    }

    /**
     * Constructs a Point.
     * @param cat category, such as "Food"
     * @param name name of the point, such as "Tom's Food Truck"
     * @param icon index of the icon, such as "1" for "R.drawable.ic_1"
     * @param dir direction of the point, relative to the current location
     * @param dist distance of the point, relative to the current location
     * @param rate rating of the point, from 0-5
     * @param fav whether the point is a favorite
     */
    public Point(
            String cat,
            String name,
            int icon,
            int dir,
            double dist,
            double rate,
            boolean fav){
        this.cat = cat;
        this.name = name;
        this.icon = icon;
        this.dir = dir;
        this.dist = dist;
        this.rate = rate;
        this.fav = fav;
    }

    public Point(
            int sid,
            double lat,
            double longitude,
            int category,
            int reports,
            String description,
            int rating,
            int votes,
            int uid,
            Time time
    ){
        //TODO

        /*
    private ArrayList<Point> convertToPoints(ResultSet data) throws SQLException{
        ArrayList<Point> points = new ArrayList<Point>();

        while (data.next()){
            points.add(
                    new Point(
                        data.getInt("sid"),
                        data.getDouble("lat"),
                        data.getDouble("long"),
                        data.getInt("type"),
                        data.getInt("reports"),
                        data.getString("description"),
                        data.getInt("rating"),
                        data.getInt("votes"),
                        data.getInt("uid"),
                        data.getTime("time")
                    )
            );
        }

        return points;
    }
         */



        /*

        //Get all the point IDs associated with the userID
        ResultSet subIds = query(
                "SELECT sid " +
                "FROM favorites " +
                "WHERE uid = '" + userId + "'"
        );

        //Container
        ArrayList<Point> points = new ArrayList<Point>();

        //Converts all favorite point IDs to the Java container
        while (subIds.next()){
            ResultSet pointData = query(
                    "SELECT * " +
                    "FROM submissions " +
                    "WHERE sid = '" + subIds.getInt("sid") + "'"
            );

            points.addAll(convertToPoints(pointData));
        }

        return points;
         */
    }
    //----------------------------------------------------------------------------------------------


    //Setters
    //----------------------------------------------------------------------------------------------
    public void setCat(String cat){
        this.cat = cat;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setIcon(int icon){ this.icon = icon; }

    public void setDir(int dir){
        this.dir = dir;
    }

    public void setRate(int rate){
        this.rate = rate;
    }

    public void setFav(boolean fav){
        this.fav = fav;
    }
    //----------------------------------------------------------------------------------------------


    //Getters
    //----------------------------------------------------------------------------------------------
    public String getCat(){
        return cat;
    }

    public String getName(){
        return name;
    }

    public int getIcon(){
        return icon;
    }

    public int getDir(){
        return dir;
    }

    public double getDist(){
        return dist;
    }

    public double getRate(){
        return rate;
    }

    public boolean getFav(){
        return fav;
    }
    //----------------------------------------------------------------------------------------------


}
